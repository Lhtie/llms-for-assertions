#!/usr/bin/env bash
set -euo pipefail
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

bash "$SCRIPT_DIR/ablation_generate.sh"
bash "$SCRIPT_DIR/ablation_problog_only.sh"
bash "$SCRIPT_DIR/ablation_conformance_only.sh"
bash "$SCRIPT_DIR/ablation_active_no_conformance.sh"
bash "$SCRIPT_DIR/ablation_conformance_direct.sh"
bash "$SCRIPT_DIR/ablation_conformance_simple.sh"
bash "$SCRIPT_DIR/ablation_conformance_bidir_nli.sh"
bash "$SCRIPT_DIR/ablation_conformance_no_context.sh"
