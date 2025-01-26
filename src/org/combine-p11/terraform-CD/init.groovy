package org.combine_p11.terraform_CD

def call(string path="") {
    stage('Terraform Init') {
        sh "terraform init ${path}"
    }
}
