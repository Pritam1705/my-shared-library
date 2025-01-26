package org.combine_p11.terraform_CD

def call(string path="") {
    stage('Terraform plan') {
        sh "terraform plan ${path}"
    }
}
