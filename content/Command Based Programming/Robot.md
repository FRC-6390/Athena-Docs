---
title: "Robot"
date: 2022-09-21T14:02:42-07:00
draft: false
description: " "
weight: 0
---
Robot controls the flow of the program
---

We try to avoid putting anything inside Robot other when doing debugging. If you are putting inside Robot you most likely can put that code in a subsystem, command or both.

## Init vs Periodic
Init only runs once and at the very beginning and periodic loops.
For example, when the robot is turned on it will run robotInit and then run robotPeriodic until the robot is turned off.
 
## robotInit
Here make sure to have RobotContainer initialized, this will setup all your controls, commands and subsytems you had in RobotContainer.

## Tele-OP
Tele-Op is meant to be used when the robot is being controlled by a driver
## Autonomous
Autonomous meant to be used when the robot is following preprogrammed instructions with no driver input at all.
## Disabled
Disabled is meant to be used for any stop procedures, we typically use it to tell other parts of our code to stop.
## Test
Test is meant to be used to test parts of your robot, useful to put a diagnostic mode in there.
