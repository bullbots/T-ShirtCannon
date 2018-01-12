package org.usfirst.frc1891.T_ShirtCannon.subsystems;

import org.usfirst.frc1891.T_ShirtCannon.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SolenoidController extends Subsystem {
	
	public enum Solenoid {
		TopLeft,
		BottomLeft,
		TopRight,
		BottomRight,
	}
	
	private final Relay topLeftBarrel = new Relay(RobotMap.topLeftBarrelPort);
	private final Relay bottomLeftBarrel = new Relay(RobotMap.bottomLeftBarrelPort);
	private final Relay topRightBarrel = new Relay(RobotMap.topRightBarrelPort);
	private final Relay bottomRightBarrel = new Relay(RobotMap.bottomRightBarrelPort);
	
	public Solenoid targetSolenoid = Solenoid.TopLeft;
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void setTopLeftSolenoidOutput(boolean output) {
		if (output) {
			topLeftBarrel.set(Relay.Value.kForward);
		}
		else {
			topLeftBarrel.set(Relay.Value.kOff);
		}
	}
	public void setBottomLeftSolenoidOutput(boolean output) {
		if (output) {
			bottomLeftBarrel.set(Relay.Value.kForward);
		}
		else {
			bottomLeftBarrel.set(Relay.Value.kOff);
		}
	}
	public void setTopRightSolenoidOutput(boolean output) {
		if (output) {
			topRightBarrel.set(Relay.Value.kForward);
		}
		else {
			topRightBarrel.set(Relay.Value.kOff);
		}
	}
	public void setBottomRightSolenoidOutput(boolean output) {
		if (output) {
			bottomRightBarrel.set(Relay.Value.kForward);
		}
		else {
			bottomRightBarrel.set(Relay.Value.kOff);
		}
	}
}
