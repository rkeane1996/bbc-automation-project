# bbc-automation-project

## How to run the automation tests

1) Locate the test runner in the test directory.
2) This will be our main test runner to run all the tests.
3) There is no configuration needed all you have to do is Run the class
4) You can specify the browser you wish to execute in
    - add env variable to run config = -Dbrowser.name=Chrome or FireFox
    - or you can just edit the value in the properties file
5) Test will begin to execute
6) Cucumber report can be found in the following directory
    - target/cucumber-html-report/report.html
    
NB: May have to have chrome/firefox already installed.