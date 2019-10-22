def jobs = [
    [
        "build-job-name"                : "account-service/account-service-build",
        "build-short-name"              : "account-service-build",
        "source-job-displayName"        : "Account-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-account-service.git",
        "deployment-job-name"           : "account-service/account-service-deployment",
        "deployment-short-name"         : "account-service-deployment",
        "restart-job-name"              : "account-service/account-service-restart",
        "restart-short-name"            : "account-service-restart", 
        "sonar-job-name"                : "account-service/account-service-sonar",
        "sonar-short-name"              : "account-service-sonar",        
        "ecs-service-name"              : "account-service",
        "ecs-container-name"            : "account-service",
        "folder-name"                   : "account-service",
        "folder-displayName"            : "Account-Service"
    ]/*,
    [
        "build-job-name"                : "assessment-facade/assessment-facade-build",
        "build-short-name"              : "assessment-facade-build",
        "source-job-displayName"        : "Assessment-Facade",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-assessment-facade.git",
        "deployment-job-name"           : "assessment-facade/assessment-facade-deployment",
        "deployment-short-name"         : "assessment-facade-deployment",
        "restart-job-name"              : "assessment-facade/assessment-facade-restart",
        "restart-short-name"            : "assessment-facade-restart", 
        "sonar-job-name"                : "assessment-facade/assessment-facade-sonar",
        "sonar-short-name"              : "assessment-facade-sonar",        
        "ecs-service-name"              : "assessment-facade",
        "ecs-container-name"            : "assessment-facade",
        "folder-name"                   : "assessment-facade",
        "folder-displayName"            : "Assessment-Facade"
    ],
    [
        "build-job-name"                : "auditlog-datadrain-service/auditlog-datadrain-service-build",
        "build-short-name"              : "auditlog-datadrain-service-build",
        "source-job-displayName"        : "AuditLog-DataDrain-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-audit-log-data-drain-service.git",
        "deployment-job-name"           : "auditlog-datadrain-service/auditlog-datadrain-service-deployment",
        "deployment-short-name"         : "auditlog-datadrain-service-deployment",
        "restart-job-name"              : "auditlog-datadrain-service/auditlog-datadrain-service-restart",
        "restart-short-name"            : "auditlog-datadrain-service-restart", 
        "sonar-job-name"                : "auditlog-datadrain-service/auditlog-datadrain-service-sonar",
        "sonar-short-name"              : "auditlog-datadrain-service-sonar",        
        "ecs-service-name"              : "auditlog-datadrain-service",
        "ecs-container-name"            : "auditlog-datadrain-service",
        "folder-name"                   : "auditlog-datadrain-service",
        "folder-displayName"            : "AuditLog-DataDrain-Service"
    ],
    [
        "build-job-name"                : "auditlog-service/auditlog-service-build",
        "build-short-name"              : "auditlog-service-build",
        "source-job-displayName"        : "AuditLog-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-audit-log-service.git",
        "deployment-job-name"           : "auditlog-service/auditlog-service-deployment",
        "deployment-short-name"         : "auditlog-service-deployment",
        "restart-job-name"              : "auditlog-service/auditlog-service-restart",
        "restart-short-name"            : "auditlog-service-restart", 
        "sonar-job-name"                : "auditlog-service/auditlog-service-sonar",
        "sonar-short-name"              : "auditlog-service-sonar",        
        "ecs-service-name"              : "auditlog-service",
        "ecs-container-name"            : "auditlog-service",
        "folder-name"                   : "auditlog-service",
        "folder-displayName"            : "Auditlog-Service"
    ],
    [
        "build-job-name"                : "bu-service/bu-service-build",
        "build-short-name"              : "bu-service-build",
        "source-job-displayName"        : "BU-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-business-unit-service.git",
        "deployment-job-name"           : "bu-service/bu-service-deployment",
        "deployment-short-name"         : "bu-service-deployment",
        "restart-job-name"              : "bu-service/bu-service-restart",
        "restart-short-name"            : "bu-service-restart", 
        "sonar-job-name"                : "bu-service/bu-service-sonar",
        "sonar-short-name"              : "bu-service-sonar",        
        "ecs-service-name"              : "bu-service",
        "ecs-container-name"            : "bu-service",
        "folder-name"                   : "bu-service",
        "folder-displayName"            : "BU-Service"
    ],
    [
        "build-job-name"                : "examinee-service/examinee-service-build",
        "build-short-name"              : "examinee-service-build",
        "source-job-displayName"        : "Examinee-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-examinee-service.git",
        "deployment-job-name"           : "examinee-service/examinee-service-deployment",
        "deployment-short-name"         : "examinee-service-deployment",
        "restart-job-name"              : "examinee-service/examinee-service-restart",
        "restart-short-name"            : "examinee-service-restart", 
        "sonar-job-name"                : "examinee-service/examinee-service-sonar",
        "sonar-short-name"              : "examinee-service-sonar",        
        "ecs-service-name"              : "examinee-service",
        "ecs-container-name"            : "examinee-service",
        "folder-name"                   : "examinee-service",
        "folder-displayName"            : "Examinee-Service"
    ],
    [
        "build-job-name"                : "gl-service/gl-service-build",
        "build-short-name"              : "gl-service-build",
        "source-job-displayName"        : "GL-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-global-library-service.git",
        "deployment-job-name"           : "gl-service/gl-service-deployment",
        "deployment-short-name"         : "gl-service-deployment",
        "restart-job-name"              : "gl-service/gl-service-restart",
        "restart-short-name"            : "gl-service-restart", 
        "sonar-job-name"                : "gl-service/gl-service-sonar",
        "sonar-short-name"              : "gl-service-sonar",        
        "ecs-service-name"              : "gl-service",
        "ecs-container-name"            : "gl-service",
        "folder-name"                   : "gl-service",
        "folder-displayName"            : "GL-Service"
    ], 
    [
        "build-job-name"                : "identity-service/identity-service-build",
        "build-short-name"              : "identity-service-build",
        "source-job-displayName"        : "Identity-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-identity-service.git",
        "deployment-job-name"           : "identity-service/identity-service-deployment",
        "deployment-short-name"         : "identity-service-deployment",
        "restart-job-name"              : "identity-service/identity-service-restart",
        "restart-short-name"            : "identity-service-restart", 
        "sonar-job-name"                : "identity-service/identity-service-sonar",
        "sonar-short-name"              : "identity-service-sonar",        
        "ecs-service-name"              : "identity-service",
        "ecs-container-name"            : "identity-service",
        "folder-name"                   : "identity-service",
        "folder-displayName"            : "Identity-Service"
    ],
    [
        "build-job-name"                : "user-service/user-service-build",
        "build-short-name"              : "user-service-build",
        "source-job-displayName"        : "User-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-user-service.git",
        "deployment-job-name"           : "user-service/user-service-deployment",
        "deployment-short-name"         : "user-service-deployment",
        "restart-job-name"              : "user-service/user-service-restart",
        "restart-short-name"            : "user-service-restart", 
        "sonar-job-name"                : "user-service/user-service-sonar",
        "sonar-short-name"              : "user-service-sonar",        
        "ecs-service-name"              : "user-service",
        "ecs-container-name"            : "user-service",
        "folder-name"                   : "user-service",
        "folder-displayName"            : "User-Service"
    ],
    [
        "build-job-name"                : "scoring-reporting-facade/scoring-reporting-facade-build",
        "build-short-name"              : "scoring-reporting-facade-build",
        "source-job-displayName"        : "Scoring-Reporting-Facade",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-scoring-reporting-facade.git",
        "deployment-job-name"           : "scoring-reporting-facade/scoring-reporting-facade-deployment",
        "deployment-short-name"         : "scoring-reporting-facade-deployment",
        "restart-job-name"              : "scoring-reporting-facade/scoring-reporting-facade-restart",
        "restart-short-name"            : "scoring-reporting-facade-restart", 
        "sonar-job-name"                : "scoring-reporting-facade/scoring-reporting-facade-sonar",
        "sonar-short-name"              : "scoring-reporting-facade-sonar",        
        "ecs-service-name"              : "scoring-reporting-facade",
        "ecs-container-name"            : "scoring-reporting-facade",
        "folder-name"                   : "scoring-reporting-facade",
        "folder-displayName"            : "Scoring-Reporting-Facade"
    ],    
    [
        "build-job-name"                : "metrics-service/metrics-service-build",
        "build-short-name"              : "metrics-service-build",
        "source-job-displayName"        : "Metrics-Service",
        "source-job-git"                : "https://bitbucket.pearson.com/scm/qglobal2/qg2-metrics-service.git",
        "deployment-job-name"           : "metrics-service/metrics-service-deployment",
        "deployment-short-name"         : "metrics-service-deployment",
        "restart-job-name"              : "metrics-service/metrics-service-restart",
        "restart-short-name"            : "metrics-service-restart", 
        "sonar-job-name"                : "metrics-service/metrics-service-sonar",
        "sonar-short-name"              : "metrics-service-sonar",        
        "ecs-service-name"              : "metrics-service",
        "ecs-container-name"            : "metrics-service",
        "folder-name"                   : "metrics-service",
        "folder-displayName"            : "Metrics-Service",
        "deploymentType"                : "prod-only-deployment.jenkinsfile"
    ]  */                          
]

