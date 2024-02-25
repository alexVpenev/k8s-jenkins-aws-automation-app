import os
import subprocess

os.system("./mvnw clean install")
os.system("docker build -t spring-maven .")
#os.system("docker run -p 8080:8080 --name spring-maven spring-maven")
os.system("docker run --env-file=.env -p 8080:8080 --name spring-maven spring-maven")
