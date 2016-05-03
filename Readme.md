Who wouldn't like to monitor their hosts? Everyone does right. 
This sample app uses PubNub API to monitor a host. (PubNub api to transport the notification in fact)

Using the PubNub API to transfer the notification, we monitor the host to see if it is dead or alive. 

To execute: please run

java -cp pubnubmon-0.0.1-SNAPSHOT-jar-with-dependencies.jar pubnubmon.Publisher <hostname>

Replace <hostname> with the right host that you want to monitor. You should see a messge, that is being written by PubNub API on your console saying if your host is alive or dead. 


