import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

public static void main(String[] args) throws IOException{
		
		PrintStream ps = new PrintStream("Richard2.txt");
	
		ps.println("Bla,bla,bla,belblelbelbelbleble");
		ps.println();
		ps.println("HuehuehueBR,HuehueheuheueheuehBr");
		ps.close();
	}

}
