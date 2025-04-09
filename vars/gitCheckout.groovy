 def call(String git_branch = 'main', String git_credentails = null ,String git_url  = null) {
   echo "this is a git checkout shared library"
  checkout([$class: 'GITSCM',
                       branches: [[name: "${git_branch}"]], 
                        userRemoteConfigs: [[credentialsId:"${git_credentails}",
                       url: "${git_url}"]]])
            sh 'pwd; ls -lrt'
  
 }
