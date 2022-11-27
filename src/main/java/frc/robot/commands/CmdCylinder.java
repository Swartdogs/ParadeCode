package frc.robot.commands;

import frc.robot.abstraction.SwartdogCommand;
import frc.robot.subsystems.ActuatedComponents;

public class CmdCylinder extends SwartdogCommand
{
    private ActuatedComponents _actuatedComponents;

    public CmdCylinder(ActuatedComponents actuatedComponents)
    {
        _actuatedComponents = actuatedComponents;
    }

    @Override
    public void initialize()
    {
        _actuatedComponents.extendCylinder();
    }
    
    @Override
    public void end(boolean interrupted)
    {
        _actuatedComponents.retractCylinder();
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
