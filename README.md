# TestingTravisCI
Using this test Travis CI integration for unittests

Using POM.xml and a maven project to generate the dependancies for the junit and to run the tests using the travis CI and build and test using maven. 

Requires: pom.xml, junit dependancy in pom.xml, ensure there are sourceDirectory is different from testSourceDirectory, and that the .travis.yml file has language correct and the correct scripts to run.  
