# Recruitment task skeleton code

Some of our technical interviewers are replacing whiteboard programming with a pair programming exercise.

It requires [Java 8](https://en.wikipedia.org/wiki/Java_8) and [Maven](https://en.wikipedia.org/wiki/Apache_Maven).

If you're an interview candidate, we encourage you to bring in your own laptop
set up the way you like and with the tools you like
so you don't have to use an unfamiliar operating system, IDE or set of shortcut keys.

If you can't bring a laptop that's fine, your interviewer can provide one -
but it will mean using the OS and IDE your interviewer uses.
Do let us know in advance if you have particular preferences.

The purpose of this repo is to help you check that you've got Java and Maven installed correctly.

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
