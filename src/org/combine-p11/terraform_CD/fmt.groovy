package org.combine_p11.terraform_CD

class Fmt {
    def call(String path = "") {
        stage('Terraform Format') {
            sh "terraform fmt ${path}"
        }
    }
}
