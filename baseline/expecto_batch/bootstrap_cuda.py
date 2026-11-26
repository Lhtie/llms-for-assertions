"""Install NVIDIA's CUDA compiler components into a job-local directory."""
import argparse
import hashlib
import json
from pathlib import Path
import platform
import shutil
import subprocess
import tempfile
from urllib.request import urlopen


def install(destination):
    arch = {"x86_64": "linux-x86_64", "aarch64": "linux-sbsa"}.get(platform.machine())
    if platform.system() != "Linux" or arch is None:
        raise RuntimeError("Automatic CUDA setup supports Linux x86_64/aarch64 only")
    destination = Path(destination).resolve()
    base = "https://developer.download.nvidia.com/compute/cuda/redist/"
    with urlopen(base + "redistrib_12.8.0.json", timeout=120) as response:
        manifest = json.load(response)
    destination.parent.mkdir(parents=True, exist_ok=True)
    with tempfile.TemporaryDirectory(prefix=".cuda-install-", dir=destination.parent) as work:
        stage = Path(work) / "toolkit"
        stage.mkdir()
        for component in ("cuda_nvcc", "cuda_cudart", "cuda_cccl"):
            entry = manifest[component][arch]
            archive = Path(work) / (component + ".tar.xz")
            print("Downloading CUDA 12.8 component: " + component, flush=True)
            digest = hashlib.sha256()
            with urlopen(base + entry["relative_path"], timeout=120) as source, archive.open("wb") as target:
                while chunk := source.read(1024 * 1024):
                    digest.update(chunk)
                    target.write(chunk)
            if digest.hexdigest() != entry["sha256"]:
                raise RuntimeError("SHA256 mismatch: " + component)
            subprocess.run(["tar", "-xJf", str(archive), "--strip-components=1", "-C", str(stage)], check=True)
        subprocess.run([str(stage / "bin/nvcc"), "--version"], check=True)
        # Allow a retry after an interrupted install; only our private toolkit is merged.
        shutil.copytree(stage, destination, dirs_exist_ok=True, symlinks=True)
        (destination / "expecto-cuda-manifest.json").write_text(json.dumps(manifest, indent=2))
    print("CUDA compiler installed at " + str(destination), flush=True)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--destination", required=True)
    install(parser.parse_args().destination)
