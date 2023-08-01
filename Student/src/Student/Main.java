package Student;
import java.io.IOException;

import javax.swing.JPanel;

public class Main extends JPanel {
	static User usertemp=new User();
	static User userx=new User();
	 static String [][]aa=null;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		userx.yonghuming="123";
		userx.mima="123";
			
		Showw show=new Showw();
		show.ShowBeginWindows();
		
	 }
}
