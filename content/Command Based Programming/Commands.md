---
title: "Commands"
date: 2022-09-21T14:03:21-07:00
draft: false
description: "When your robot acts"
weight: 0
---

Commands are how we set what our buttons should do to the robot

---

## Constructor
The constructor should have all values and the subsystem the command needs to run. For example, if I was creating a DriveTrain command I would have the constructor require the DriveTrain subsystem and the control axis

## Initialize
This method only runs once, it runs when the command is called. If the command is repeatedly called it will only run initialize if the command ends (the command is stopped being called and is then called again)
here we put all the setup for the command, for example, resetting values.

## Execute
Execute is a loop, it continuously runs while the command is active
this is where you would put what the command actually does.

## End
End runs when the command ends, it runs only once and if the command loops it will only run when the loop ends and the command ends. Here is where you would put down your "Shutdown procedure", for example setting shooting speed to 0 or making your drive motors turn off.

## Is Finished
Is finished returns a value, if it is true the command will end right as the execute loop finishes if it is not being called constantly. If it returns false, the command will continue to run until it is interrupted, if you want your command to run in a loop for a bit then stop. Replace the variable it returns with one you can control.

> **ALL COMMANDS** will stop on a mode change or emergency stop

{{< tabs >}}
{{% tab name="DriverControl.java" %}}
```
package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class DriverControl extends CommandBase {
  private DoubleSupplier x, y;
  
  public DriverControl(DoubleSupplier xSupplier, DoubleSupplier ySupplier) {
    x = xSupplier;
    y = ySupplier;
    addRequirements(RobotContainer.getDriveTrain());
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    if(!DriverStation.isAutonomous()) DriveTrain.drive(DifferentialDrive.arcadeDriveIK(-y.getAsDouble(), x.getAsDouble(), true));
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
```
{{% /tab %}}
{{< /tabs >}}