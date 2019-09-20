package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import static frc.team5115.robot.Robot.*;

public class wrist {

    private VictorSPX yaxis;

    public wrist()
    {
        yaxis = new VictorSPX(1);
    }

    public void moveY() {
        if (joy.getRawButton(3)) {
            yaxis.set(ControlMode.PercentOutput, .65);
        }
        else if (joy.getRawButton(1))
        {
            yaxis.set(ControlMode.PercentOutput, -.65);
        }
        else {
            yaxis.set(ControlMode.PercentOutput, 0);
        }

    }

}
