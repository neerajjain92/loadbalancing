#!/usr/bin/env bash
cd /Users/neeraj/Projects/github/neerajjain92/loadbalancing
sh kill-all-web-servers.sh
nohup java -jar -Dserver.port=8081 -Dspring.profiles.active=dev target/loadbalancing-0.0.1-SNAPSHOT.jar > log8081.log & echo $! > pid1.log
nohup java -jar -Dserver.port=8082 -Dspring.profiles.active=dev target/loadbalancing-0.0.1-SNAPSHOT.jar > log8082.log & echo $! > pid2.log
nohup java -jar -Dserver.port=8083 -Dspring.profiles.active=dev target/loadbalancing-0.0.1-SNAPSHOT.jar > log8083.log & echo $! > pid3.log
nohup java -jar -Dserver.port=8084 -Dspring.profiles.active=dev target/loadbalancing-0.0.1-SNAPSHOT.jar > log8084.log & echo $! > pid4.log
tail -f log8081.log
