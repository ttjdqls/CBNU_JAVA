interface C1 
{
	void method1();
	void method2();
}
interface C2 
{
	void method3();
}

interface C3 extends C1,C2 
{
	void method4();
}

class C implements C3 
{
	public void method1() 
	{
		System.out.println("method1() �޼ҵ��� ����");
	}
	public void method2() 
	{
		System.out.println("method2() �޼ҵ��� ����");
	}
	public void method3() 
	{
		System.out.println("method3() �޼ҵ��� ����");
	}
	public void method4() 
	{
		System.out.println("method4() �޼ҵ��� ����");
	}
}

public class InterfaceInheritance {

	public static void main(String[] args) {
		
		C obj = new C();
    obj.method1();
	obj.method2();
	obj.method3();
	obj.method4();

	}

}
