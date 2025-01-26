package org.combine_p11.terraform_CD

class Plan {
    def call(String path = "") {
        stage('Terraform Plan') {
            sh "terraform plan ${path}"
        }
    }
}
