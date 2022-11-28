package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.CmdDriveWithController;
import frc.robot.subsystems.*;

public class RobotContainer
{
    Drive _drive;
    ActuatedComponents _actuatedComponents;

    Joystick _joystick;
    
    public RobotContainer()
    {
        _drive.setDefaultCommand(new CmdDriveWithController(_drive, ()->_joystick.getX(), ()->_joystick.getY(), ()->_joystick.getThrottle()));
        configureButtonBindings();
    }

    private void configureButtonBindings()
    {
        JoystickButton driveButtonOne = new JoystickButton(_joystick, 1);
        driveButtonOne.whenPressed(new InstantCommand(()->_drive.changePreferredDriveMode()));
    }

    public Command getAutonomousCommand()
    {
        return null;
    }
}
