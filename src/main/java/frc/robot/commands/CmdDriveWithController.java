package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class CmdDriveWithController extends CommandBase
{
    private Drive _drive;

    private DoubleSupplier _leftXInput;
    private DoubleSupplier _leftYInput;
    private DoubleSupplier _rightYInput;

    public CmdDriveWithController(Drive drive, DoubleSupplier leftXInput, DoubleSupplier leftYInput,
            DoubleSupplier rightYInput)
    {
        _drive = drive;

        _leftXInput = leftXInput;
        _leftYInput = leftYInput;
        _rightYInput = rightYInput;
    }

    @Override
    public void execute()
    {
        double left = _leftYInput.getAsDouble();
        double right = _rightYInput.getAsDouble();
        double drive = left;
        double rotate = _leftXInput.getAsDouble();

        switch (_drive.getPreferredDriveMode())
        {
            case Arcade:
                _drive.arcadeDrive(drive, rotate);
                break;
            case Tank:
                _drive.tankDrive(left, right);
                break;
            default:
                _drive.tankDrive(0, 0);
                break;
        }
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
