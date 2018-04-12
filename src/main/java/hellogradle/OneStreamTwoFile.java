package hellogradle;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OneStreamTwoFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyDataOutputStream mdos = new MyDataOutputStream(new ByteArrayOutputStream());
		mdos.writeUTF8("testContent", "file1", "file2");
	}

}

class MyDataOutputStream extends DataOutputStream {
	public MyDataOutputStream(OutputStream out) {
		super(out);
		// TODO Auto-generated constructor stub
	}

	public final void writeUTF8(String str,String fileName1,String fileName2) throws Exception {
		DataOutputStream dos1 = new DataOutputStream(new FileOutputStream(fileName1));
		DataOutputStream dos2 = new DataOutputStream(new FileOutputStream(fileName2));
		dos1.writeUTF(str);
		dos2.writeUTF(str);
	}
}