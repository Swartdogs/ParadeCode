package frc.robot.commands;

import frc.robot.abstraction.SwartdogCommand;
import frc.robot.subsystems.ActuatedComponents;

public class CmdHonk extends SwartdogCommand
{
    private ActuatedComponents _actuatedComponents;

    public CmdHonk(ActuatedComponents actuatedComponents)
    {
        _actuatedComponents = actuatedComponents;
    }

    @Override
    public void initialize()
    {
        _actuatedComponents.startHorn();
    }
    
    @Override
    public void end(boolean interrupted)
    {
        _actuatedComponents.stopHorn();
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
