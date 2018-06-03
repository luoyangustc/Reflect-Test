package demo;

import java.lang.reflect.Method;
import java.util.Scanner;

public class JUnit3 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("«Î ‰»Î¿‡√˚");
		String className = scan.nextLine();
		Class cls = Class.forName(className);
		Object obj = cls.newInstance();
		Method[] m = cls.getDeclaredMethods();
		for(Method mthods : m){
			String name = mthods.getName();
			if(name.startsWith("test")){
				mthods.setAccessible(true);
				mthods.invoke(obj);
			}
		}
		
	}
}
