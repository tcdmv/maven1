node{

stage('SCM checkout'){
  tool name: 'Default', type: 'git'
  tool name: '', type: 'maven'
  git 'https://github.com/tcdmv/maven1/tree/master/Annotations'
}
stage('compile-package'){
sh'mvn package'
}

}
