# AmazonIndiaWebAutomation
About the Framework:

Core Java is used as a language. I use Selenium Webdriver (3.141.59) to automate my browser.

I mainly built my project using MAVEN and TestNG.

Used "io.github.bonigarcia" dependency as automated driver management and Docker builder for Selenium WebDriver

I used POM Desing Pattern in order to keep my code organized and clean. ('Pages Package')

I created Tests Package for my test cases. There is 'TelevisionTests' class for my codes. 

I have another separate package for my UTILITIES where I would store all my drivers, page files or utilities that I could possibly run. ('utilities package')

So, other driver class I have CONFIGURATION READER which is connect the "properties.file". 

I store all important information in the "properties.file" such as URL, USERNAME and the PASSWORD and CONFIGURATION READER makes easier to reach that information.
