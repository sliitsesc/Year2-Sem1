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