package org.usfirst.frc1891.T_ShirtCannon.commands;

import org.usfirst.frc1891.T_ShirtCannon.Robot;
import org.usfirst.frc1891.T_ShirtCannon.subsystems.SolenoidController;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class SetTargetSolenoid extends InstantCommand {
	
	private SolenoidController.Solenoid setSolenoid;

	public SetTargetSolenoid(SolenoidController.Solenoid solenoid) {
		setSolenoid = solenoid;
	}
	
	protected void execute() {
		Robot.solenoidController.targetSolenoid = setSolenoid;
	}

}
