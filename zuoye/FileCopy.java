package Flow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopy {

	
	public static void main(String[] args) throws IOException{
		
		String f1 ="E:/LiangXi/myfile.txt";
		String f2="E:/LiangXi/myfile_cp.txt";
		FileInputStream fi= null;
		FileOutputStream fo= null;
		FileChannel in= null;
		FileChannel out= null;
		try {
			
			fi =new FileInputStream(f1);
			fo =new FileOutputStream(f2);
			in =fi.getChannel();
			out =fo.getChannel();
			in.transferTo(0, in.size(), out);
			
		} catch (Exception e) 
		{e.printStackTrace();
		} finally {
			try {
			fi.close();
			in.close();
			fo.close();
			out.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
			} 
			System.out.println("E:/LiangXi/Copy文件夹文件复制成功");
			} 
			// TODO: handle exception
		}


