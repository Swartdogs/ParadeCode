package frc.robot.subsystems.hardware;

import frc.robot.abstraction.Switch.SettableSwitch;
import frc.robot.subsystems.ActuatedComponents;

public class HardwareActuatedComponents extends ActuatedComponents
{
    public HardwareActuatedComponents()
    {
        _light = SettableSwitch.relay(1);
        _horn  = SettableSwitch.relay(2);
    }
}
