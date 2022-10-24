---
title: "Servos"
date: 2022-09-21T14:05:30-07:00
draft: false
description: "Low Powered Precise Movement"
weight: 0
---

Servos are a type of motor which integrate positional feedback in order to allow a single motor to perform repeatable, controllable, and short actions while taking position as the input signal. WPILib provides the capability to control servos which match the common hobby input specification. The WPILIB library eaily allows us to get started with progrmming the basic hobby servos, which is a great way to get started in FRC



#### Programming Servos

The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```java
package frc.robot;

import edu.wpi.first.wpilibj.Servo; //importing the neccesary library to control the servos

public class Robot extends TimedRobot {

    @Override
    public void robotInit() {
        //constructing the servo object and setting the servo to port 1
        Servo exampleServo = new Servo(1); 
    }

    @Override
    public  void robotPeriodic() {
        //scaled value
        exampleServo.set(.5);

        //angle value
        exampleServo.setAngle(75);
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
To start off with programming the Servo we are first required to import the WPILIB library bellow:

``` java
    import edu.wpi.first.wpilibj.Servo; 
```

After importing we will be able to acces the cabailites provided by WPILIB for servos.    
  
The next step will takes place in the Robot Initiate Function, where we create the following servo object and assign it to the servo plugged to port 1 on the PWM which is located on the Roborio

```java
    @Override
    public void robotInit() {
        //constructing the servo object and setting the servo to port 1
        Servo exampleServo = new Servo(1); 
    }
```
As we know in programming there is always a better way of doing something so instead of creating the servo object and assigning its port in one line, we can break things up, to maintain a better programming structure. Therefor we can create the servo object outside of the robot initiate, and then assign it its port later on, as can be seen bellow.

```java
    //constructing the servo object
    Servo exampleServo;

    @Override
    public void robotInit() {
        // then assigning and setting the servo to port 1
        exampleServo = new Servo(1); 
    }
```

After the following steps are completed we are ready to control our servo in the robot periodic function. There are two ways a servo can be controlled, one method is by a **Scaled Value** and the other more common and standard method is by the **Angle Value**.

> **Scaled Value:** Sets the servo position using a scaled **0.0 to 1.0** value. 0 being on complete side of the servo, while one corospondes to the other furthest side.

> **Angle Value:** Sets the servo position by specifying the angle, in degrees from **0 to 180**, please note it cannot be set to a negative value.