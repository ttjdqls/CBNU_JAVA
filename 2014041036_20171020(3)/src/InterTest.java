interface Inter 
{
	public int a=100; 
	public final int b = 100;
	public abstract void method1();
	public void method2();         
}


public class InterTest {

	public void method1()
	{
		System.out.println("�߻�޼ҵ�");
	}
	
	public void method2()
	{
		System.out.println("�߻�޼ҵ�");
	}

	
	public static void main(String[] args) {
		
		InterTest obj = new InterTest();
		obj.method1();
		System.out.println("�������̽������� final�� ������� �ʾƵ� ������ final");
		System.out.println("�������̽������� abstract�� ������� �ʾƵ� �޼ҵ�� abstract");


	}

}
