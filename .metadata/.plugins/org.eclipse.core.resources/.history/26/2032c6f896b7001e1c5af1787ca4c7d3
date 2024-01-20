package sonar;

public class Enemy implements Character
{
	private int health = 100;
	private int lives = 10;
	
	public void Enemy()
	{
		System.out.println("Constructed");
	}
	
	public void Enemy(int i)
	{
		lives = i;
	}

	public void ReduceHealth(int damage)
	{
		setHealth(getHealth() - damage);
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}
	
}

