package frc.team5115.robot;

import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
//Olivia
//Yeab
//marie
    public static Arm arm;
    public static Controller joy;

    public void robotInit() {
        joy = new ThrustMaster(0);
        arm = new Arm();
    }
    public void teleopInit(){}

    public void teleopPeriodic() {
        arm.moveArm()
    }
    public void autonomousInit(){
        previousTime = 0;
        driveTrain.resetEncoders();
    }
    public void autonomousPeriodic(){

    }

