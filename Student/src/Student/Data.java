package Student;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Data extends Main {

	public static  String[] kechengg={"名称","高数","大物","离散"};
//	public static ArrayList<String> kechengg=new ArrayList<>();
	public static String[] kecheng;
	
	
	public static  List<String[]> data =new ArrayList<>();
	private static int maxid=10;
	
	//将存有字符数组的list转化为二位数组
	public static String[][] zhuanhua(List<String[]> list){
		String[][] chengji= new String[list.size()][];
		for (int i = 0;i < list.size();i++){
			chengji[i] = list.get(i);
		}
		return chengji;
	}
	
	//将存字符的list转化为一维数组
	public static String[] zhuanhuaa(List<String> list){
		String[] chengji= new String[list.size()];
		for (int i = 0;i < list.size();i++){
			chengji[i] = list.get(i);
		}
		return chengji;
	}

	//判断姓名是否存在
	public static String[][] secarch(int l,String text,int x) {
		List<String[]> result =new ArrayList();
		Boolean temp=false;
		for(String neww[]:data){
			if(neww[l].toString().contains(text)){
				result.add(neww);
				temp=true;
			}
		}
		if(temp==false){
			if(x==1){
			JOptionPane.showMessageDialog(null,"查找不存在","系统提示",JOptionPane.WARNING_MESSAGE);
			return zhuanhua(data);
			}
			else{
			JOptionPane.showMessageDialog(null,"修改不存在","系统提示",JOptionPane.WARNING_MESSAGE);
			return null;
			}
		}
		return  zhuanhua(result);
		
	}
	
	//用于将新增数据存入data中
	public static void tijiao1(String []a){
		data.add(a);
	}
	
	public static void tijiao2(String []a,String temp){
		for(int i=0;i<data.size();i++){
			if(data.get(i)[0].equals(temp)){
				data.set(i,a);
			break;
			}
		}
	}
	
	//用于将要删除数据从data中移除
	public static void shanchu(String a){
		Boolean c=false;
		for(int i=0;i<data.size();i++){
			if(data.get(i)[0].equals(a)){
				data.remove(i);
				c=true;
				break;
			}
			
		}
		if(c==false){
			JOptionPane.showMessageDialog(null,"无法删除","系统提示",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	
	public static void tianjiakecheng(String s) {
		String[]a=null;
		try {
			a=getArrayy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(a!=null){
		String b[]=new String[a.length+1];
		int i=0;
		for(;i<a.length;i++){
			b[i]=a[i];
		}
		b[i]=s;
		try {
			saveArrayy(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			String b[]=new String[1];
			b[0]=s;
			try {
				saveArrayy(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	
	
	public static  void  shanchukecheng(String s) {
		int i=0;
		Boolean c=false;
		String b[]=null;
		try {
			b=Data.getArrayy();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		for(int k=0;k<b.length;k++){
//			System.out.println(b[k]);
//		}
		ArrayList<String> a=new ArrayList<>();
		for(;i<b.length;i++){
			if(b[i].equals(s))
			{
				c=true;
				break;
			}
		}
		if(c==false){
			JOptionPane.showMessageDialog(null,"无法删除","系统提示",JOptionPane.WARNING_MESSAGE);
		}
		else{
			for(int j=0;j<b.length;j++){
				if(j!=i){
					a.add(b[j]);
				}
			}
			}
		String aa[]=Data.zhuanhuaa(a);
			try {
				Data.saveArrayy(aa);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		
		
		
	
	
	//将data保存至文件
	public static void saveArray (String[][] o) throws IOException{
		
		File file=new File("chengji.txt");
		BufferedWriter in = new BufferedWriter(new FileWriter(file));  
		int x=o[0].length;
		for(int i=0;i<o.length;i++){
			for(int j=0;j<x-1;j++){
			in.write(o[i][j]+",");
		}
			in.write(o[i][x-1]+"");
			in.newLine();
		}
		in.flush();
			
	}
	//将data从文件导出
	public static String[][] getArray() throws IOException  {
		FileReader reader = new FileReader("chengji.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String a[][]=null;
		ArrayList<String> s = new ArrayList<>();
		String lines;
		while((lines = br.readLine()) != null) {
			//把读取的行添加到list中
			s.add(lines);
		}
		int linenum = s.size();

		
		String ss=s.get(0);
		int col = ss.split("\\,").length;
		a=new String[s.size()][col];
		int i=0;
		for(String str1:s){
			String[] str2=str1.split("\\,");
			for(int j=0;j<col;j++){
				a[i][j]=str2[j];
			}
			i++;
		}
		return a;
	
		
	}
	
	//用于间接调用saveArray()
	public static void baocun(){
		String[][] a=Data.zhuanhua(data);
		try {
			Data.saveArray(a);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	//将比原kecheng多的部分保存至文件
  public static void saveArrayy(String[] o) throws IOException{
		
		File file=new File("kecheng.txt");
		BufferedWriter in = new BufferedWriter(new FileWriter(file));  

		for(int i=0;i<o.length;i++){
			in.write(o[i]+",");
		
		}
		in.flush();
	}
		
	//将文件中比kecheng多的部分导出
public static String[] getArrayy() throws IOException  {
	
	FileReader reader = new FileReader("kecheng.txt");
	BufferedReader br = new BufferedReader(reader);
//	ArrayList<String> s = new ArrayList<>();
	String lines;
	lines = br.readLine();
	if(lines!=null){
	String[] str2=lines.split("\\,");
	return str2;
	}
	else {
		return  null;
	}
    }
	
}
