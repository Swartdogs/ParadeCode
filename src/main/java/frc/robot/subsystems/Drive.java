package frc.robot.subsystems;

import frc.robot.abstraction.Motor;
import frc.robot.abstraction.SwartdogSubsystem;

public abstract class Drive extends SwartdogSubsystem
{
    protected Motor _left;
    protected Motor _right;

    public enum DriveMode
    {
        Tank,
        Arcade
    };

    private DriveMode _driveMode = DriveMode.Tank;

    public boolean isMoving()
    {
        return _left.get() != 0 || _right.get() != 0;
    }

    public void tankDrive(double left, double right)
    {
        _left.set(left);
        _right.set(right);
    }

    public void arcadeDrive(double drive, double rotate)
    {
        double left = drive + rotate;
        double right = drive - rotate;

        double scale = Math.max(1, Math.max(Math.abs(right), Math.abs(left)));
        
        left /= scale;
        right /= scale;

        tankDrive(left, right);
    }

    public void changePreferredDriveMode()
    {
        _driveMode = (_driveMode == DriveMode.Tank) ? DriveMode.Arcade : DriveMode.Tank;
    }

    public DriveMode getPreferredDriveMode()
    {
        return _driveMode;
    }
}
