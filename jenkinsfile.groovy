node {
    stage("Pull Repo"){

    }
    stage('Build Image'){
        sh "parker version"    
    }
    stage("send notification to slack"){
        echo "Hello"
        
    }
    stage("send email"){
        echo "Hello"
}
