from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

firefox_driver = "/opt/selenium/drivers/firefox/geckodriver"
chrome_driver = "/opt/selenium/drivers/chrome/chromedriver"
   
#set chromodriver.exe path
#driver = webdriver.Chrome(executable_path = chrome_driver)
driver = webdriver.Chrome(executable_path = chrome_driver)

driver.implicitly_wait(0.5)
#launch URL
driver.get("https://www.google.com/")
#identify search box
m = driver.find_element("name","q")
#enter search text
m.send_keys("Tutorialspoint")
time.sleep(0.2)
#perform Google search with Keys.ENTER
m.send_keys(Keys.ENTER)
