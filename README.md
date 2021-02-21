# Introduction
## Presentation
This little test suite consists of a single test developed with Java, using Selenium Framework and the JUnit test engine. To better organise the code, the suite was created following the Page Objects Model, also generating a report with Allure.

## Getting started
### Pre-conditions
1. Make sure that you have Java 8 or newer installed and properly set in the environment variables of your system.
2. On the root of this project, you'll find the Chromedriver v 88 for MacOS x64. Replace it with the correct version for your OS and browser.
3. Close the repository into your desired folder and wait until your IDE indexes all files. I recommend using IntelliJ IDEA.

### Running tests
You can run the suite using either one of two methods: \
* Without generating a report:
  1. Open the test file found at `<src/test/java/com/sky/tests/CheckCurrentlyAiringProgrammeTest.java>`
  2. Click Play button found at the declaration of the class.
* Generating a report with Allure:
  1. At the root of the project, open a terminal and input ```mvn clean test allure:report```
  2. After the test finishes running, you can access an HTML version of the report by running the command ```mvn allure:serve```

## Test plan
### Functional tests
The test was created based on the requirement provided by the challenge. After a session-based exploratory test was performed, I decided not to create any other functional tests. As the web application is in production, so the risk of messing with a real business was greater than the benefits of exploring it a bit more. 
### Non-functional tests
* Performance: no performance tests that accessed service resources were executed for the reasons mentioned in the previous section.
  * Front-end performance: using Google PageSpeed Insights, I analysed the performance of the front-end scripting, which yielded the results: 
    * For desktop, the website received a medium performance with a rating of 52/100.\
  ![Desktop report1](/report/pageInsights/skydesktop1.png)\
  ![Desktop report1](/report/pageInsights/skydesktop2.png)\
  ![Desktop report1](/report/pageInsights/skydesktop3.png)
    * For mobile, the website was rated very poorly, receiving only 18/100, impacting the experience of users who mainly use their phones.\
  ![Mobile report1](report/pageInsights/skymobile1.png)\
  ![Mobile report1](report/pageInsights/skymobile2.png)\
  ![Mobile report1](report/pageInsights/skymobile3.png)
  * Accessibility: using Axe Accessibility to assess the website, a total of 46 issues were found in the Home. As for the Programação page, the numbers is far greater, with 268 issues found.\
  ![A11y Home](report/a11yReport/skyHomepageA11y.png)\
  ![A11y Programacao](report/a11yReport/skyProgramacaoA11y.png)

You can find these reports in the `report` folder inside the root of the project. Both Axe and PageSpeed Insights offer suggestions on how to solve/improve the website.