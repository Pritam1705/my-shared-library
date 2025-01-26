package org.combine_p11.terraform_CD

class Apply {
    def call(String path = "", String action) {
        stage('Terraform Apply or Destroy') {
            if (action == "Apply") {
                sh "terraform apply -auto-approve ${path}"
            } else if (action == "Destroy") {
                sh "terraform destroy -auto-approve ${path}"
            } else {
                error "Invalid action provided: ${action}"
            }
        }
    }
}
