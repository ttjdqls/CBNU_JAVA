package ChoiceTest;

import java.awt.* ;
class ChoiceTest extends Frame 
{
	Choice ch;
	public ChoiceTest(String str)
	{
		super(str);
		ch= new Choice();
		ch.addItem("�̴�");
		ch.addItem("����");
		ch.addItem("����");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		new ChoiceTest("�޺� �ڽ� ����");
	}
}
