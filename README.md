# Rebuilding the docker image

Any source code changes will require re-building the docker image and pushing
it to docker hub. The [CHTC
guide](https://chtc.cs.wisc.edu/uw-research-computing/docker-build) has
information about how to do it, but it boils down to specifying "tagging" the image
when building with a username, image name, and optional (but highly recommended) tag.

```bash
docker build -t username/imagename:tag .
docker push
```

CHTC will cache the docker images that get used. The side effect of this caching
is that re-using tags can cause stale images to be used in job executions. The
recommendation is to create a new tag for each docker build, and update
the tag in the submit file.

