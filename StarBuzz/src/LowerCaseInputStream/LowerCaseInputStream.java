package LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(BufferedInputStream bufferedInputStream) {
		super(bufferedInputStream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c=in.read();
		return c == -1 ?c:Character.toLowerCase((char)c);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int res=in.read(b, off, len);
		for(int i=off;i<off+res;i++) {
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return res;
	}

}
