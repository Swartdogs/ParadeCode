package frc.robot.subsystems.hardware;

import frc.robot.abstraction.Motor;
import frc.robot.subsystems.Drive;

public class HardwareDrive extends Drive
{
    public HardwareDrive()
    {
        _left = Motor.compose(Motor.jaguar(0), Motor.jaguar(1));
        _right = Motor.compose(Motor.jaguar(2), Motor.jaguar(3));
    }
}
