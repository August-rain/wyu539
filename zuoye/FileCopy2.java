package p1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy2 {
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\git\\wyu539\\mylife.txt"));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\git\\wyu539\\mylife_cop.txt"));
	int len = 0;
	byte[] bytes = new byte[1024];while((len=bi.read(bytes))!=-1)
	{
		bos.write(bytes, 0, len);
	}bos.close();bis.close();
}
