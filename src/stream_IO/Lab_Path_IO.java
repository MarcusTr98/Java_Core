package stream_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab_Path_IO {

	// tạo 1 hàm xử lý copy text từ 1 file, có ném lỗi với throws
	// đầu vào là path out, part in
	public static void copyTextFile(Path source, Path destination) throws IOException {

		// try-with-resource
		try (BufferedReader reader = Files.newBufferedReader(source);
				BufferedWriter writer = Files.newBufferedWriter(destination)) {
			String line;

			// nếu vẫn còn kí tự (!= null) thì còn chạy
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		// khởi tạo 2 path, chỉ vào file
		Path from = Paths.get("input.txt");
		Path to = Paths.get("output.txt");

		copyTextFile(from, to);
		System.out.println("Copied!");
	}
}
