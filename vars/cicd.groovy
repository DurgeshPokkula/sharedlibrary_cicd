def gitDownload(repo, branch = 'main')
{
    git branch: branch, url: "https://github.com/DurgeshPokkula/${repo}.git"
}
def buildArtifact()
{
    sh 'mvn package'
}
def deployTomcat(jobname,ip,context)
{
   sh  "scp /var/lib/jenkins/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}  
def executeSelenium(jobname)
{
   
    sh "java -jar /var/lib/jenkins/.jenkins/workspace/${jobname}/testing.jar"
}
