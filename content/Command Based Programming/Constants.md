---
title: "Constants"
date: 2022-09-21T14:03:03-07:00
draft: false
description: " "
weight: 0
---

---

Constants is very important, if set up correctly it can make your code easy to read and changes even easier to implement

## Structure
We believe we take a unique approach to constants than what you may find with other teams.

The structure of our Constants file goes as the following:
Constants -> SubContants... -> Value

For example, if I had a left motor ID for my drive train it would go in
Constants.DRIVE.LEFT_MOTOR_ID = 0

If I had a left bumper button mapping for a xbox controller:
Constants.CONTROLLER.XBOX.LEFT_BUMPER_ID = 0


## Naming
Naming is very important, it points out what is and is not a constant.
We reserve ALL_CAPITAL_LETTERS for constants and we do not skip spaces and be DESCRIPTIVE_ABOUT_THE_VARIABLE_WITHOUT_GETTING_INTO_TOO_MUCH_DETAIL

Examples:

Elevator Subsysem -> elevatorEncoder

ELEVATOR.ENCODER_ID 

Turret Subsystem -> leftLimitSwitch

TURRET.LEFT_LIMIT_SWITCH_ID

DriveTrain Subsystem -> frontLeftOffset

DRIVE.FRONT_LEFT_OFFSET

## Why An Interface?
The quick answer is that it makes it easier.
In a typical constants file, you need to put:

	public static final <variableType> <NAME> = <value>;
But with an interface:

	<variableType> <NAME> = <value>;
You do not need the extra fluff, an interface automatically adds it when the code is deployed.
Interfaces are also more memory efficient compared to a class but with scale, you will be working with the effects are negligible.

Our 2022 Constants File:
{{< tabs >}}
{{% tab name="Constants.java" %}}
```
package frc.robot;

import java.util.Iterator;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import frc.robot.commands.IntakeAndFeederCommand;
import frc.robot.commands.IntakeOutCommand;
import frc.robot.subsystems.DesiredPosition;
import frc.robot.subsystems.DesiredPositionFactory;
import frc.robot.subsystems.utils.swervelib.SdsModuleConfigurations;

public interface Constants {

    public interface SWERVE {
        double MAX_VOLTAGE = 12.0;
        double MAX_VELCOCITY = 6380.0/ 60* SdsModuleConfigurations.MK4_L1.getDriveReduction() * SdsModuleConfigurations.MK4_L1.getWheelDiameter();
        double MAX_ANGULAR = MAX_VELCOCITY / Math.hypot(ROBOT.TRACKWIDTH/2, ROBOT.WHEELBASE/2);
        Translation2d[] SWERVE_LOCATIONS = {ROBOT.FRONT_LEFT, ROBOT.FRONT_RIGHT, ROBOT.BACK_LEFT, ROBOT.BACK_RIGHT};
        int FRONT_LEFT_DRIVE = 0;
        int FRONT_LEFT_ROTATION = 4;
        int FRONT_LEFT_ENCODER = 8;
        
        int FRONT_RIGHT_DRIVE = 1;
        int FRONT_RIGHT_ROTATION = 5;
        int FRONT_RIGHT_ENCODER = 9;

        int BACK_LEFT_DRIVE = 2;
        int BACK_LEFT_ROTATION = 6;
        int BACK_LEFT_ENCODER = 10;

        int BACK_RIGHT_DRIVE = 3;
        int BACK_RIGHT_ROTATION = 7;
        int BACK_RIGHT_ENCODER = 11;

        double FRONT_LEFT_OFFSET = -Math.toRadians(197.3968505859375);
        double FRONT_RIGHT_OFFSET = -Math.toRadians(62.68524169921874);
        double BACK_LEFT_OFFSET = -Math.toRadians(99.02801513671875);
        double BACK_RIGHT_OFFSET = -Math.toRadians(72.8668212890625);
   
    }

    public interface CONTROLLER {
        int PORT = 0;
        double THRESHOLD = 0.5d;
        float DEBOUNCE_PERIOD = 0.5f;
        double DEAD_ZONE = 0.1d;

        int A = 1;
        int B = 2;
        int X = 3;
        int Y = 4;
        int LEFT_BUMPER = 5;
        int RIGHT_BUMPER = 6;
        int BACK = 7;
        int START = 8;
        int LEFT_JOYSTICK = 9;
        int RIGHT_JOYSTICK = 10;
        int RIGHT_TRIGGER = 3;
        int LEFT_TRIGGER = 2;
    
        int LEFT_X = 0;
        int LEFT_Y = 1;
        int RIGHT_X = 4;
        int RIGHT_Y = 5;
    
        int TOP = 11;
        int TOP_RIGHT = 12;
        int RIGHT = 13;
        int BOTTOM_RIGHT = 14;
        int BOTTOM = 15;
        int BOTTOM_LEFT = 16;
        int LEFT = 17;
        int TOP_LEFT = 18;
        int POV = 11;
    }

    public interface ELEVATOR {
        int LEFT = 15;
        int RIGHT = 16;
        int LEFT_SERVO = 0;
        int RIGHT_SERVO = 1;
        double UP_VELOCITY = 0.2;
        double DOWN_VELOCITY = 0.2;
        int TOP_LIMIT_SWITCH = 0;
        int BOTTOM_LIMIT_SWITCH = 1;
        int SERVO_MIN = 0;
        int SERVO_MAX = 70;
        int ENCODER = 12;
    }

    public interface INTAKE {
        int LEFT = 3;
        int RIGHT = 4;
    }

    public interface FEEDER {
        int FEEDER_MOTOR = 18;
        double VELOCITY = 0.7;
    }

    public interface SHOOTER {
        int LEFT = 20;
        int RIGHT = 21;
        int TURRET = 17;
        int PRE_RIGHT = 22;
        int PRE_LEFT = 19;
        int LEFT_LIMIT_SWITCH = 2;
        int RIGHT_LIMIT_SWITCH = 3;

        double TURRET_MAX = 0;
        double TURRET_MIN = 0;
        double HIGH_VELOCITY = 30000;
        double LOW_VELOCITY = 12000;
        double TIMEOUT = 3;
        frc.robot.subsystems.utils.PID TURRET_PID = new frc.robot.subsystems.utils.PID(0.02,0,0,0,0.1);
        frc.robot.subsystems.utils.PID SHOOTER_PID = new frc.robot.subsystems.utils.PID(0.0003,0,0,0,1000);
    }

    public interface ODOMETERY {
        double DRIVE_P = 0.04;
        double DRIVE_I = 0.04;
        double DRIVE_D = 0.05;
        double DRIVE_I_LIMIT = 0.025;

        double ROTATION_P = 0.0005;
        double ROTATION_I = 0.007;
        double ROTATION_D = 0.0;
        double ROTATION_I_LIMIT = 0.25;
    }

    public interface ROBOT {
        double TRACKWIDTH = 0.53;
        double WHEELBASE = 0.52;
        Translation2d FRONT_LEFT = new Translation2d(TRACKWIDTH/2, WHEELBASE/2);
        Translation2d FRONT_RIGHT = new Translation2d(TRACKWIDTH/2, -WHEELBASE/2);
        Translation2d BACK_LEFT = new Translation2d(-TRACKWIDTH/2, WHEELBASE/2);
        Translation2d BACK_RIGHT = new Translation2d(-TRACKWIDTH/2, -WHEELBASE/2);
        int GYRO_PORT = 13; 
    }

    public interface PID {
        double DEFUALT_LIMIT = 0.05;
        double DEFUALT_THRESHOLD = 0.1;
    }
} 
```
{{% /tab %}}
{{< /tabs >}}

