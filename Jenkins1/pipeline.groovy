pipeline {
    agent any
    stages{
        stage ('checkout'){
            steps{
                sh 'rm -rf demo1 && git clone https://github.com/hothaifa96/demo1'
            }
        }
        stage ('Build'){
            steps{
                sh 'find .'
                sh 'python3 demo1/main.py'
            }
        }
        stage ('Testing'){
            steps{
                sh 'echo Testing'
            }
        }
        stage ('Build Image'){
            steps{
                sh 'echo Build Image'
            }
        }
        stage  ('Push Image'){
            steps{
                sh 'echo Push Image'
            }
        }
    }
}