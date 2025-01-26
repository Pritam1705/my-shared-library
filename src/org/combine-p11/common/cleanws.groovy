package org.combine_p11.common

def call() {
    stage('Clean workspace') {
        cleanWs()
    }
}
