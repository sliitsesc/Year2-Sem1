### Set Router Clock rate

`Router> enable`  
`Router# configure terminal`   
`Router(config)# interface Se 0/0/0`   
`Router(config-if)# clock rate 64000`   
`Router(config-if)# exit`  

`Router# show running-config` - To display the configuration that is currently running
