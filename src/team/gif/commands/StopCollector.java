package team.gif.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Patrick
 */
public class StopCollector extends CommandGroup {
    
    public StopCollector() {
        addSequential(new EarsClosed());
        addSequential(new CollectorStandby());
    }
}
