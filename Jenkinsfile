node {
    stage('SCM Checkout') {
        git 'https://github.com/ducit196/demo'
    }
    stage('Compile-Package') {
        def mvnHome = tool name: 'Maven 3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    stage('SonarQ Analysis') {
        }
    }
    stage('SonarQ Check') {
        }
    }
    stage('Deploy to tomcat') {
        sshagent(['tomcat-dev']) {
            sh 'scp -o StrictHostKeyChecking=no target/*war ec2-user@172.31.40.111:/opt/tomcat8/webapps/'
        }
    }
}