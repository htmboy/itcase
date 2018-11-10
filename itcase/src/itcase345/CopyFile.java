package itcase345;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyText4();
		
	}
	public static void copyText4() throws IOException {
		FileReader fr = new FileReader("d://web//header notes.php");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		FileWriter fw = new FileWriter("c://001//header notes.txt");
		
		BufferedReader br = new BufferedReader(lnr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String ch;
		while((ch = lnr.readLine()) != null) {
			bw.write(lnr.getLineNumber());
			System.out.println(lnr.getLineNumber());
			bw.write(ch);
			bw.newLine();
		}
		lnr.close();
		br.close();
		bw.close();
	}
	public static void copyText3() throws IOException {
		FileReader fr = new FileReader("d://web//header notes.php");
		FileWriter fw = new FileWriter("c://001//header nowes.txt");
		
		char[] ch = new char[1024];
		int len;
		while((len = fr.read(ch)) != -1) {
			fw.write(ch, 0, len);
		}
		fr.close();
		fw.close();
	}
	public static void copyText2() throws IOException {
		FileReader fr = new FileReader("d://web//header notes.php");
		FileWriter fw = new FileWriter("c://001//header notes.txt");
		
		int len;
		while((len = fr.read()) != -1) {
			System.out.println(len);
			fw.write((char)len);
		}
		fr.close();
		fw.close();
	}
	public static void copyText() throws IOException {
		FileReader fr = new FileReader(new File("d://web//header_notes.php"));
		FileWriter fw = new FileWriter("c://001//header notes.txt");
		
		StringBuilder buf = new StringBuilder();
		int len;
		while((len = fr.read()) != -1) {
			buf.append((char)len);
		}
		fw.write(buf.toString());
		System.out.println(buf.toString());
		fr.close();
		fw.close();
	}

}
