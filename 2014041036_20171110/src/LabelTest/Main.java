package LabelTest;

import java.awt.*;
class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;
	public LabelTest(String str) {
		super(str);
		p=new Panel();
		label1=new Label("�̴�");
		label2=new Label("����", Label.CENTER);
		label3=new Label("����", Label.LEFT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1); 	p.add(label2); 	p.add(label3);
		add(p);
		setSize(300,300);
		setVisible(true);	
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		new LabelTest("���̺� �׽�Ʈ");
	}
}

