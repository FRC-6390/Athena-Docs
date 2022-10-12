---
title: "Kauai Labs (NavX)"
date: 2022-09-21T14:01:53-07:00
draft: false
description: "For IMU usage by Kauai Labs"
weight: 0
---

Kauai Labs, one of the main IMU board providers, well known for there 9-axis inertial magnetic sensor and motion processor called the navX2-MXP. 

---

#### Use Cases
The navX2-MXP proccessor can help us obtain certain data, in which it can help us inhance our robot by giving us capabilities of programming specific features such as:

* Field-Oriented Drive
* Auto-balance
* Auto-rotate to angle
* Motion Detection
* Collision Detection
* And much more


#### Software Installation
Inorder for us to use the navX devices we will be required to download the latest build version which can be found [here](https://pdocs.kauailabs.com/navx-mxp/software/roborio-libraries/java/) 

![CTRE](/gifs/robotconfig/navx.jpg?classes=border,shadow)

Afterwards it will be best to follow the steps on the [Kauai Labs Website](https://pdocs.kauailabs.com/navx-mxp/software/roborio-libraries/java/). Their site has a very detailed step by step proccess to downloading the latest build and managing your **VS Code Vendor Libraries**. Please do not miss those steps as they are required for your code to work. Incase you notice that you have not managed your **vendor libraries** for any other firmwares such as CTRE, NAVX, etc, insure that you include them and the latest version if yo have multiple builds.