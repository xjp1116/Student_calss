package Student;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DataTable extends Data {
		public DataTable(){
		
			this.setBounds(0, 0,990,720);
			
			JPanel panel3=new JPanel();
			JTextField jtext=new JTextField();
			jtext.setPreferredSize(new Dimension(200,30));
			JButton chaxun=new JButton("查询");
			JButton shanchu=new JButton("删除");
			JButton zengjia=new JButton("增加");
			JButton xiugai=new JButton("修改");
			
			//定义成绩界面组件
		
			
			this.setLayout(new BorderLayout());
			panel3.add(jtext);
			panel3.add(chaxun);
			panel3.add(zengjia);
			panel3.add(xiugai);
			panel3.add(shanchu);
			this.add(panel3,BorderLayout.NORTH);
			//添加
			
			JScrollPane js1;
			DefaultTableModel tablem;
			JTable table;
			//定义表格需要

			
			tablem=new DefaultTableModel(Data.zhuanhua(Data.data),Data.kecheng);
			table=new JTable(tablem);
			js1=new JScrollPane(table);
			this.add(js1,BorderLayout.CENTER);
			
			
			JFrame jframe2=new JFrame();
		    Dimension Size=Toolkit.getDefaultToolkit().getScreenSize();
			int Wide=(Size.width-990)/2;
			int Hight=(Size.height-770)/2;
		    jframe2.setBounds(Wide+200,Hight+200,570,470);
			jframe2.setResizable(false);
			
			Font ff=new  Font("宋体",Font.PLAIN,25);
		    JPanel panel4=new JPanel();
			jframe2.add(panel4);
			JButton tijiao=new JButton("提交");
			tijiao.setBounds(400, 200, 100, 50);
		    JLabel xingming=new JLabel("姓名");
		    xingming.setFont(ff);
			xingming.setBounds(100, 50,50,20);
			JTextField xingmingt=new JTextField(10);
			xingmingt.setBounds(200, 50, 100, 20);
			JLabel gaoshu=new JLabel("高数");
			gaoshu.setFont(ff);
			gaoshu.setBounds(100,150,50,20);
			JTextField gaoshut=new JTextField(10);
			gaoshut.setBounds(200,150,100,20);
			JLabel dawu=new JLabel("大物");
			dawu.setFont(ff);
			dawu.setBounds(100,250,50,20);
			JTextField dawut=new JTextField(10);
			dawut.setBounds(200,250,100,20);
			JLabel lisan=new JLabel("离散");
			lisan.setFont(ff);
			lisan.setBounds(100,350,50,20);
			JTextField lisant=new JTextField(10);
			lisant.setBounds(200,350,100,20);
			panel4.add(tijiao);
			panel4.add(xingming);
			panel4.add(xingmingt);
			panel4.add(gaoshu);
			panel4.add(gaoshut);
			panel4.add(dawu);
			panel4.add(dawut);
			panel4.add(lisan);
			panel4.add(lisant);
			panel4.setLayout(null);
			
			
			
			
			chaxun.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					TableModel tablem2=new DefaultTableModel(Data.secarch(0,jtext.getText(),1),Data.kecheng);
					table.setModel(tablem2);
					jtext.setText("");
				}
			});
			
			
			shanchu.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					Data.shanchu(jtext.getText());
					Menu.update();
					jtext.setText("");
					Data.baocun();
				}
			});
			
			
			zengjia.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
				   //开辟新窗口
					jframe2.setVisible(true);
					xingmingt.setText(null);
					gaoshut.setText(null);
					dawut.setText(null);
					lisant.setText(null);

					tijiao.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							String a[]=new String[]{xingmingt.getText(),gaoshut.getText(),dawut.getText(),lisant.getText()};
							Data.tijiao1(a);
							jframe2.dispose();
							Data.baocun();
							Menu.update();
						}
					});
				/*for(int i=0;i<kecheng.length;i++){
					JOptionPane.showInputDialog(null, "请输入"+kecheng[i],null,JOptionPane.INFORMATION_MESSAGE);
					}*/
				}
			});
			
			xiugai.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e) {
					String b[][]=Data.secarch(0,jtext.getText(), 2);
					if(b!=null){
					jframe2.setVisible(true);
					gaoshut.setText(null);
					dawut.setText(null);
					lisant.setText(null);
					xingmingt.setText(b[0][0]);
					gaoshut.setText(b[0][1]);
					dawut.setText(b[0][2]);
					lisant.setText(b[0][3]);
//					Data.xiugai(xiugai);
					tijiao.addMouseListener(new MouseAdapter(){
						public void mouseClicked(MouseEvent e){
							String bb[]=new String[]{xingmingt.getText(),gaoshut.getText(),dawut.getText(),lisant.getText()};
							Data.tijiao2(bb,xingmingt.getText());
							jframe2.dispose();
							Data.baocun();
							Menu.update();
						}
					
					});
					
					
					
				}
				}
			});
			
			
			
		}
		
   
	
	}

