package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ActuatedComponents;

public class CmdHonk extends CommandBase
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
