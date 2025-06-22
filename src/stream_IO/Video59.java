package stream_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video59 {
	// phải nhét tất cả các IOexception vào
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			// các file này tìm đc ở ngang cấp vưới file src
			// phải có địa chỉ vdu ./src/package_name/txt => gọi là path
			in = new FileInputStream("minh123.txt");
			out = new FileOutputStream("output_file.txt");

			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("END");
		}
	}
}
