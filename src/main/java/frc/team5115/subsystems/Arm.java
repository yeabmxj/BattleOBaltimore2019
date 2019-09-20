package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SPI;

import static frc.team5115.robot.Robot.joy;

public class Arm {
    private victor arm;

    public Arm(){
        arm = new victor(2, 8, 9);

        arm.setInverted(false);
    }

    public void moveArm(){
        if (joy.getRawButton(4)) {
            arm.set(ControlMode.PercentOutput, .5);
        }
        else if (joy.getRawButton(2))
        {
            arm.set(ControlMode.PercentOutput, -.45);
        }
        else
        {
            armStop();
        }
    }

    public void armStop() {
        arm.set(ControlMode.PercentOutput,0);
    }
}
