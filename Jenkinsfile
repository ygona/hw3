pipeline{
	agent any
	environment {
		DOCKERHUB_PASS = 'Yamini@2304'
	}
	stages{
		stage("Building the Student Survey Image"){
			steps{
				script{
					checkout scm
					sh 'rm -rf *.jar'
					sh 'mvn clean package'
					sh 'echo ${BUILD_TIMESTAMP}'
					
					sh "echo 'Yamini@2304' | docker login -u ygona --password-stdin"

					sh 'docker build -t ygona/surveyjar .'
				}
			}
		}
		stage("Pushing image to docker"){
			steps{
				script{
					sh 'docker push ygona/surveyjar'
				}
			}
		}
		stage("Deploying to rancher"){
			steps{
				script{
					// sh 'kubectl set image deployment/survey container-0=krishna1303/survey -n 645clusternamespace'
					sh 'kubectl rollout restart deploy deploy'
				}
			}
		}
	}
}
