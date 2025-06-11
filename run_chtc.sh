#!/bin/bash

# Set environmental variables, create directories, or do any other preparation
unzip deepseek-coder-6.7b-instructD.zip

# Permissions may be tricky depending on the application logic.
# One option is to copy the source code from /app to the current working
# directory and run it from here
rsync -av --exclude='run_chtc.sh' /app/ ./

# run the main python script. Add arguments as needed.
/bin/bash run.sh
