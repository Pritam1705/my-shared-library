package org.combine_p11.terraform_CD

def call(string path="") {
    stage('Terraform apply or destroy') {
        if (params.action == "apply") {
            sh "terraform apply -auto-approve ${path}"
        } else if (params.action == "destroy") {
            sh "terraform destroy -auto-approve ${path}"
        } else {
            echo "Invalid action"
        }
    }
}
