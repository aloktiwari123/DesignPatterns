package LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseStreamTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int c;
		try {
		InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/LowerCaseInputStream/test.txt")));
		
		while((c=in.read())>=0) {
			System.out.print((char)c);
		}
		in.close();
		}
		catch(Exception ex) {
			
		}
	}

}
