package MenuTest1;

import java.awt.*;
class MenuTest1 extends Frame 
{
	public MenuTest1(String str) 
	{
		super(str);
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		MenuItem file_new = new MenuItem("���� �����");
		MenuItem file_open = new MenuItem("����");
		MenuItem file_save = new MenuItem("����");
		MenuItem file_newname = new MenuItem("����");

		file.add(file_new); 
		file.add(file_open);
		file.add(file_save);
		file.add(file_newname);
		
		Menu tool = new Menu("����");
		MenuItem file_user = new MenuItem("����� ����");
		MenuItem file_envir = new MenuItem("ȯ�� ����");
		tool.add(file_user);
		tool.add(file_envir);
		
		Menu edit = new Menu("����");
		MenuItem edit_undo = new MenuItem("�������"); 
		MenuItem edit_cut = new MenuItem("�߶󳻱�");
		MenuItem edit_copy = new MenuItem("����");
		MenuItem edit_paste = new MenuItem("�ٿ��ֱ�");
		edit.add(edit_undo);
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);

		Menu view = new Menu("����");
		CheckboxMenuItem view_status = new CheckboxMenuItem("����ǥ����");
		view.add(view_status);
		
		mb.add(file);
		mb.add(tool);
		mb.add(edit);
		mb.add(view);
    
		setMenuBar(mb);
		setSize(200,200);
		setVisible(true);
	}
}



public class Main{
	public static void main(String[] args) {
		new MenuTest1("�޴� �׽�Ʈ 1");
	}
}
