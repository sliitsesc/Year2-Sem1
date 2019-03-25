# Tutorial 2

### 1. Briefly explain the computer boot up process using a diagram.

![](http://www.eclubfoundation.com/efansmart/JSS1/ckuploader.php?action=viewimage&image=Ym9vdHByb2Nlc3N0ZXN0MjcyOGUwMTIuanBn)

### 2. Compare and contrast the asymmetric multiprocessing and symmetric multiprocessing.
* ![](https://techdifferences.com/wp-content/uploads/2016/09/Symmetric-Multiprocessing-Vs-Asymmetric-Multiprocessing.jpg)

| Basis         | Symmetric           | Asymetric  |
| ------------- |:--------------------:| --------------:|
| Basic         | Each processor run the tasks in Operating System.  | Only Master processor run the tasks of Operating System. |
| Process     | Processor takes processes from a common ready queue, or there may be a private ready queue for each processor.     |   Master processor assign processes to the slave processors, or they have some predefined processes. |
| Architecture | All processor in Symmetric Multiprocessing has the same architecture.      |    All processor in Asymmetric Multiprocessing may have same or different architecture. |
|     Communication          |  All processors communicate with another processor by a shared memory.             |   Processors need not communicate as they are controlled by the master processor.    |
|     Failure          |       If a processor fails, the computing capacity of the system reduces.        |    If a master processor fails, a slave is turned to the master processor to continue the execution. If a slave processor fails, its task is switched to other processors.   |
|       Ease        |       Symmetric Multiprocessor is complex as all the processors need to be synchronized to maintain the load balance.        |    Asymmetric Multiprocessor is simple as master processor access the data structure.   |

### 3. What is a clustered system? What is the main advantage of clustered system?

The clustered systems are a combination of hardware clusters and software clusters. The hardware clusters help in sharing of high performance disks between the systems. The software clusters makes all the systems work together.

Pros - 
* Performance
* Fault tolerance
* Scalability

### 4. What is virtual machine? What are the advantages of virtual machine?

A virtual machine acts as an emulator of a computer. It is an operating system (OS) or application environment that is installed on software, which imitates dedicated hardware.

Pros - 
* Multiple OS in same computer
* Less physical harddware
* Disaster recovery is quick

### 5. What is push migration in symmetric multiprocessor system?

Load Balancing is the phenomena which keeps the workload evenly distributed across all processors in an SMP system. ... Pull Migration – Pull Migration occurs when an idle processor pulls a waiting task from a busy processor for its execution.

### 6. Briefly explain the eachterm.

* Throughput - Number of processes completed per unit time.
* Microkernel -  A microkernel is the minimum software that is required to correctly implement an operating system.
* MS-DOS - MS-DOS is an operating system for x86-based personal computers mostly developed by Microsoft
* Graceful degradation - Graceful degradation is the ability of a computer, machine, electronic system or network to maintain limited functionality even when a large portion of it has been destroyed or rendered inoperative.
* Firmware - Permanent software programmed into a read-only memory.
* Seek time - Seek Time is measured defines the amount of time it takes a hard drive's read/write head to find the physical location of a piece of data on the disk.
* Hard real time system - It's  is hardware or software that must operate within the confines of a stringent deadline
* Degree of multiprogramming - The degree of multiprogramming describes the maximum number of processes that a single-processor system can accommodate efficiently.
* Mode bit - A bit, called the mode bit, is added to the hardware of the computer to indicate the current mode: kernel(0) or user(1). With the mode bit, we are able to distinguish between a task that is executed on behalf of the operating system and one that is executed on behalf of the user.
