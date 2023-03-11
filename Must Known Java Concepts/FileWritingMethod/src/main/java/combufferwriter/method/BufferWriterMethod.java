package combufferwriter.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String location="BufferWriterMethod.txt";
		 String content="Eagle is Coming";
		 FileWriter fileWriter=new FileWriter(location);
		 BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		 bufferedWriter.write(content);
		 bufferedWriter.close();

	}

}
