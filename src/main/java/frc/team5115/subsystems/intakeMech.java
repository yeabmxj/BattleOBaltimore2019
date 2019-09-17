package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;

import static frc.team5115.robot.Robot.joystick;

public class intakeMech {
    public DoubleSolenoid leftAbove;
    public DoubleSolenoid rightAbove;
    public DoubleSolenoid leftBelow;
    public DoubleSolenoid rightBelow;

    public Spark leftIntake;
    public Spark rightIntake;

    public intakeMech()
    {
        leftBelow = new DoubleSolenoid(8, 0, 1);
        rightBelow = new DoubleSolenoid(8, 2,3);
        leftAbove = new DoubleSolenoid(7,6,7);
        rightAbove = new DoubleSolenoid(7,5,4);

        leftIntake = new Spark(4);
        rightIntake = new Spark(4);
    }

    public void intakeUp()
    {
        if(joystick.getRawButton(13)) {
            leftAbove.set(DoubleSolenoid.Value.kForward);
            rightAbove.set(DoubleSolenoid.Value.kForward);
        } else {
            intakeStill();
        }
    }

    public void intakeDown()
    {
        if(joystick.getRawButton(12)) {
            leftAbove.set(DoubleSolenoid.Value.kReverse);
            rightAbove.set(DoubleSolenoid.Value.kReverse);
        } else {
            intakeStill();
        }
    }

    public void intakeStill()
    {
        leftAbove.set(DoubleSolenoid.Value.kOff);
        rightAbove.set(DoubleSolenoid.Value.kOff);
        leftBelow.set(DoubleSolenoid.Value.kOff);
        rightBelow.set(DoubleSolenoid.Value.kOff);
    }

    public void intakeOpen()
    {
        if(joystick.getRawButton(15)) {
            leftBelow.set(DoubleSolenoid.Value.kForward);
            rightBelow.set(DoubleSolenoid.Value.kForward);
        } else {
            intakeStill();
        }
    }

    public void intakeClose()
    {
        if(joystick.getRawButton(14)) {
            leftBelow.set(DoubleSolenoid.Value.kReverse);
            rightBelow.set(DoubleSolenoid.Value.kReverse);
        } else {
            intakeStill();
        }
    }

// WHEELIES BROKEN
//    public void intakeWheelie()
//    {
//        leftIntake.set(1);
//        rightIntake.set(1);
//    }
//
//    public void intakeWheelieOff()
//    {
//        leftIntake.set(0);
//        rightIntake.set(0);
//    }
}
