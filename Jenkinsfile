//this is jenkins scripts
def stageTest() {
    stage("extended Test") {
        setBuildStatus("Running extended tests", 'PENDING')
        sh './gradle clean build test
    }
}
def stageClone() {
    stage('Clone From Github') {
        git branch: "${branchToBuild}", credentialsId: 'attractive-bot-ssh-key', url: 'git@github.ibm.com:attractive/attractive-app.git'
    }
}
node {
    retry(2) {
        stageTest()
    }
}