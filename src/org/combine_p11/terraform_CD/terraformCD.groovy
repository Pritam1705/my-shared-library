package org.combine_p11.terraform_CD

import org.combine_p11.common.*

class TerraformCD {
    def call(String url, String branch, String credentials, String path = "", String action) {
        def gitcheckout = new GitCheckout()
        def cleanWs = new CleanWs()
        def init = new Init()
        def validate = new Validate()
        def fmt = new Fmt()
        def plan = new Plan()
        def apply = new Apply()

        cleanWs.call()
        gitcheckout.call(url, branch, credentials)
        init.call(path)
        validate.call(path)
        fmt.call(path)
        plan.call(path)
        apply.call(path, action)
    }
}
