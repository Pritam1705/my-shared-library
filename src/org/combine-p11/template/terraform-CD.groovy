package org.combine_p11.terraform_CD

import org.combine_p11.terraform_CD.*
import org.combine_p11.common.*

def call(string url, string branch, string credentials, string path="") {
   def gitcheckout = new GitCheckout()
   def cleanWs   = new CleanWs()
   def init = new Init() 
   def validate = new Validate()    
   def fmt = new Fmt()
   def plan = new Plan() 
   def apply = new Apply()


   CleanWs.call()
   GitCheckout.call(url, branch, credentials)
   Init.call(path)
   Validate.call(path) 
   Fmt.call(path)
   Plan.call(path)
   Apply.call(path)




}

