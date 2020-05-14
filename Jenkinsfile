pipeline {
    agent any
    environment {
        ECR_NAMESPACE ='585307327397.dkr.ecr.ca-central-1.amazonaws.com'
    }   
    stages {
        stage('Build AWS-CLI Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/q-deployment-support/awscli', 'aws-cli')
                    app.push("1.0")
                    app.push("latest")
                }    
            }
        }      
        stage('Build Products-Provider Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/qscoring/product-provider', 'products-provider')
                    app.push('1.0')
                    app.push("latest")                    
                }    
            }
        }          
        stage('Build Secrets-Provider Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/qglobal/secret-provider', 'secrets-provider')
                    app.push('1.0')
                    app.push("latest")                    
                }    
            }
        } 
        stage('Build Flyway-Scripts-Provider Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/qglobal/flyway-scripts-provider', 'flyway-scripts-provider')
                    app.push('1.0')
                    app.push("latest")                    
                }    
            }
        }         
        stage('Build JRE11 Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/qglobal/base-jre-11', 'jre11-base')
                    app.push('1.0')
                    app.push("latest")                    
                }    
            }
        }  
        stage('Build Slang Bundle Provider Image') {
            steps {
                script {
                    app = docker.build(env.ECR_NAMESPACE + '/qglobal/slang-bundle-provider', 'slang-bundle-provider')
                    app.push('1.0')
                    app.push("latest")                    
                }    
            }
        }                    
    }
}