package Student;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Showw  extends Main implements MouseListener{
	
	static JFrame jframe=new JFrame("学生成绩管理系统");
	//登陆界面
	public  void ShowBeginWindows(){
		// TODO Auto-generated method stub
		
		JPanel panel1=new JPanel();
		JLabel name=new JLabel("学生成绩管理系统");
		JButton begin=new JButton("进入系统");
		JButton close=new JButton("退出系统");
		JTextField yonghumingt=new JTextField();
		JPasswordField mimat=new JPasswordField();
		JLabel yonghuming=new JLabel("用户名：");
		JLabel mima=new JLabel("密码：");
		//定义组件
		
		
		Dimension Size=Toolkit.getDefaultToolkit().getScreenSize();
		int Wide=(Size.width-990)/2;
		int Hight=(Size.height-770)/2;
		jframe.setBounds(Wide,Hight, 990, 770);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=jframe.getContentPane();
		container.setBackground(Color.gray);
		//设置背景
		
		
		jframe.setLayout(null);
		name.setForeground(Color.BLUE);
		Font f=new  Font("宋体",Font.PLAIN,35);
		Font ff=new  Font("宋体",Font.PLAIN,20);
		//设置字体大小
		
		name.setFont(f);
		yonghuming.setFont(ff);
		mima.setFont(ff);
		
		panel1.setLayout(null);
		//空布局
		
		name.setBounds(350,5, 500, 300);
		begin.setBounds(250,500,160,50);
		close.setBounds(580,500,160,50);
		close.addMouseListener(this);
		yonghumingt.setBounds(370, 300, 300, 50);
		mimat.setBounds(370, 400, 300, 50);
		yonghuming.setBounds(270, 300, 100, 30);
		mima.setBounds(290, 400, 100, 30);
		//设置位置
		
		panel1.setBounds(0,0,990,770);
		panel1.add(begin);
		panel1.add(name);
		panel1.add(mima);
		panel1.add(close);
		panel1.add(yonghuming);
		panel1.add(yonghumingt);
		panel1.add(mimat);
	    jframe.getContentPane().add(panel1);
		//添加
	    
	    //设置进入系统的鼠标监听器
		begin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
				File f=new File("kecheng.txt");
				if(!f.exists()){
					try {
						f.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			
//					
				File ff=new File("E:\\chengji.txt");
				
				if(!ff.exists()){
					try {
						ff.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				usertemp.yonghuming=yonghumingt.getText();
				usertemp.mima=new String(mimat.getPassword());
				JPanel panel2=null;
//				if(!(usertemp.yonghuming.equals(userx.yonghuming)&&(usertemp.mima.equals(userx.mima)))){
//					JOptionPane.showMessageDialog( begin.getParent(),"用户名或密码错误","系统提示",JOptionPane.WARNING_MESSAGE);
//				//判断用户名密码
//				}
				if(false){
					
				}
				else{
					try {
						Data.kecheng=Menu.daoru2();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel2=new Menu();
					jframe.setContentPane(panel2);
					//切换至panel2
					
				}
			}
			
		});
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		jframe.dispose();
		//关闭
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
 
}