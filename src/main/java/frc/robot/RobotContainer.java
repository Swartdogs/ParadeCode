package frc.robot;

import frc.robot.abstraction.Joystick;
import frc.robot.abstraction.SwartdogCommand;
import frc.robot.subsystems.*;
import frc.robot.subsystems.hardware.*;
import frc.robot.commands.*;


public class RobotContainer
{
    private Joystick _joystick;
    private Drive _drive;
    private ActuatedComponents _actuatedComponents;

    public RobotContainer()
    {
        _joystick = Joystick.joystick(1);
        _drive = new HardwareDrive();
        _actuatedComponents = new HardwareActuatedComponents();

        _drive.setDefaultCommand(new CmdDriveWithController(_drive, ()->_joystick.getX(), ()-> -_joystick.getY(), ()-> -_joystick.getThrottle()));

        configureButtonBindings();
    }

    private void configureButtonBindings()
    {
        
        _joystick.getButton(2).whileActive(new CmdCylinder(_actuatedComponents));
        _joystick.getButton(3).whenActivated(SwartdogCommand.run(()-> _drive.changePreferredDriveMode()));
    }
}
