package ex1;

public class Runner {

	
	//I used Adapter design pattern
	public static void main(String[] args) {
		
		EnemyTank enemyTank=new EnemyTank();
		BadHelicopter badHelicopter=new BadHelicopter();
		BadHelicopterAdapter adapter=new BadHelicopterAdapter(badHelicopter);
		
		adapter.turnRight();
		adapter.turnLeft();
		adapter.driveForward();
		adapter.driveBackward();
		adapter.firingWeapon();
		
	}

}
