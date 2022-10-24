---
title: "Encoder"
date: 2022-09-21T14:05:12-07:00
draft: false
description: "Counting Motor Rotations"
weight: 0
---

For the following example we will be teaching you how to program and use the REV Robotics CAN Encoder, a very reliable and useful device.

#### Programming The CAN Encoder
 
The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```java
package frc.robot;

import com.revrobotics.CANEncoder; //importing the CAN Encoder library from REV Robotics

public class Robot extends TimedRobot {

    //creating the CAN encoder
    CANEncoder exampleEncoder;

    @Override
    public void robotInit() {
        //initiating it and assigning it to port 0, then informing the encoder that we are using a Brushless Motor
        exampleEncoder = new CANSparkMax(0, MotorType.kBrushless).getEncoder();
    }

    @Override
    public  void robotPeriodic() {
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
We start off by importing the required libraries which depend on on the gyro you are using. In the example above we than initiate the objects for the gyros and then are able to use the method called ```.getAngle()``` which allows us to return its value that it reads in the console or other FRC tools such as the smart dashboard or shuffleboard.

There are many more methods for the gyros but we have explained the basics needed, for more information on the AHRS gyro please read [here](https://github.com/maxgdn/NavX-Mxp-java-examples/blob/master/DataMonitor/src/org/usfirst/frc/team2465/robot/Robot.java) or at the [Java Docs Here](https://www.kauailabs.com/public_files/navx-mxp/apidocs/java/com/kauailabs/navx/frc/AHRS.html). You can also read up about the pigeon over [here](https://docs.ctre-phoenix.com/en/stable/ch11_BringUpPigeon.html)
