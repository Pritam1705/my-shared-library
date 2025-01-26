package org.combine_p11.common

def call(string url, string branch, string credentials) {
    stage('Checkout') {
        git branch: branch, credentialsId: credentials, url: url
    }
}
