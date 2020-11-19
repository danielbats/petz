# Petz Automation Challange
Repo created to share the automation challange for Petz

# Setting up the environment
1. For Java: Download the Java SE Development Kit 8 and install it locally. Use the following URL: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

2. For IDE: Download the latest version of IntelliJ IDEA Community through the following URL: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC

3. For drivers: Download the chromedriver version which matches with your Google Chrome browser version through the following URL: https://chromedriver.storage.googleapis.com/index.html?path=85.0.4183.87/ **(It's recommended to use the 85.0 version)**
    * 3.1 Extract the zip file into the following local path: _**C:\drivers**_
    * 3.2 Add the mentioned path into your ENVIRONMENT PATH VARIABLES

4. Download the repository as ZIP file, extract it in somewhere you want to and then open it as a maven project in IntelliJ IDEA.

5. Open the **_pom.xml_** file and then click on **_Maven_** option on the right top of the window. Then click on **_Reload All Maven Projects_** (refresh button) in order to load all dependencies properly.

6. You can run each feature file individually or use the _Runner_ class in runner package to run all the features consecutively. 

# About the project

## Scenarios
I chose three scenarios that I consider are important to automate. I didn't create a purchase scenario because since the http://petz.com.br is a production env, it wouldn't be a good approach generate billets and do not pay them. The scenarios are following:
* Create an account
* Log into existent account
* Search and add products to the chart

## API
I chose just one endpoint to hit because this required API doesn't allow to explore the HTTP verbs. I can only use GET requests, so that's why I created just one scenario for it.
* Get the current weather using the City and Country names


Please, let me know if there's something I can do to help you guys to run it successfully. 

Thanks in advance!
