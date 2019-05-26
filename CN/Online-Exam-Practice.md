Switch 2
```
enable
configure terminal
vlan 32
vlan name SLIIT

vlan 96
vlan name STUDENT

interface fa0/4
switchport mode trunk
exit

vtp domain SLIIT
vtp password 123
vtp mode server
```

Switch 3
```
enable 
configure terminal
interface f0/5
switchport mode trunk
exit

interface f0/6
switchport mode trunk
exit

vtp domain SLIIT 
vtp password 123
vtp mode client
```

node setup
```
interface f0/1
switchport mode access 
switchport access 32
exit


```