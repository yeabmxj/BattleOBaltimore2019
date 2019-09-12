package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.subsystems.*;

public class Robot extends TimedRobot {
    //Olivia
    //Yeab
    //marie
    public static Arm arm;
    public static Joystick joy;

    public void robotInit() {
        joy = new Joystick(0);
        arm = new Arm();
    }

    public void teleopPeriodic() {
        arm.moveArm();
    }
}
