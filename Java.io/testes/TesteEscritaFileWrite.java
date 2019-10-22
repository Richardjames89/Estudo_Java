import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWrite {

public static void main(String[] args) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Richard2.txt"));
		
		bw.write("Bla,bla,bla");
		bw.newLine();
		bw.write("HuehuehueBR,HuehueheuheueheuehBr");
		bw.close();
	}

}
