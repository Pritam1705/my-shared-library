package org.combine_p11.terraform_CD

class Init {
    def call(String path = "") {
        stage('Terraform Init') {
            sh "terraform init ${path}"
        }
    }
}
