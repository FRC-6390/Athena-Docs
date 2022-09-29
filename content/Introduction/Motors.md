---
title: "Motors"
date: 2022-09-21T13:58:56-07:00
draft: false
description: "Basic introduction to motors"
weight: 5
---

## MOTORS

In FRC it is important to know the hardware you will be working with, in this section we will cover popular motors you may encounter and how to tell the difference between them

---

When we talk about motors, we are talking more about motor controllers. Newer motors coming out may have this built in like the [Falcon 500]() but many still require the speed controller.


## CAN vs PWM

Please read up on [CAN] if you are sure about any information portaining to it.

### CAN

CAN is a very popular way to connect with your motors and many other systems of your robot
CAN devices typically have expanded functionality built in by the manufacturer or vender because the capabilities of CAN are greatly expanded due to the fact that they are able to transfer more indepth information.

Every CAN device is required to be assigned an ID, if your robot has multiple CAN busses you will need to specify what bus the motor is on

### PWM

PWM is not as popular as a choice due to the fact that the information fed into the device and fed back are limit to only simplie values, do not let that discurage you from using PWM. PWM allows you to have access to the barebones of the motor so you are able to create and configure custom motor classes to your exact liking more easily. This allows you to better control and add feature to motor but with the draw back of more complexity in the code.


## CAN Motor Controllers

Here are some examples from popular vendors:

[VictorSPX](https://store.ctr-electronics.com/victor-spx/)

[TalonSRX](https://store.ctr-electronics.com/talon-srx/)


## PWM Motor Controllers
[SPARK](https://www.revrobotics.com/rev-11-1200/)

## Dual Motor Controllers (CAN and PWM)
[SPARK MAX](https://www.revrobotics.com/rev-11-2158/)