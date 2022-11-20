# imdbTask

Technology Used : Java, TestNG, Selenium, Maven, Allure

Framework Used: Page Object Model

Instructions on how to run tests


To run autotests need to install maven and java

how to install maven https://maven.apache.org/install.html 

how to install java https://www.java.com/en/download/help/download_options.html  
Java i used 19.0.1

To get reports in allure


Install last version of allure coomandline https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline

how to install allure https://docs.qameta.io/allure/#_installing_a_commandline


1.Easiest way open tests in IDE, run TechTaskTest class

2.Type in console mvn clean test (in IDE) or in concole where pom file is.

To get reports

Type in console allure serve C:\Users\HP\IdeaProjects\imdbTask\allure-results(Change path where project is)


My approach to this assignment


What did you choose to test, and why?

First case checks buttons that using in search function, because if there are no buttons - no tests.

Basically, I choose to create smoke tests that cover the functionality that most users will use:
Case with search by some part of the name, click on magnify btn check in the list of results movie we want to find and check that movie that opened - correct
Case with search by some part of the name, finding it in suggestions, click on it and checking that movie that opened - correct

And 2 cases negative where we are sending wrong name (which is search function cannot find) and empty request and checking page we got.
Those cases are important that we don't get some 404 page or some error or wrong response.


How are your files structured, and why?

All my Autotests have same idea, class and methods with adequate, understandable name so anyone understands what happens like mainPage. LogInBtnClick, and create a class with methods like helpers to reuse them in the future and not create same methods over and over.


How else might you have done things?

If I had in mind that there would be more tests, I would create page Object for all pages I use.
Because there would be a lot of different buttons and fields to write there, and there is more comfortable to work with less methods in class.


How might you expand on these tests in future?

More tests to use filtration like people or move, advance search etc.


How did you overcome any technical challenges you encountered?

A challenge that I met was about that you cannot predict which page you get when sending negative test case, so I used to try - catch to catch the exception and check
test data on a page.
