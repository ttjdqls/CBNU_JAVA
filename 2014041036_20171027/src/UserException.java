import java.io.BufferedReader;
import java.io.InputStreamReader;
class UserException1 extends Exception
{
	public UserException1(String message)
	{
		super(message);
	}
}
class UserException2 extends Exception
{
	public UserException2(String message)
	{
		super(message);
	}
}
public class UserException {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("�ϳ��� ���ڸ� �Է��ϼ���=>");
			int jumsu = Integer.parseInt(in.readLine());
			if(jumsu<0)
			{
				throw new UserException1("������ �ʹ� ����");
			}
			else if(jumsu>100)
			{
				throw new UserException2("������ �ʹ� ŭ");
			}
			System.out.println("�������� ���� �Է�");
			
		}
		catch(UserException1 e)
		{
			System.out.println("UserException1 ó����ƾ :");
			System.out.println(e+"�߻�");
		}
		catch(UserException2 e)
		{
			System.out.println("UserException2 ó����ƾ :");
			System.out.println(e+"�߻�");
		}
		catch(Exception e)
		{
			System.out.println("��� ���� ó�� ��ƾ");
			System.out.println(e+"�߻�");
		}

	}

}
