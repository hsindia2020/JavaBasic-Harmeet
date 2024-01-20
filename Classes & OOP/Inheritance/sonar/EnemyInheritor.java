package sonar;

class CharacterInheritor
{
	public int lives = 1;
	public float health = 100;
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
}

public class EnemyInheritor extends CharacterInheritor
{
	public void Enemy()
	{
		System.out.println("Constructed");
	}
	
	public void Enemy(int i)
	{
		lives = i;
	}
	
}

