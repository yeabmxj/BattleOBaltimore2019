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
            if (!arm.getUpperHit()) {
                arm.set(ControlMode.PercentOutput, .5);
            }
            else {
                armStop();
            }
        }
        else if (joy.getRawButton(2))
        {
            if (!arm.getLowerHit()) {
                arm.set(ControlMode.PercentOutput, -.45);
            }
            else {
                armStop();
            }
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


//Throttle, with the analog controller
//One stick does y axis and the other does x