---
title: "LEDS"
date: 2022-09-21T14:05:34-07:00
draft: false
description: "Adding Feedback and Colors To Your Robot"
weight: 0
---

LEDS an essential part of our robots in order to make them provide feedback to the driver, but most importantly making your robot look cool. In order to program LED's we will be using the Blinkin LED Driver by REV Robotics.

#### Programming The LEDS
Bellow you will be able to learn how to program both Blinkin LED driver inorder to control the output of your LED's.  
The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```Java
package frc.robot;

import edu.wpi.first.wpilibj.Servo; //importing the servo library from wpilib

public class Robot extends TimedRobot {

    //we will be insintiating the Blinkin module as a Servo
    private Servo Blinkin; 

    @Override
    public void robotInit() {
        //setting the blinking object to port number 2 on the roborio PWM
        Blinkin = new Servo(2);
    }

    @Override
    public void robotPeriodic() {
        //setting the blinkin value to -0.41 which will turn the LEd'c color to blue
        Blinkin.set(-0.41)
    }

    @Override
    public void disabledInit() {}

    @Override
    public void disabledPeriodic() {}

    @Override
    public void autonomousInit() {}

    @Override
    public void autonomousPeriodic() {}

    @Override
    public void teleopInit() {}

    @Override
    public void teleopPeriodic() {}  

    @Override
    public void testInit() {}

    @Override
    public void testPeriodic() {} 
}

```
{{% /tab %}}
{{< /tabs >}}

#### Explanation
At the begining we use the servo import:  ```import edu.wpi.first.wpilibj.Servo;``` as the Blinkin driver is made to be controlled and programmed similar to servos and motors. Hence we then initialise and create the Blinkin driver as a Servo. In the following code please ensure to use the port that you have wired your Blinkin to on your Roborio PWM, ```Blinkin = new Servo(2);``` in our case it was port 2.

##### Setting The Color
To control our LEd's we use the Blinkin ```.set()``` method and put in the [color or pattern code](https://www.revrobotics.com/content/docs/REV-11-1105-UM.pdf#page=14) of you choice based off the chart from provided by REV.