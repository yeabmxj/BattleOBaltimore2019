package frc.team5115.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.subsystems.drivetrain;

public class Robot extends TimedRobot {

    public static drivetrain dt;

    public void robotInit() {
        dt = new drivetrain();
    }
}

