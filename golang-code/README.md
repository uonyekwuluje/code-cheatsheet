# Golang Development
This is a cheatsheet for my golang application development

## Install Golang
```
GOVERSION="1.18"
sudo rm -Rf /usr/local/go
sudo wget https://dl.google.com/go/go${GOVERSION}.linux-amd64.tar.gz
sudo tar -C /usr/local -xzf go${GOVERSION}.linux-amd64.tar.gz
sudo rm go${GOVERSION}.linux-amd64.tar.gz
/usr/local/go/bin/go version
```


## House Keeping
* `export GO111MODULE=on` : Set on/off as needed
* `go clean --modcache` : Clean your cache
