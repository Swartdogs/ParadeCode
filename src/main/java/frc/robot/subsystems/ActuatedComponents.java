package frc.robot.subsystems;

import frc.robot.abstraction.SwartdogSubsystem;
import frc.robot.abstraction.Enumerations.State;
import frc.robot.abstraction.Switch.SettableSwitch;

public abstract class ActuatedComponents extends SwartdogSubsystem
{
    protected SettableSwitch _light;
    protected SettableSwitch _horn;

    public void startLight()
    {
        _light.set(State.On);
    }

    public void stopLight()
    {
        _light.set(State.Off);
    }

    public void startHorn()
    {
        _horn.set(State.On);
    }

    public void stopHorn()
    {
        _horn.set(State.Off);
    }
}
