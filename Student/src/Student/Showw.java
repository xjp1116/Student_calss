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
	
	static JFrame jframe=new JFrame("ѧ���ɼ�����ϵͳ");
	//��½����
	public  void ShowBeginWindows(){
		// TODO Auto-generated method stub
		
		JPanel panel1=new JPanel();
		JLabel name=new JLabel("ѧ���ɼ�����ϵͳ");
		JButton begin=new JButton("����ϵͳ");
		JButton close=new JButton("�˳�ϵͳ");
		JTextField yonghumingt=new JTextField();
		JPasswordField mimat=new JPasswordField();
		JLabel yonghuming=new JLabel("�û�����");
		JLabel mima=new JLabel("���룺");
		//�������
		
		
		Dimension Size=Toolkit.getDefaultToolkit().getScreenSize();
		int Wide=(Size.width-990)/2;
		int Hight=(Size.height-770)/2;
		jframe.setBounds(Wide,Hight, 990, 770);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=jframe.getContentPane();
		container.setBackground(Color.gray);
		//���ñ���
		
		
		jframe.setLayout(null);
		name.setForeground(Color.BLUE);
		Font f=new  Font("����",Font.PLAIN,35);
		Font ff=new  Font("����",Font.PLAIN,20);
		//���������С
		
		name.setFont(f);
		yonghuming.setFont(ff);
		mima.setFont(ff);
		
		panel1.setLayout(null);
		//�ղ���
		
		name.setBounds(350,5, 500, 300);
		begin.setBounds(250,500,160,50);
		close.setBounds(580,500,160,50);
		close.addMouseListener(this);
		yonghumingt.setBounds(370, 300, 300, 50);
		mimat.setBounds(370, 400, 300, 50);
		yonghuming.setBounds(270, 300, 100, 30);
		mima.setBounds(290, 400, 100, 30);
		//����λ��
		
		panel1.setBounds(0,0,990,770);
		panel1.add(begin);
		panel1.add(name);
		panel1.add(mima);
		panel1.add(close);
		panel1.add(yonghuming);
		panel1.add(yonghumingt);
		panel1.add(mimat);
	    jframe.getContentPane().add(panel1);
		//���
	    
	    //���ý���ϵͳ����������
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
//					JOptionPane.showMessageDialog( begin.getParent(),"�û������������","ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);
//				//�ж��û�������
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
					//�л���panel2
					
				}
			}
			
		});
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		jframe.dispose();
		//�ر�
		
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