package TextArea2;

import java.awt.* ;
class TextArea2 extends Frame {
	public TextArea2(String str){
  		super(str);
		Panel p = new Panel();
		TextArea txt1 = new TextArea(10,30);
		TextField txt2 = new TextField("Hello Java",20);	
		txt1.setText("  Java World ");
  		txt1.setBackground(Color.yellow);
  		txt1.setFont(new Font("�ü�ü",Font.BOLD, 10));
  		txt1.setForeground(Color.blue);
  		txt2.setEchoChar('@');
  		txt2.setForeground(Color.red);
  		p.add(txt1); 
  		p.add(txt2);  	
		add(p);
  		setSize(200,200);
  		setVisible(true);  	
	}
}
public class Main{
	public static void main(String[] args) {
		new TextArea2("Text �׽�Ʈ");
	}
}
