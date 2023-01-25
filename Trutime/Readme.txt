Trutime

Problem Statement : Verifing the Weekdays on Trutime.

Suggested Site : https://be.cognizant.com/

**********************************************************************************************************************************************************************************************************

Detailed Description: Main Project

Launch https://be.cognizant.com/ in a web browser.Maximize the window and enter email, password and otp.
Visiting the profile page and Printing the details of the Employee from the Be.Cognizant Profile page.
Search the Trutime in  search tab and click trutime from the searched result.
In Trutime application, first print expected weekdays in a week.
Now print dates of the current week that are being shown in the trutime.
Compare expected and actual result.


***************************************************************************************************************************************************************************************************

Steps to Run the Project


* Chrome Driver Version (98.0.4758.102 (64-bit))
* Microsoft Edge Version (98.0.1108.55 (64-bit))
* Handled Chrome,Edge Browser.(Due to space restriction not able to attached the drivers)
* Move the drivers in the folder (Trutime\resources\Drivers).
* Driver should have name (chromedriver)for chrome and (msedgedriver) for Edge .
* Import the project.
* Make changes in the config.properties file (Trutime\resources\testdata\config.properties)in line number 3 (chrome/edge) according to your choice to run the file in Browser
* Then run the testRunner.java file (Trutime\src\main\java\com\cucumberpom\Runner\testRunner.java) as testng
*Enter email, password.
*Enter otp from your microsoft authenticator mobile app.
* Refresh the project after the project is successfully Run.
* Report is generated and saved in cucumber folder (Trutime\target\cucumber).