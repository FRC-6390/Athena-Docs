---
title: "Limit Switches"
date: 2022-09-21T14:05:19-07:00
draft: false
description: "Off and On Sensors"
weight: 0
---

#### Programming Magnatic Limit Switches

The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```java
package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;

public class Robot extends TimedRobot {

    
    private static DigitalInput limitSwitch;

    @Override
    public void robotInit() {
        limitSwitch = new DigitalInput(0);
        //the zero will be your limit switch ID/constant
    }

    @Override
    public  void robotPeriodic() {

        //if the switch is turned on, it will print true, else false
        if(limitSwitch.get()){
            System.out.println("limit switch is on: TRUE");
        } else {
            System.out.println("limit switch is off: False");
        }
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
To start off with programming the Limit Switch we will first be required to import the follwing bellow, which allows us to acces and program the limit switch

``` java
import edu.wpi.first.wpilibj.DigitalInput;
```
    
  
The next part is in the robot initiate which is where we will make the limit switch object

```java
    limitSwitch = new DigitalInput(0);
    //the zero will be your limit switch ID/constant, which relates to the port it is plugged into
```
Notice that we set the digital input channel to the ID of the limit switch which would be the port that it is plugged into

Afterwards we use the ``get()`` method from the limit switch object that we have created which will return **true if it is triggered** from the magnet, and **false if nothing is triggered**.
