---
title: "Camera"
date: 2022-09-21T14:05:46-07:00
draft: false
description: "Programming Vision"
weight: 0
---

Vision is an essential component for your robot and yourself especially when it comes to compeititions, as in some scenerios your robot drivers may not have a clear point of view of the robot, or desired target.



#### Programming Cameras

The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```java
package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.cscore.VideoSource;
import edu.wpi.first.cscore.VideoSource.ConnectionStrategy;

public class Robot extends TimedRobot {

  @Override
  public void robotInit() {
    UsbCamera cam = CameraServer.startAutomaticCapture(0);
    CameraServer.getServer();
    cam.setConnectionStrategy(ConnectionStrategy.kKeepOpen);
  }

  @Override
  public  void robotPeriodic() {}

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
To start off with programming the Camera we will first be required to import the 4 above which are:

``` java
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.cscore.VideoSource;
import edu.wpi.first.cscore.VideoSource.ConnectionStrategy;
```

After importing we will be able to acces the cabailites provided by each one.    
  
The next step will take place in the Robot Initate Void. As we know void is also called a function as it it can be accesed it other parts of the code. The reason we place our code in the Initiate function is to allow our Camera to be used as soon as the robot is turned on as the initiate function will run as soon as you connect to your robot.

In the folowing code inside: 

```java
    UsbCamera cam = CameraServer.startAutomaticCapture(0);
    CameraServer.getServer();
    cam.setConnectionStrategy(ConnectionStrategy.kKeepOpen);
```
we create a new UsbCamera called cam which starts an automatic capture on port 0, the reason it is 0 is because our Camera is attached to the first USB port on our Roborio, for instance if it was on on the second USB port we will set it 1 in the code, as you may no in programming we start counting from zero and not one.  

The next to lines of code are necessary as they are responsible for us retrieving our new Camera Server and connecting to it.