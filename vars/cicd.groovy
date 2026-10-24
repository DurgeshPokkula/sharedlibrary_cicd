def gitDownload(repo, branch = 'main')
{
    git branch: branch, url: "https://github.com/DurgeshPokkula/${repo}.git"
}
def buildArtifact()
{
    sh 'mvn package'
}
