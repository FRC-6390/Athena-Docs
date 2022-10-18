package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TemplateSubsystem extends SubsystemBase {
  
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
