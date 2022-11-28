package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ActuatedComponents;

public class CmdLightManual extends CommandBase
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
