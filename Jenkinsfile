pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/roussi/ketoyoda.git', branch: 'master', changelog: true, credentialsId: 'roussi', poll: true)
      }
    }

  }
}
