
---

# 📄 `lab2-jenkins.md`

```md
# LAB 2: Jenkins CI Pipeline

## Git Commands
git init  
git add src/  
git commit -m "src committed"  
git add pom.xml  
git commit -m "pom committed"  
git branch -M main  
git remote add origin <repo-url>  
git push -u origin main  

## Jenkins Setup
Open: http://localhost:8080  

Install Plugins:
- Git  
- Maven  
- Pipeline  
- TestNG  

Configure Tools:
- JDK17  
- Maven  

## Create Job
New Item → Freestyle Project  

## Configuration
Source Code → Git → repo URL  

Build Step:
clean install  

Post Build:
target/surefire-reports/*.xml  

## Run
Click → Build Now  

## Common Errors
- repo not cloning → wrong URL / private repo  
- build fail → check pom.xml  
- no test report → wrong path  

## Viva Lines
Jenkins = CI tool  
CI = automated build + test  
Pipeline = sequence of steps  