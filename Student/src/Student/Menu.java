package Student;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Menu extends Showw {
	static int chengjitime=1;
	static JDesktopPane cpanel=new JDesktopPane();
	
	public  Menu(){
		cpanel.setBounds(0,50,990,720);
		this.add(cpanel,BorderLayout.CENTER);
		//������
		
		this.setBounds(0,0,990,770);
		this.setLayout(new BorderLayout());
		//����panel2����
		
		JMenuBar menubar=new JMenuBar();
		JMenu chengji=new JMenu("�ɼ�");
		JMenu kecheng=new JMenu("�γ�");
		//�������
		
		
		

		menubar.setBounds(0,0,990,50);
		//�������
		this.add(menubar,BorderLayout.NORTH);
		menubar.add(chengji);
		menubar.add(kecheng);
		//������
		//�����ɼ�jtable
		chengji.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
			//��ֹ��ε���ظ�ˢ��
				if(chengjitime==1){
				try {
					daoru1();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DataTable jtable=null;
				jtable=new DataTable();
				cpanel.removeAll();
				cpanel.add(jtable);
				chengjitime++;
			
			}
				else{
					DataTable jtable=null;
					jtable=new DataTable();
					cpanel.removeAll();
					cpanel.add(jtable);
				}
				}
			
		});
		//�����γ�jtable
		kecheng.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				
				KechengTable jtable2=null;
				jtable2=new KechengTable();
				cpanel.removeAll();
				cpanel.add(jtable2); 
			}
		});
		
	}
//		shuaxin.addMouseListener(new MouseAdapter(){
//			public void mouseClicked(MouseEvent e){
//				DataTable jtable=null;
//				jtable=new DataTable();
//				cpanel.add(jtable); 
//			}
//		});
	
	//������Ϣ�������ʾ�µĳɼ�����
	public static void update(){
		DataTable jtable=null;
		jtable=new DataTable();
		cpanel.removeAll();
		cpanel.add(jtable);
	}
	
	public static void update2(){
		KechengTable jtable2=null;
		jtable2=new KechengTable();
		cpanel.removeAll();
		cpanel.add(jtable2); 
	}
	
	//����ɼ�/data����
	public static void daoru1() throws IOException{
		aa=Data.getArray();
		int x=aa[0].length;
		for(int ii=0;ii<aa.length;ii++){
			Data.data.add(aa[ii]);
		}
		}
	
	//����kecheng����
	public static String[] daoru2() throws IOException{
			String a[]=null;
			a=Data.getArrayy();
			ArrayList<String> atemp=new ArrayList<>();
//		for(int i=0;i<Data.kechengg.length;i++){
//			System.out.println(Data.kechengg[i]);
//		}
//			for(int i=0;i<a.length;i++){
//				System.out.println(a[i]);
//			}
			for(int i=0;i<Data.kechengg.length;i++){
				atemp.add(Data.kechengg[i]);
			}
			if(a!=null){
			for(int i=0;i<a.length;i++){
				atemp.add(a[i]);
			}
			}
			return Data.zhuanhuaa(atemp);
			//��������ڵ�����γ����ļ��еĿγ̾������¿γ�
	}
}
	


