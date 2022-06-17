package frc.robot.commands;

import java.util.function.DoubleSupplier;

import frc.robot.abstraction.SwartdogCommand;
import frc.robot.subsystems.Drive;

public class CmdDriveWithController extends SwartdogCommand
{
  private Drive _drive;

  private DoubleSupplier _leftXInput;
  private DoubleSupplier _leftYInput;
  private DoubleSupplier _rightYInput;

  public CmdDriveWithController(Drive drive, DoubleSupplier leftXInput, DoubleSupplier leftYInput, DoubleSupplier rightYInput)
  {
    _drive = drive;

    _leftXInput  = leftXInput;
    _leftYInput  = leftYInput;
    _rightYInput = rightYInput;
  }

  @Override
  public void execute()
  {
    double left = _leftYInput.getAsDouble();
    double right = _rightYInput.getAsDouble();
    double drive = left;
    double rotate = _leftXInput.getAsDouble();

    _drive.drive(left, right, drive, rotate);
  }

  @Override
  public boolean isFinished()
  {
    return false;
  }
}
