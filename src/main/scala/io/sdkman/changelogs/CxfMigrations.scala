package io.sdkman.changelogs

import com.github.mongobee.changeset.{ChangeLog, ChangeSet}
import com.mongodb.client.MongoDatabase

@ChangeLog(order = "005")
class CxfMigrations {

  @ChangeSet(order = "001", id = "001_add_cxf_3_2_4", author = "r0b0")
  def migration001(implicit db: MongoDatabase) = {
    insertVersion(Version("cxf", "3.2.4", Some("UNIVERSAL"), "http://www.apache.org/dyn/closer.lua/cxf/3.2.4/apache-cxf-3.2.4.zip"))
    insertCandidate(Candidate("cxf", "CXF",
      "Apache CXF is an open source services framework. CXF helps you build and develop services using frontend programming APIs, like JAX-WS and JAX-RS. These services can speak a variety of protocols such as SOAP, XML/HTTP, RESTful HTTP, or CORBA and work over a variety of transports such as HTTP, JMS or JBI.",
      "3.2.4", "https://cxf.apache.org/", "UNIVERSAL"))
    setCandidateDefault("cxf", "3.2.4")
  }
}
