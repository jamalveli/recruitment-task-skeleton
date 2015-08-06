# Recruitment Task Skeleton Code

Hello, 

If you're reading this then you're probably applying for a developer role at Ocado Technology.  

Welcome! :)

At Ocado Technology, craftsmanship and collaboration are two of our core values.  Part of the interview process will involve you pairing up with one of our experienced developers to solve an interesting problem.  This is great for us because we get to see how you go about solving a problem collaboratively, and great for you because you get a taste of what it might be like to be part of Ocado Technology.

We encourage you to bring your own laptop.  You're probably going to have a better experience using tools you're familiar with; no sense in fighting with an unfamiliar keyboard or IDE!

To solve the problem, you will require [Java 8](https://en.wikipedia.org/wiki/Java_8) and [Maven](https://en.wikipedia.org/wiki/Apache_Maven). This GitHub project is here to help you ensure that these are installed correctly on your machine.

If you can't bring your own laptop, not to worry. We will provide one. You're welcome to let us know your preferences, but be warned: there is no guarantee that we'll be able to meet them!

[![Travis CI build status image](https://api.travis-ci.org/ocadotechnology/recruitment-task-skeleton.svg)](https://travis-ci.org/ocadotechnology/recruitment-task-skeleton)

## Checking you've got Java 8 and Maven installed correctly

When you clone this repo, in the directory containing the pom.xml you should be able to execute
`mvn clean test exec:java -Dexec.mainClass="tester.TestCsvLoad"`
and get output like the following:


```
$ mvn clean test exec:java -Dexec.mainClass="tester.TestCsvLoad"
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Java8/Maven Install Test 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ maven_install_test ---
[INFO] Deleting /home/mtandy/Documents/recruitmenttask/stripped-down/target
[INFO] 
[INFO] --- maven-resources-plugin:2.3:resources (default-resources) @ maven_install_test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/mtandy/Documents/recruitmenttask/stripped-down/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.0.2:compile (default-compile) @ maven_install_test ---
[INFO] Compiling 1 source file to /home/mtandy/Documents/recruitmenttask/stripped-down/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.3:testResources (default-testResources) @ maven_install_test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/mtandy/Documents/recruitmenttask/stripped-down/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.0.2:testCompile (default-testCompile) @ maven_install_test ---
[INFO] Compiling 1 source file to /home/mtandy/Documents/recruitmenttask/stripped-down/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ maven_install_test ---
[INFO] Surefire report directory: /home/mtandy/Documents/recruitmenttask/stripped-down/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running tester.CheckJunitWorksTest
Hello world from unit test!
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.026 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ maven_install_test ---
Hello world from csv loader!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.330s
[INFO] Finished at: Tue Aug 04 17:46:41 BST 2015
[INFO] Final Memory: 21M/348M
[INFO] ------------------------------------------------------------------------
```

The important lines are "Hello world from unit test!" and "Hello world from csv loader!"

If you can see both those lines, you have successfully installed Java and Maven!
