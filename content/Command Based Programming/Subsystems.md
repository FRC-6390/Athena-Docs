---
title: "Subsystems"
date: 2022-09-21T14:03:17-07:00
draft: false
description: "How your robot acts"
weight: 0
---

Subsystems are where you tell the robots and sensors on your robot how to act

---

We take a very unique approach to subsystems. This approach makes access to the subsystems easier and avoids conflicts with other classes using the subsystem.


## Static
Static everywhere! Making everything static put everything in the class to only be a part of that class, so if another instance of the class is made there won't be 2 objects with motors they will share the same motor. But we can't just make the object and values static:
``` java
	public static double kP = 5;
```
This might work for some things but certain motors and sensors need to wait for the robot before being initialized so we need to put it into a constructor
``` java
public static double kP;

public Clazz(){
    kP = 5;
}
```
This is what most teams will do but, if the class is created again we will have kP set back to 5, what if we don't want that? Or worse what if it was a motor, now we have a second instance of a motor on the CAN loop. So we use a static body.

``` java
public static double kP;
	
static {
    kP = 5;
}
```

In this we replace the constructor with the static body, this will only run **Once**, it will never run again no matter how many times the class is made. This makes sure we only create one instance of everything while allowing us to use however many instances of the class we want or need.

> We recommend limiting how instances you make and only call the class staticly

## Methods
In subsystems you have a lot of freedom, you can choose what to make and what they should do. What we suggest, make sure nothing access the Objects directly. If you want to move your left motors, you would create a method to control them rather than the command accessing it directly.

```java
private static CANSparkMax leftMotor1, leftMotor2;

static {
    leftMotor1 = new CANSparkMax(0,MotorType.kBrushless);
    leftMotor2 = new CANSparkMax(1,MotorType.kBrushless);
}

public static void setLeftMotors(double speed){
    leftMotor1.set(speed);
    leftMotor2.set(speed);
}
```

I am purposely not allowing my commands to access anything directly, only let them through methods.

## Periodic
Periodic is a loop the run continuously, what will typically go here is data. Any data you want to send of receive from SmartDash will go here. You might also see drive code in here.

Example:

{{< tabs >}}
{{% tab name="DriveTrain.java" %}}
``` java
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  
  private static WheelSpeeds wheelSpeeds;
  private static CANSparkMax leftMotor1, leftMotor2, rightMotor1, rightMotor2;

  static {
    wheelSpeeds = new WheelSpeeds();
    leftMotor1 = new CANSparkMax(0, MotorType.kBrushless);
    leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
    rightMotor1 = new CANSparkMax(1, MotorType.kBrushless);
    rightMotor2 = new CANSparkMax(3, MotorType.kBrushless);

    leftMotor1.setInverted(true);
    leftMotor2.setInverted(true);
    
    leftMotor2.follow(leftMotor1);
    rightMotor2.follow(rightMotor1);

  }

  public static void setChassisSpeeds(WheelSpeeds speeds){
    wheelSpeeds = speeds;
  }

  @Override
  public void periodic() {
    leftMotor1.set(wheelSpeeds.left);
    rightMotor1.set(wheelSpeeds.right);
  }
}
```
{{% /tab %}}
{{< /tabs >}}