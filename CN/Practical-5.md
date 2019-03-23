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

