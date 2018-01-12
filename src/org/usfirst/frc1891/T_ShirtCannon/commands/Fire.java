package org.usfirst.frc1891.T_ShirtCannon.commands;

import org.usfirst.frc1891.T_ShirtCannon.Robot;
import org.usfirst.frc1891.T_ShirtCannon.subsystems.SolenoidController;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;;

public class Fire extends Command {
	
	private Timer shotTimer = new Timer();
	private SolenoidController.Solenoid targetSolenoid;
	
	public Fire() {
		requires(Robot.solenoidController);
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    	targetSolenoid = Robot.solenoidController.targetSolenoid;
    	if (targetSolenoid == SolenoidController.Solenoid.TopLeft) {
    		Robot.solenoidController.setTopLeftSolenoidOutput(true);
    	}
    	else if (targetSolenoid == SolenoidController.Solenoid.BottomLeft) {
    		Robot.solenoidController.setBottomLeftSolenoidOutput(true);
    	}
    	else if (targetSolenoid == SolenoidController.Solenoid.TopRight){
    		Robot.solenoidController.setTopRightSolenoidOutput(true);
    	}
    	else if (targetSolenoid == SolenoidController.Solenoid.BottomRight){
    		Robot.solenoidController.setBottomRightSolenoidOutput(true);
    	}
    	shotTimer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return shotTimer.hasPeriodPassed(0.1);
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	Robot.solenoidController.setTopLeftSolenoidOutput(false);
    	Robot.solenoidController.setBottomLeftSolenoidOutput(false);
    	Robot.solenoidController.setTopRightSolenoidOutput(false);
    	Robot.solenoidController.setBottomRightSolenoidOutput(false);
    	shotTimer.stop();
    	shotTimer.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
	
}
