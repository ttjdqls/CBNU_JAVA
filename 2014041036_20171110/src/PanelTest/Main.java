package PanelTest;

import java.awt.*;

class PanelTest extends Frame 
{
	public PanelTest(String str) 
	{
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);		
	}
}

public class Main
{
	public static void main(String[] args) 
	{
       new PanelTest("�г� �׽�Ʈ");
	}
}
