---
title: "Robot Container"
date: 2022-09-21T14:03:10-07:00
draft: false
description: " "
weight: 0
---

RobotContainer is where you set up your commands and subsystems. This file also manages the trigger events for your commands

---

## Variables
### Commands and Subsystems
Make sure you have all your commands and subsystems *private*, we do this to avoid conflicting calls and make the flow of the code easier to read.

### Inputs
We also want to declare the inputs (Controllers and Buttons) as private, all of our input processing/passing should be contained within this file as much as possible. If you need to have another input check for a command, we recommend passing the other controller input through the command or reconsidering why you need to use multiple buttons or if it could be switched to one. It is important to remember that in the heat of the moment will these buttons be used properly? or cause issues?

## ConfigureButtonBindings
Here we define what each button will do, we recommend having one button to do as much as possible, depending on what you are planning for your robot you will find that buttons run out fast and can be hard to track. 

> If you have a robot with an intake, feeder, and shooter. You can save a button by not making one for the feeder, and have the shooter and intake both call the feeder. Removing the need for buttons for subsystems like these is how you can save buttons on your controllers simplifying your control scheme

## GetAutonomousCommnad
We recommend expanding the functionality of this command. Make it easy to change your autonomous command on the fly, preferably without a code deploy.
