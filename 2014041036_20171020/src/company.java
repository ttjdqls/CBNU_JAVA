import java.io.BufferedReader;
import java.io.InputStreamReader;


public class company {

	public static void main(String[] args) {
		
		String result = "";
		Employee emp = null;
		Manager mng = null;
		String empNo = null;
		String name = null;
		String part = null;
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� : ");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ : ");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 : ");
			position = in.readLine();
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}

		if (position.equals("1"))
		{
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
		}
		
		else
		{
			position = (position.equals("2")) ? "�븮" : "����";
			mng = new Manager(empNo, name, part, position);
			result += mng.resultStr() + mng.addStr();
			//result += mng.addStr();
		}
		
		System.out.println(result);
		

	}

}
