package org.combine_p11.terraform_CD

def call(string path="") {
    stage('Terraform fmt') {
        sh "terraform fmt ${path}"
    }
}
