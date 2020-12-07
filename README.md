# Selenium-testNg-Maven 

## Introduction
This Test Automation Framework is created using Java + Selenium Web Driver + TestNG+ Maven Page Object Model(POM). Which can be used across different web based applications.It is used to make the code more readable, maintainable, and reusable.

## Pre-requisite:
 1. Java<br/>
 2. Maven<br/>
 3. Browsers (Firefox, Chrome)<br/>

 
## Steps to clone execute the tests
 `git clone https:https://github.com/the-test-trove/Selenium-testNg-Maven.git` <br/>
 `cd Selenium-testNg-Maven`<br/>
 `mvn clean install`
 `mvn test`
 
## Screenshot:
* Take Screenshots On test failures Method will automatically capture & store the screenshots under /screenshots directory. The screenshot files will be named of the test method name.

## Reporting: 
* The framework produce index.html report. It resides in the same 'test-output. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.<br/>
* You can find emailable-report.html from test-output to email the test reports. As this is a html report you can open it with browser.
