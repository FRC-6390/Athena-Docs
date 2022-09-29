---
title: "CAN Bus"
date:  2022-09-27T14:10:43-07:00
draft: false
weight: 4
description: "The wires that give us the power to do amazing things"
---
![CAN](/images/CAN-Wire.webp?width=200px&height=200px)

The CAN Bus is very important and you will most likely find yourself using it quite often as it provides amazing conveniences.

---

CAN or Controller Area Network is a standard design to allow devices and microcontrollers to communicate with each other. It uses a pair of wires, typically Green and Yellow. CAN can be configured in 3 ways.

## Line Topology
This is where each device connected links to the next device in the line with the end being terminated by a 120 ohm resisitor

## Star Topology
This is where all the devices connect to a central hub

## Ring Topology
This is the same as Line Topology but the end of the line terminates at the point of origin

--- 

## Wire Lengths
Another thing that is very important to keep in mind is how long you make your CAN runs, try not to make any runs longer than 1 foot without a device. Try to keep your runs as short as possible

---

Our team typically uses Line Topology, but it is important to know what topology you are using when you are trying to troubleshoot an issue. For example if a motor was acting up and not responding correctly or half the motors on the robot seem to not be working correctly. Knowing the robot uses line typology helps us know that at some point on a line a connection is bad causing everything past it to have a spotty connection too.

## CAN 2.0B
Most devices you will encounter use this specific CAN protocol.

If your robot has a single CAN bus of this type be careful how many devices you connect to the line, once you start getting into the 10+ motor range you may start to see sperratic behavoir from your CAN devices or outright disconnecting/not working.

This is because CAN 2.0B has a major limitation on how much bandwidth is available on the line. The protocol can only hanlde upto 1Mb/s, so be mindful if you causing a lot of updates to your CAN devices.

This protocol only allows 8 bytes per frame, which is another limiting factor.


## CAN FD

CAN FD greatly increases the amount of data that can be transferred, it allows up 10Mb/s. You will need a seperate device to run this line entirely, for example the [CANivore](https://store.ctr-electronics.com/canivore/)

This protocol allows 64 bytes per frame.

---

if you would like a more indepth look into CAN check out [this](https://store.ctr-electronics.com/can-fd/) from CTRE
