# Selenium Development
Download Selenium Webdrivers

## Install Python Packages
```
pip3 install -r requirements.txt --user
```

## Create WebDriver Locations
```
SELENIUM_DRIVER_LOCATION="/opt/selenium/drivers"
sudo mkdir -p $SELENIUM_DRIVER_LOCATION
sudo mkdir $SELENIUM_DRIVER_LOCATION/{firefox,opera,chrome} 
```

## Firefox WebDriver
```
# https://github.com/mozilla/geckodriver/releases/
cd ~/Download
FEDORA_DRIVER="v0.31.0"
wget https://github.com/mozilla/geckodriver/releases/download/$FEDORA_DRIVER/geckodriver-$FEDORA_DRIVER-linux64.tar.gz
tar -zxvf geckodriver-$FEDORA_DRIVER-linux64.tar.gz
rm geckodriver-$FEDORA_DRIVER-linux64.tar.gz
sudo mv geckodriver $SELENIUM_DRIVER_LOCATION/firefox/ 
```

## Google Chrome Webdriver
```
# https://chromedriver.chromium.org/downloads
https://chromedriver.storage.googleapis.com/103.0.5060.53/chromedriver_linux64.zip
https://chromedriver.storage.googleapis.com/104.0.5112.29/chromedriver_linux64.zip
CHROME_VERSION="103.0.5060.53"
wget https://chromedriver.storage.googleapis.com/$CHROME_VERSION/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm chromedriver_linux64.zip
sudo mv chromedriver $SELENIUM_DRIVER_LOCATION/chrome/ 
```
