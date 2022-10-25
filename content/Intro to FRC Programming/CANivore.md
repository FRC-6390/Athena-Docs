---
title: "CANivore"
date: 2022-09-21T14:06:08-07:00
draft: false
description: "Expanding Your CAN Wiring and Comunication Length"
weight: 0
---

![Java Installation](/gifs/programming/canivore.png?width=200px)

The CANivor is a very useful device that helps you expand the communication line for your robot, for instnace creating to CAN loops one for your drivebase and the other could control the rest of your subsystems. This is done in order to relief the load on a loop and decrease the wiring length as if it gets to long the signal wont have enough time to travel back to your Roborio hence causing problems with your robot. 

--- 

#### Setting Up the CANivore
To learn more regarding how to setup you CAnivor, and declare it as a specific CAN loop in the Pheonix Tuner, please refer to their well detailed step by step documentation over [here](https://docs.ctre-phoenix.com/en/stable/ch08a_BringUpCANivore.html).

#### Programming Devices On The Canivore
Bellow you will be able to learn how to program both the devices and specify the CAN loop they will be using.  
The folowing code is done in the **Robot.java** file.

For the purpose of the demostration we will be using a **NEO motor** and programming it using the **PWM Spark Max motor controller**. 

{{< tabs >}}
{{% tab name="Robot.java" %}}

```java
package frc.robot;

//importing the motor controller library for the NEO
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Robot extends TimedRobot {

    //initialising the PWM spark max motor controller and namming it driveMotor left and right
    public PWMSparkMax driveMotorLeft;
    public PWMSparkMax driveMotorRight;

    @Override
    public void robotInit() {
        //this is an example of making a motor with it being on port 0 on the PWM
        //this constructs the left motor on the RIO native CAN bus
        driveMotorLeft = new PWMSparkMax(0);

        //this is an example of making a motor with it being on port 1 on the PWM
        //this constructs the right motor on the CANivore bus named "Drivebase"
        driveMotorRight = new PWMSparkMax(1, "Drivebase");     
    }

    @Override
    public void robotPeriodic() {

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
When wanting to specify what loop the device you are programming is running on, you will need to add the string at the end after your device constant/port number and specify the exact loop name as decided in the Pheonix Tuner.
```driveMotorRight = new PWMSparkMax(1, "Drivebase");``` in this case our CANivore loop is called **Drivebase**.