package frc.robot.commands;

import frc.robot.abstraction.SwartdogCommand;
import frc.robot.subsystems.ActuatedComponents;

public class CmdLightManual extends SwartdogCommand
{
    private ActuatedComponents _actuatedComponents;

    public CmdLightManual(ActuatedComponents actuatedComponents)
    {
        _actuatedComponents = actuatedComponents;

        addRequirements(_actuatedComponents);
    }

    @Override
    public void initialize()
    {
        _actuatedComponents.startLight();
    }
    
    @Override
    public void end(boolean interrupted)
    {
        _actuatedComponents.stopLight();
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