jobs.each{job -> createJob(job)}


def createJob(def jobDetails) {

    multibranchPipelineJob(jobDetails["build-job-name"]) {
        displayName(jobDetails["source-job-displayName"])
        branchSources {
            branchSource {
                source {
                    git {
                        remote(jobDetails["source-job-git"])
                        credentialsId('github-ci')
                        traits {
                            cleanBeforeCheckoutTrait()
                            localBranchTrait()
                        }
                    }
                }
            }
        }
        configure {
          def traits = it / sources / data / 'jenkins.branch.BranchSource' / source / traits
          traits << 'jenkins.plugins.git.traits.BranchDiscoveryTrait' {
            strategyId(3) // detect all branches
          }
        }    
        orphanedItemStrategy {
            discardOldItems {
                numToKeep(100)
            }
        }
    }

    pipelineJob(jobDetails["deployment-job-name"]) {
      concurrentBuild(false)        
      definition {
        cps {
          def scr = "def SERVICE_NAME='" + jobDetails["ecs-service-name"] + "';\n";
          scr = scr + "def CONTAINER_NAME='" + jobDetails["ecs-container-name"] + "';\n\n";

          def deploymentFile = './deployment.jenkinsfile'
          if(jobDetails.containsKey("deploymentType")){
            deploymentFile = jobDetails['deploymentType'] 
          }

          script(scr + readFileFromWorkspace(deploymentFile))
          sandbox()     
        }
      }
    }

    pipelineJob(jobDetails["restart-job-name"]) {
      concurrentBuild(false)        
      definition {
        cps {
          def scr = "def SERVICE_NAME='" + jobDetails["ecs-service-name"] + "';\n";
          script(scr + readFileFromWorkspace('./restart.jenkinsfile'))
          sandbox()     
        }
      }
    }

    pipelineJob(jobDetails["sonar-job-name"]) {
      concurrentBuild(false)
      definition {
        cps {
          def scr = "def BITBUCKET_URL='" + jobDetails["source-job-git"] + "';\n";
          script(scr + readFileFromWorkspace('./sonar.jenkinsfile'))
          sandbox()     
        }
      }
    }        


    folder(jobDetails["folder-name"]) {
        displayName(jobDetails["folder-displayName"])
        description('Folder containing all job related to ' + jobDetails["folder-displayName"])
        primaryView('Application')
        views {
            listView('Application') {
                jobs {
                    names(jobDetails["build-short-name"], jobDetails["sonar-short-name"])
                }
                columns {
                    status()
                    weather()
                    name()
                    lastSuccess()
                    lastFailure()
                }
            }
            listView('Deployments') {
                jobs {
                    names(jobDetails["deployment-short-name"], jobDetails["restart-short-name"])
                }
                columns {
                    status()
                    weather()
                    name()
                    lastSuccess()
                    lastFailure()
                }
            }
        }
    }

}