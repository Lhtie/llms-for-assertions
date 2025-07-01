import os
import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Collect generated natural language assertions.")
    parser.add_argument('--indir', type=str, required=True, help='Directory of the input')
    args = parser.parse_args()
    
    