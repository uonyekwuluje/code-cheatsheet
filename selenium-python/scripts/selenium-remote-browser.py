from selenium import webdriver
from selenium.webdriver.firefox.options import Options

def openChromeBrowser():
    chrome_options = webdriver.ChromeOptions()
    chrome_options.add_argument("--headless")
    driver = webdriver.Remote(
        command_executor = "http://192.168.1.138:4444/wd/hub",
        options = chrome_options
    )
    driver.get("http://www.google.com")
    driver.quit()  


def checkBrowser():
    chrome_options = webdriver.ChromeOptions()
    chrome_options.add_argument("--headless")
    driver = webdriver.Remote(
        command_executor = 'http://192.168.1.138:4444/wd/hub',
        options = chrome_options
    )
    driver.get("https://www.google.co.in/")
    print(driver.title)
    driver.quit()

def checkBrowserVersion():
    firefox_options = webdriver.FirefoxOptions()
    firefox_options.add_argument("--headless")
    driver = webdriver.Remote(
        command_executor = "http://192.168.1.138:4444/wd/hub",
        options = firefox_options
    )
   
    my_dict = driver.capabilities
    for key,val in my_dict.items():
        print (key, "=>", val)
    driver.quit()


#openChromeBrowser()
checkBrowser()
#checkBrowserVersion()
