package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Jaguar;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class Drive extends SubsystemBase
{
    private Jaguar _left1;
    private Jaguar _left2;
    private Jaguar _right1;
    private Jaguar _right2;

    public enum DriveMode
    {
        Tank,
        Arcade
    };

    private DriveMode _driveMode = DriveMode.Tank;

    public Drive()
    {
        _left1 = new Jaguar(0);
        _left2 = new Jaguar(1);
        _right1 = new Jaguar(2);
        _right2 = new Jaguar(3);
    }

    public boolean isMoving()
    {
        return _left1.get() != 0 || _right1.get() != 0;
    }

    public void tankDrive(double left, double right)
    {
        _left1.set(left);
        _left2.set(left);
        _right1.set(right);
        _right2.set(right);
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
