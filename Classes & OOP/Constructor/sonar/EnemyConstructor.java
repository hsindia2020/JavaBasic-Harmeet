package sonar;

public class EnemyConstructor
{
	public int lives = 1;
	public float health = 100;
	
	public EnemyConstructor()
	{
		System.out.println("Constructed");
	}
	
	public EnemyConstructor(int i)
	{
		lives = i;
		i++;
	}
	
	public void ReduceHealth(int damage)
	{
		health -= damage;
	}
	
}
