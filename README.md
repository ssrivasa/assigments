qliro-seleniumWD-assignment# How to run the Test #

**Prerequisite**
1. Java environment 
2. Maven 


**Note: Configure web-driver path and test email address.**
	

- Configure webdriver.
    - I developed this POC in mac.
    - I used ChromeDriver but you can choose other webdriver eg. Mozilla GeckoDriver 
    - So first download ChromeDriver from [http://chromedriver.chromium.org/downloads](http://chromedriver.chromium.org/downloads).
    - Copy your downloaded **chromedriver** file path.
    - Go to `qliro-seleniumWD-assignment\src\test\java\testcases\mytheresa\WebdriverSettings.java` file.
    - Paste the copied file path in `System.setProperty("webdriver.chrome.driver","Paste path here")`.
    - I have placed chromedriver withing the project at '/ChromeDriver/chromedriver'


	
Project is ready to run. Execute following commands and enjoy the automatic web-driver test.
- Go to project path in terminal. For example: C:\Users\User-Name\eclipse-workspace\E2EUserJourney>
- Run `mvn clean`
- Run `mvn compile`
- Run `mvn test`

You can find the test result in `qliro-seleniumWD-assignment\target\surefire-reports\index.html`.