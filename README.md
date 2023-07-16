# Order Creation Cycle Demo

## Overview
This project requires you to Install Java 8 or higher version.
Download and configure Intellij or any Java IDE of your choice.

## Instructions
downloading the project from GitHub and open your IDE and then open the project folder.
from your IDE, open the project.
building the project to make sure no missing files from the project.
to run the scenarios:
    - can run each feature file scenario separately from "src/main/resources/features" 
    - or open the runner class "src/test/java/org/example/testRunner/Runners.java" and just you can choose what u need to run by adding a tag at the beginning of each scenario and then adjusting the tag at the runner class, There is no limit in defining tags within the feature file. Based on your need, you can derive tags to be used and scenarios to be executed.
## Extras

Thanks for give me this chance to practice and learn.

building my project as below : 

- The Feature file "src/main/resources/features" contains feature files and scenarios (BDD) and these steps invoked the step definitions class.
- the step definitions class "src/test/java/org/example/stepDefs" contains all the steps to be executed and in steps classes just invoked the method they are already created at the pages classes, to be more readable and maintainable.
- then we have the pages classes "src/test/java/org/example/pages" that contain all the locators used based on screens to be more reusable,
and the methods used with these locators and all the actions done within the pages classes.
- the Hook class "src/test/java/org/example/stepDefs/Hooks.java" which are blocks of code that run before or after each scenario, Hooks allows us to better manage the code workflow and helps us to reduce the code redundancy. We can say that it is an unseen step, which allows us to perform our scenarios or tests
- the Runner class "src/test/java/org/example/testRunner/Runners.java" to build a Communication between Feature Files and StepDefinition Files, just a tool that is used to run or execute tests and export results. after each run a target folder will be generated automatically and contains all the test reports.


## Manual Task 
    - I created a feature file "src/main/resources/Manual Task", containing the scenarios with steps (BDD), a happy scenario, and another scenario that covers all other scenarios by applying the requirements to the submitted test data.