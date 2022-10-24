---
title: "Driver Station"
date: 2022-09-21T14:00:00-07:00
draft: flase
description: "How to enable/disable and see what your robot is doing"
weight: 0
---

Driver Station is the program we use to control and communicate with our robot, it is required that Driver Station is connected and enabled before your robot will do anything. Your controller inputs and robot modes also go through Driver Station.

---

## Driver Station Tour
On the left, you will see 5 tabs. Each tab is important and has its own purpose, you will only need to worry about 3 for the majority of your time in Driver Station.

### Operation Tab 
This tab contains all the required controls to switch your robot mode, you will find yourself most often on this page.
![OperationTab](/images/DriverStationOperationTab.png?classes=border,shadow)
### USB Devices Tab
This tab shows a list of USB devices the robot can see, these devices are connected through your computer. It also shows the device's ID, button inputs and axis values, all of these will be very useful when setting up your controls. If you need to move a device to another spot you can click and drag the device to another slot.
![USBDevicesTab](/images/DriverStationUSBDevicesTab.png?classes=border,shadow)
### Messages Tab
This tab shows any outputs from the robot, if you are looking for print outs or are looking for a more specific type of output, you can press the gear icon and change what is shown.

You can find an in-depth explanation of Driver Station from WPI [here](https://docs.wpilib.org/en/stable/docs/software/driverstation/driver-station.html)
![MessagesTab](/images/DriverStationMessagesTab.png?classes=border,shadow)
## Setting Your Team Number
Head into the 3rd tab and please make sure your Driver Station team number is set correctly or else you will not be able to connect and control the robot

![SetupTab](/images/DriverStationSetupTab.png?classes=border,shadow)


## Controls

`F1` -> Joystick Refresh 

`[` or `]` or `\` -> Enable Robot

`Enter` -> Disable Robot

`Space` -> Emergency Stop
> When an emergency stop is triggered, you will need to re-upload the code or reboot the RIO to robot to be able to enable it again
> keep note that driver station will detect if the space bar is pressed even if it is not focused


## Logs (DS Log File Viewer)

This is very important window! This is the tab you go to when all your code is right, the robot has no wiring issues and the networking is setup correctly, or atleast you think it is. This will give you in-depth break down of every single thing your robot is doing, if your CAN is doing things that do not make sense or the networking is acting weird, check this and check their utilizations.


