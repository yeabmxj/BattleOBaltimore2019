package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

import frc.team5115.subsystems.*;

public class Robot extends TimedRobot {
    public static Arm arm;
    public static Joystick joy;
    public static drivetrain dt;
    public static wrist w;

    public void robotInit() {
        joy = new Joystick(0);
        arm = new Arm();
        dt = new drivetrain();
        w = new wrist();
    }

    public void teleopPeriodic() {
        arm.moveArm();
        w.moveY();
        dt.drive(joy.getRawAxis(0), joy.getRawAxis(4), 0.35);
        
    }
}


