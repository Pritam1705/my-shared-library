package org.combine_p11.terraform_CD

class Validate {
    def call(String path = "") {
        stage('Terraform Validate') {
            sh "terraform validate ${path}"
        }
    }
}
