package frc.team5115.robot;

import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.subsystems.drivetrain;

public class Robot extends TimedRobot {

    public static drivetrain dt;
    public static Joystick j;

    public void robotInit() {
        dt = new drivetrain();
        j = new Joystick(0);
    }

    public void robotPeriodic() {
        dt.drive(j.getRawAxis(0), j.getRawAxis(1), 0.35); //change thrott with 1-j.getRawAxis(3)
    }
} 
