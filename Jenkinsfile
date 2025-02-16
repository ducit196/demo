node {
    stage('SCM Checkout') {
        git 'https://github.com/ducit196/demo'
    }
    stage('Compile-Package') {
        sh 'mvn clean package'
    }
}