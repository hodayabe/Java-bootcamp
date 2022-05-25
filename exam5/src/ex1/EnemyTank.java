package ex1;

public class EnemyTank implements Enemy {

	@Override
	public void turnRight() {
		System.out.println("EnemyTank is turn Right ");
	}

	@Override
	public void turnLeft() {
		System.out.println("EnemyTank is turnLeft ");
		
	}

	@Override
	public void driveForward() {
		System.out.println("EnemyTank is driveForward ");
	}

	@Override
	public void driveBackward() {
		System.out.println("EnemyTank is driveBackward ");
	}

	@Override
	public void firingWeapon() {
		System.out.println("EnemyTank is firingWeapon ");
	}

	
	
	
	

}
