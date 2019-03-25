1. Briefly explain the computer boot up process using a diagram.

![](http://www.eclubfoundation.com/efansmart/JSS1/ckuploader.php?action=viewimage&image=Ym9vdHByb2Nlc3N0ZXN0MjcyOGUwMTIuanBn)

2. Compare and contrastthe asymmetricmultiprocessing andsymmetric multiprocessing.
* ![](https://techdifferences.com/wp-content/uploads/2016/09/Symmetric-Multiprocessing-Vs-Asymmetric-Multiprocessing.jpg)

| Basis         | Symmetric           | Asymetric  |
| ------------- |:--------------------:| --------------:|
| Basic         | Each processor run the tasks in Operating System.  | Only Master processor run the tasks of Operating System. |
| Process     | Processor takes processes from a common ready queue, or there may be a private ready queue for each processor.     |   Master processor assign processes to the slave processors, or they have some predefined processes. |
| Architecture | All processor in Symmetric Multiprocessing has the same architecture.      |    All processor in Asymmetric Multiprocessing may have same or different architecture. |
|     Communication          |  All processors communicate with another processor by a shared memory.             |   Processors need not communicate as they are controlled by the master processor.    |
|     Failure          |       If a processor fails, the computing capacity of the system reduces.        |    If a master processor fails, a slave is turned to the master processor to continue the execution. If a slave processor fails, its task is switched to other processors.   |
|       Ease        |       Symmetric Multiprocessor is complex as all the processors need to be synchronized to maintain the load balance.        |    Asymmetric Multiprocessor is simple as master processor access the data structure.   |