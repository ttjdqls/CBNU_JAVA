interface Starcraft 
{
	void attack(String s);
}
  
class Terran implements Starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Terran��  " + s + "Attack");
	}
}

class Protoss implements Starcraft  
{
	public void attack(String s) 
	{
		System.out.println("Protoss��  " + s + "Attack");
	}
}

class Zerg implements Starcraft 
{
	public void attack(String s) 
	{
		System.out.println("Zerg��  " + s + "Attack");
	}
}
class Output 
{
	public static void main(String args[]) 
	{
		Starcraft obj;   
		obj = new Terran();
 		obj.attack("���� ");
		obj = new Protoss();
		obj.attack("�巡��");
		obj = new Zerg();
		obj.attack("����󸮽�ũ.");
	}
}
