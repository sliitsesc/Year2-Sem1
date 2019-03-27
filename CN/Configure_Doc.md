### Set Router Clock rate

`Router> enable`  
`Router# configure terminal`   
`Router(config)# interface Se 0/0/0`   
`Router(config-if)# clock rate 64000`   
`Router(config-if)# exit`  

`Router# show running-config` - To display the configuration that is currently running     
`Router#copy running-config startup-config` - To save all configurations

### Static Route
`ip route <DESTINATION NETWORK> <DESTINATION NETWORK SUBNET MASK> <NEXT HOP ADDRESS>`      

### Default Routing
`ip address 0.0.0.0 0.0.0.0 <NEXT STOP IP>`

### Dynamic Routing
`router rip`    
`version 2` 
`no auto-summary` 
`network <DIRECTLY CONNECTED NETWORK IP>`         

### To reset Password
`no enable password`        
`enable secret <SECRET PASSWORD>`       
`enable secret <SECRET PASSWORD>`         
