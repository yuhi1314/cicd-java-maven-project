pipeline {
  agent any

  environment {
    registry = "yuhi1314/phpk8s"
    registryCredential = '188ab87c-8a6d-48c7-b5e8-34dc6e75e50a'
    dockerImage = ''
  }
  tools {
    jdk 'jdk11'
    maven 'maven'
  }

  stages {
    stage("Git Checkout") {
      steps {
        script {
          git branch: 'main', url: 'https://github.com/yuhi1314/cicd-java-maven-project.git'
        }
      }
    }

    stage("Maven Build") {
      steps {
        script {
          sh "mvn clean install -T 1C" // -T 1C is to make build faster using multithreading
        }
      }
    }
    
    stage("Test Cases") {
        steps {
           sh "mvn test"
            }
    }

    stage('Building our image') {
      steps {
        script {
          dockerImage = docker.build("${registry}:${BUILD_NUMBER}")
        }
      }
    }

    stage('Deploy our image') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
            dockerImage.push()
          }
        }
      }
    }

    stage("Apply the Kubernetes files") {
      steps {
        script {
          sh "kubectl apply -f kubernetes/"
        }
      }
    }
  }

  post {
    always {
      script {
        if (currentBuild.currentResult == 'FAILURE') {
          step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: "Test@test.com", sendToIndividuals: true])
        }
      }
    }
  }
}
