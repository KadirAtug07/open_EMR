pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Hello This is Kadir's pipeLine'
       checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'df90ef4e-c0f4-4225-b8dd-7e80de820e9c', url: 'https://github.com/KadirAtug07/open_EMR.git']]])
                      sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }
            }
    }
    post{
        always{
            junit(
                allowEmptyResults:true,
                testResults: 'test-reports/.xml')
            }
        }
    }