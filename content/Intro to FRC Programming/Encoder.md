---
title: "Encoder"
date: 2022-09-21T14:05:12-07:00
draft: false
description: "Counting Motor Rotations"
weight: 5
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
        //printing the output of the encoder in the console one the robot is enabled by using the .getDistance() method
        System.out.println(exampleEncoder.getDistance());
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
We start off by importing the required library for the CAN Encoder. In the example above we then initiate the object for the encoder and then to use the method called ```.getDistance()``` to print the value in the console. genrally speaking using the console is not a good place to print all your value, a better way would be to use the FRC Smart Dashboard or Shuffleboard.

To learn more about using the **FRC Shuffleboard** please read [here.](https://docs.wpilib.org/en/stable/docs/software/dashboards/shuffleboard/index.html)

To learn more about using the **FRC Smart Dashboard** please read [here.](https://docs.wpilib.org/en/stable/docs/software/dashboards/smartdashboard/index.html)

There are many more methods when it comes to using ecoders such as setting a specific distance per pule for more intense calculations, to read more regarding programming encoders please visit [here](https://github.com/CrossTheRoadElec/Phoenix-Examples-Languages/blob/master/Java%20General/CANCoder/src/main/java/frc/robot/Robot.java), or over [here.](https://docs.ctre-phoenix.com/en/latest/ch12a_BringUpCANCoder.html)
