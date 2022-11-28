package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ActuatedComponents;
import frc.robot.subsystems.Drive;

public class CmdLightDefault extends CommandBase
{
    private Drive              _drive;
    private ActuatedComponents _actuatedComponents;

    public CmdLightDefault(Drive drive, ActuatedComponents actuatedComponents)
    {
        _drive              = drive;
        _actuatedComponents = actuatedComponents;

        addRequirements(_actuatedComponents);
    }

    @Override
    public void execute()
    {
        if (_drive.isMoving())
        {
            _actuatedComponents.startLight();
        }

        else
        {
            _actuatedComponents.stopLight();
        }
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
