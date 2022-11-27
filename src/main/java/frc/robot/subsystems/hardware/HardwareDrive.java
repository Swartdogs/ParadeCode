package frc.robot.subsystems.hardware;

import frc.robot.abstraction.Motor;
import frc.robot.subsystems.Drive;

public class HardwareDrive extends Drive
{
    public HardwareDrive()
    {
        _left = Motor.compose(Motor.neo(1), Motor.neo(2));
        _right = Motor.invert(Motor.compose(Motor.neo(3), Motor.neo(4)));
    }
}
