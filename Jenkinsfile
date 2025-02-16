node {
    stage('SCM Checkout') {
        git 'https://github.com/ducit196/demo'
    }
    stage('Compile-Package') {
        def mvnHome = tool name: 'Maven 3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    stage('SonarQ Analysis') {
        echo('1212')
    }
    stage('SonarQ Check') {
        echo('1212')

    }
    stage('Deploy to tomcat') {
        sshagent(['tomcat-dev']) {
            sh 'scp -o StrictHostKeyChecking=no target/*war ec2-user@172.31.40.111:/opt/tomcat8/webapps/'
        }
    }
}