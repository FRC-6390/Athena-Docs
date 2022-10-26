---
title: "Pneumatics"
date: 2022-09-21T14:05:41-07:00
draft: false
description: "Pressurized Gas System"
weight: 6
---

#### Programming Pneumatics
When it comes to programming pnuematics there are 2 major parts to it the first one being the **compressor** to build up pressure, and the second would be programming the **solenoid** itself.

The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```Java
package frc.robot;

//importing the compressor library from wpilib
import edu.wpi.first.wpilibj.Compressor;

//importing the pneumatics solenoid library from wpilib
import edu.wpi.first.wpilibj.Solenoid;

public class Robot extends TimedRobot {

    //initialising the compressor
    public Compressor compressorExample;

    //initialising the pneumatic solenoid
    public Solenoid solenoidExample;

    @Override
    public void robotInit() {
        
        //creating the compressor object in initiate in order to turn it on and allow for pressure build up in your air tanks
        compressorExample = new Compressor();

        //creating the pneumatic solenoid object and setting it port 0, which will be based of what it is plugged into on Pneumatics Control Module (PCM)
        solenoidExample = new Solenoid(0);

    }

    @Override
    public void robotPeriodic() {

        //as soon as the robot is enabled we set the soleoinds to expand open using the .set() method and setting it to true
        solenoidExample.set(true);
    }

    @Override
    public void disabledInit() {
        //if you wanted to close the pneumatic we will be doing so once the robot is desabled by setting the .set() method to false
        solenoidExample.set(false);
    }

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
In the example above you learned how to open and close a pneumatic by building up pressure with a compressor using the PCM and setting the pneumatic to **true** or **false** by using ```.set()```

There are also other types of pneumatics such as **double solenoid pneumatics** and different ways to program them based on whether you wire your electronics to the **PCM** as we have done or are using the **REV Robotics Pneumatic Hub (PH)**.

For more information regarding programming pneumatics please visit [here.](https://docs.wpilib.org/en/stable/docs/software/hardware-apis/pneumatics/pneumatics.html)

If you are interested in using the **REV Robotics PH** please read over [here.](https://docs.revrobotics.com/rev-11-1852/pneumatic-hub-getting-started)