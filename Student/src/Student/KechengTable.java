package Student;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class KechengTable extends Data{

	public KechengTable(){
		this.setBounds(0, 0,990,720);
		this.setLayout(new BorderLayout());
		JPanel jpanel5 = new JPanel();
		JButton tianjia=new JButton("Ìí¼Ó");
		JButton shanchu=new JButton("É¾³ý");
		JTextField kechengt=new JTextField();
		kechengt.setPreferredSize(new Dimension(200,30));
		this.add(jpanel5,BorderLayout.NORTH);
		jpanel5.add(kechengt);
	    jpanel5.add(tianjia);
	    jpanel5.add(shanchu);
	    
	    JScrollPane js2;
		DefaultTableModel tablem3;
		JTable table2;
		tablem3=new DefaultTableModel(Data.kecheng,0);
		table2=new JTable(tablem3);
		js2=new JScrollPane(table2);
		this.add(js2,BorderLayout.CENTER);
	    
		tianjia.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				String temp=new String();
				temp=kechengt.getText();
				Data.tianjiakecheng(temp);
				kechengt.setText("");
				try {
					Data.kecheng=Menu.daoru2();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Menu.update2();
//				
			}
		});
		
		shanchu.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				String temp=new String();
				temp=kechengt.getText();
				Data.shanchukecheng(temp);
				kechengt.setText("");
				try {
					Data.kecheng=Menu.daoru2();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Menu.update2();		
			}
		});
		
	}
}
