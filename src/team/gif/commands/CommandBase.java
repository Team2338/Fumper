package team.gif.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team.gif.OI;
import team.gif.subsystems.*;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static CollectorMotor collectorMotors = new CollectorMotor();
    public static CollectorPneumatics collectorPneumatics = new CollectorPneumatics();
    public static Bumper bumper = new Bumper();
    public static Shifter shifter = new Shifter();
    public static Shooter shooter = new Shooter();
    public static Ears ears = new Ears();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(collectorPneumatics);
        SmartDashboard.putData(collectorMotors);
        SmartDashboard.putData(bumper);
        SmartDashboard.putData(shooter);
        SmartDashboard.putData(shifter);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
