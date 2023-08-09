package Java11;

import java.io.IOException;
import java.nio.file.*;

public class FileReadWrite {
	
	public static void main(String[] args) throws IOException {
		Path filePath = Files.writeString(Files.createTempFile("demo", ".txt"), "Sample text");
		String fileContent = Files.readString(filePath);
		System.out.println("file created: "+fileContent);
	}

}
