package itcase365;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByTxt implements FilenameFilter {
	private String suffix;
	
	public FilterByTxt(String name) {
		super();
		suffix = name;
	}
	public boolean accept(File arg0, String arg1) {
		// TODO Auto-generated method stub
		
		return arg1.endsWith(suffix);
	}

}
