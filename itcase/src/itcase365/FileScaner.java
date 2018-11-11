package itcase365;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileScaner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		scaner8(new File("d:\\xftp"));
	}
	
	
	private static void scaner8(File dir) {
		System.out.println(dir);
		// TODO Auto-generated method stub
		File[] files = dir.listFiles();
		for(File name : files) {
			if(name.isDirectory() && !name.isHidden())
				scaner8(name);
			System.out.println("file: " + name);
		}
//		for(int i = 0; i <= files.length; i++) {
////			if(files[i].isDirectory() && !files[i].isHidden()) {
////				scaner8(files[i]);
////			}	
////			else
//			System.out.println("file:"+files[i]);
//		}
		
		
	}


	private static void scaner7() {
		// TODO Auto-generated method stub
		File f = new File("d:" + File.separator);
		File[] files = f.listFiles(new FilterByFile());
		for(File name : files) {
			System.out.println(name);
		}
	}

	private static void scaner6() {
		// TODO Auto-generated method stub
		File f = new File("d:" + File.separator);
		String[] files = f.list(new FilterByTxt(".jpg"));
		for(String name : files) {
			System.out.println(name);
		}
	}

	private static void scaner5() {
		// TODO Auto-generated method stub
		File[] f = File.listRoots();
		for(File file : f) {
			System.out.println(file);
		}
	}

	public static void scaner4() {
		File f1 = new File("c:" + File.separator + "001" + File.separator + "001");
		File f2 = new File("c:" + File.separator + "001" + File.separator + "002");
		System.out.println(f1.renameTo(f2));
	}
	public static void scaner3() {
		File f1 = new File("c:" + File.separator + "001" + File.separator + "001");
		System.out.println(f1.isDirectory());
		if(!f1.isDirectory() && f1.exists())
			f1.delete();
		else
			f1.mkdir();
	}
	public static void scaner2() throws IOException {
		File f1 = new File("c:" + File.separator + "001" + File.separator + "001.php");
		if(f1.exists())
			f1.deleteOnExit();
		else
			f1.createNewFile();
	}
	
	public static void scaner1() {
		File f1 = new File("c:" + File.separator + "001" + File.separator + "header nowes.txt");
		
		System.out.println(f1);
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.length());
		long time = f1.lastModified();
		System.out.println(time);
		
		Date date = new Date(time);
		DateFormat dateformat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String str_time = dateformat.format(date);
		System.out.println(str_time);
	}

}
