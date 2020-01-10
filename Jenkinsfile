pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        svn(url: 'http://apsvn.newgen.co.in/svn/ap2/aproj2/CoE_Credit_Origination_System/Bank Albilad CLOS Islamic Work/Code/CI/SpringBootTest', changelog: true, poll: true)
      }
    }

    stage('Build') {
      steps {
        mavenSnapshotCheck(check: true)
      }
    }

    stage('SCA') {
      steps {
        withSonarQubeEnv 'admin'
        withSonarQubeEnv 'SonarQube'
      }
    }

    stage('Quality Gate') {
      steps {
        waitForQualityGate true
      }
    }

  }
}