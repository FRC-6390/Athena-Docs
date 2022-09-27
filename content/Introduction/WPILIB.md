---
title: "WPILIB"
date: 2022-09-21T13:58:45-07:00
draft: false
description: "An Introduction to the offical FRC Library and Game Tools"
weight: 0
---

![WPILib](/images/WPILib-Logo.png?width=150px&height=150px)

WPILib is the official resource library by FIRST, Worcester Polytechnic Institute and WPILib contributors. It is required to be able to compete in FIRST Robotic Competitions as it contains the required libraries to allow your robot to communicate and compete on the field. You can read the offical WPILib Documentation [here](https://docs.wpilib.org/)

---

### What is WPILib?
> WPILib is a library of pre-written code that allows you to control the hardware on your team's robot. 

WPILib makes writing code for your robot very easy but does not mean it supports every piece of hardware on your robot some hardware vendors require you to download their libraries to be able to use them. Popular vendors like [CRTE], [REV] and [Kauai] all have their own vendor libaries you will need to download


### Getting started

We recommend you first check out and follow our VS Code setup and install as it has you install the required WPILib tools there, you can find the section specific for WPILib [here](/introduction/vscode/#downloading-wpi-support-for-frc)

#### FRC Game tools

The FRC Game tools contains the LabVIEW runtime, which is needed for FRC Driver Station. The FRC Game tools include everything you will need to control your robot. It includes Driver Station and Roborio Imaging Tool.

You can download everything from [National Instruments](https://www.ni.com/en-us/support/downloads/drivers/download.frc-game-tools.html)

It is recommended you uninstall any previous year's tools and resources before installing next years, please check out the offical FRC guide [here](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/frc-game-tools.html#uninstall-old-versions-recommended)

### WPILib Tour

Once you have everything installed it will be very useful to know **where** your WPILib installation is located, you will find your self coming to these folders more often than not

This is where you will find your WPILib installation, the current installation will be under the current season's year (2022, 2023, ...)
`C:\Users\Public\wpilib`

Folders to keep note of in here are **vsCodeExtensions** and **vendordeps**.

#### vsCodeExtensions
This folders contains all of the extensions needed for VS Code, if you decided not install the preconfigured WPILib VS Code

#### vendrodeps
Here is where some 3rd party libraries are needed to be moved to be properly installed, most installation tools will do this for you but not all


