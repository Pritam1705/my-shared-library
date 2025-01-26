package org.combine_p11.terraform_CD

def call(string path="") {
    stage('Terraform apply or destroy') {
        if (params.action == "apply") {
            sh "terraform apply ${path}"
        } else if (params.action == "destroy") {
            sh "terraform destroy ${path}"
        } else {
            echo "Invalid action"
        }
    }
}
