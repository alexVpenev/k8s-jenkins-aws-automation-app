import os
import subprocess

os.system("docker rm -f spring-maven")
os.system("docker image rm spring-maven")
