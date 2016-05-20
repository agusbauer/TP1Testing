package myLinkedList;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		// TODO Auto-generated method stub
		//System.setProperty("java.home", "/Library/Java/JavaVirtualMachines/jdk1.8.0_74.jdk/Contents/Home/");
		System.out.println(System.getProperty("java.home"));
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println("hola:" +compiler.toString());
	    	
	}

}
