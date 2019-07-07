node{

stage('SCM checkout'){
 
  git 'git 'https://github.com/tcdmv/maven1.git''
}
stage('compile-package'){
sh'mvn test'
}
 stage('email-Notificatio'){
  mail bcc: '', body: 'this is an alert from Jenkins', cc: '', from: '', replyTo: '', subject: 'Jenkins Alert', to: '20testqa19@gmail.com'
 }

}
