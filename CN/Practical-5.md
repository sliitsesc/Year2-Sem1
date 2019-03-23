### Task 1
a. Observe the above addressing table & assign IP addresses where necessary.

```
MALABE>
MALABE>enable
MALABE#conf term
Enter configuration commands, one per line.  End with CNTL/Z.
MALABE(config)#interface se0/0/1
MALABE(config-if)#ip add 192.168.234.9 255.255.255.252
MALABE(config-if)#no shut

%LINK-5-CHANGED: Interface Serial0/0/1, changed state to down
```

```
Router>
Router>enable
Router#conf ter
Enter configuration commands, one per line.  End with CNTL/Z.
Router(config)#interface se0/0/1
Router(config-if)#ip add 192.168.234.10 255.255.255.252
Router(config-if)#no shut

Router(config-if)#
%LINK-5-CHANGED: Interface Serial0/0/1, changed state to up

%LINEPROTO-5-UPDOWN: Line protocol on Interface Serial0/0/1, changed state to up
```

```
Router(config)#interface se0/1/0
Router(config-if)#ip add 192.168.234.13 255.255.255.252
Router(config-if)#no shut

%LINK-5-CHANGED: Interface Serial0/1/0, changed state to down
Router(config-if)#
```

```
Router>
Router>enable
Router#conf ter
Enter configuration commands, one per line.  End with CNTL/Z.
Router(config)#interface se0/0/0
Router(config-if)#ip add 192.168.234.14 255.255.255.252
Router(config-if)#no shut

Router(config-if)#
%LINK-5-CHANGED: Interface Serial0/0/0, changed state to up

%LINEPROTO-5-UPDOWN: Line protocol on Interface Serial0/0/0, changed state to up
```

```
Router(config)#interface fa0/0
Router(config-if)#ip add 192.168.10.97 255.255.255.224
Router(config-if)#no shut

Router(config-if)#
%LINK-5-CHANGED: Interface FastEthernet0/0, changed state to up

%LINEPROTO-5-UPDOWN: Line protocol on Interface FastEthernet0/0, changed state to up
```
b.    Enable RIP to the relevant routers
```
MALABE(config)#router rip
MALABE(config-router)#version 2
MALABE(config-router)#no auto-summary
MALABE(config-router)#network 192.168.10.0
MALABE(config-router)#network 192.168.234.4
MALABE(config-router)#network 192.168.234.8
```

```
Router(config)#router rip
Router(config-router)#version 2
Router(config-router)#no auto-summary
Router(config-router)#network 192.168.10.64
Router(config-router)#network 192.168.234.0
Router(config-router)#network 192.168.234.8
Router(config-router)#network 192.168.234.12

Router(config-router)#exit
Router(config)#interface se0/0/1
Router(config-if)#clock rate 64000
```

Password
```
Router>enable
Router#conf ter
Enter configuration commands, one per line.  End with CNTL/Z.
Router(config)#enable secret S$L1iT
```
