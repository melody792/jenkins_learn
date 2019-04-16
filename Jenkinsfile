//this is jenkins scripts
def stageTest() {
    stage("extended Test") {
        setBuildStatus("Running extended tests", 'PENDING')
        sh './gradle clean build test
    }
}

node {
    retry(2) {
        stageTest()
    }
}