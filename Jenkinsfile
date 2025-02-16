node {
    stage('SCM Checkout') {
        git 'https://github.com/ducit196/demo'
    }
    stage('Compile-Package') {
        def mvnHome = tool name: 'Maven 3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}