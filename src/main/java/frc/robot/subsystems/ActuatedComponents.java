package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class ActuatedComponents extends SubsystemBase
{
    private Relay _light;
    private Relay _horn;

    public ActuatedComponents()
    {
        _light = new Relay(1);
        _horn  = new Relay(2);
    }

    public void startLight()
    {
        _light.set(Value.kOn);
    }

    public void stopLight()
    {
        _light.set(Value.kOff);
    }

    public void startHorn()
    {
        _horn.set(Value.kOn);
    }

    public void stopHorn()
    {
        _horn.set(Value.kOff);
    }
}
