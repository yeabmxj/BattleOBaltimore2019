package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.subsystems.intakeMech;

public class Robot extends TimedRobot {

    public static intakeMech intakemech;
    public static Joystick joystick;

    public void robotInit()
    {
        intakemech = new intakeMech();
        joystick = new Joystick(0);

        intakemech.intakeStill();
    }

    public void teleopPeriodic()
    {
        intakemech.intakeOpen();
    }
}

