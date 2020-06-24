# loadbalancing
Playground to see Load Balancer in Action for a Spring Boot Project.

### Install ha-proxy loadbalancer.
```
brew install haproxy

To have launchd start haproxy now and restart at login:
  brew services start haproxy
Or, if you don't want/need a background service you can just run:
  haproxy -f /usr/local/etc/haproxy.cfg
(base) neeraj:loadbalancing neeraj$ brew install haproxy
Updating Homebrew...
Warning: haproxy 2.1.7 is already installed and up-to-date
```
