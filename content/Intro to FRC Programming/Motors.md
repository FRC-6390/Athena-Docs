---
title: "Motors"
date: 2022-09-21T14:03:50-07:00
draft: false
description: "High powered movement and control"
weight: 0
---

#### Programming Motors
When it comes to programming motors there are generally 2 ways that it can be done and that depends on whether you are using a motor with an **External Speed/Motor Controller** or a **Built in Speed/Motor Contoller** in the motor itself. Hence we will be teaching both methods using a NEO motor with an external speed controller and a Falcon motor with a built in TalonFX speed controller.  

The folowing code is done in the **Robot.java** file.

{{< tabs >}}
{{% tab name="Robot.java" %}}

```Java
package frc.robot;

//importing the Spark Max motor controller library in order to control our NEO
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

//importing the TalonFX motor controller library, the controller is built into the Falcon Motor
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Robot extends TimedRobot {

    //initialising the PWM spark max motor controller to control our NEO motor, and naming it neoMotor
    public PWMSparkMax neoMotor;

    //intialising the TalonFX motor controller that is built into the Falcon motoe, and naming it falconMotor
    public TalonFX falconMotor,

    @Override
    public void robotInit() {
        
        //creating the PWMSparkMax object and setting it to port 0 on the PWM motor
        neoMotor = new PWMSparkMax(0);

        //creating the TalonFX object and setting it to port 1 on the PWM motor
        falconMotor = new TalonFX(1);
    }

    @Override
    public void robotPeriodic() {

        //in this case we are setting our neo motor at 0.5 speed which is between our 1 to -1 range, 0.5 speed will result in 50% power in the forwards direction
        neoMotor.set(0.5);

        //in this case we are setting the falcon motor to PercentOutput mode which allows us to give it value between 1 and -1 for its speed, then we are setting it to run at -0.5 speed which is 50% power in the backwards direction
        falconMotor.set(ControlMode.PercentOutput, -0.5);
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
After importing the required motor controllers for the given motor you are programming, you will then intitalise them and give them a their name and assigning the port number they are on. Afterwards you are free to program your motor typically using the ```.set()``` method which can give you different options based on the motor controller you are using.  

Now you have learned to program 2 very commonly used motor used in FRC but there are a lot more and genrally use a similar programming structure as you have just seen. There are also many extra feautures you can add when programming your motors such as setting them to **Brushless Mode** or **Brake Mode**, maybe using built in encoders, or even reading the current or voltage they are reseaving. their are endless capabilites when it comes to programming so please make sure to read the docs regarding the motor and speed controller you are using.
