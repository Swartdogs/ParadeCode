package frc.robot.subsystems;

import frc.robot.abstraction.Solenoid;
import frc.robot.abstraction.SwartdogSubsystem;

public abstract class ActuatedComponents extends SwartdogSubsystem
{
    protected Solenoid _solenoid;

    public void extendCylinder()
    {
        _solenoid.extend();
    }

    public void retractCylinder()
    {
        _solenoid.retract();
    }
}
