package ex1;

public class BadHelicopterAdapter implements Enemy {
	BadHelicopter badHelicopter;
	
	public BadHelicopterAdapter(ex1.BadHelicopter badHelicopter) {
		this.badHelicopter = badHelicopter;
	}
	

	@Override
	public void turnRight() {
		this.badHelicopter.yawsRight();
	}

	@Override
	public void turnLeft() {
		this.badHelicopter.yawsRight();
		
	}

	@Override
	public void driveForward() {
		this.badHelicopter.fliesUp();
		
	}

	@Override
	public void driveBackward() {
		this.badHelicopter.fliesDown();
		
	}

	@Override
	public void firingWeapon() {
		this.badHelicopter.launchesMssile();
	}
	
	

}
