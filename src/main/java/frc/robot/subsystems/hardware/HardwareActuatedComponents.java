package frc.robot.subsystems.hardware;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import frc.robot.abstraction.Solenoid;
import frc.robot.subsystems.ActuatedComponents;

public class HardwareActuatedComponents extends ActuatedComponents
{
    public HardwareActuatedComponents()
    {
        _solenoid = Solenoid.solenoid(1, PneumaticsModuleType.CTREPCM, 1);
    }
}
