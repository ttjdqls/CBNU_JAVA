package ListTest;

import java.awt.*;
class ListTest extends Frame
{
	Panel p;
	List list;
	public ListTest(String str)
	{		
		super(str);
		p=new Panel();
		list=new List(2,true);
		list.add("�̴�");
		list.add("����");
		list.add("����");
		list.add("����");
		p.add(list);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
}

public class Main{
	public static void main(String[] args) {
		new ListTest("��Ƽ ���� ����Ʈ");
	}
}
