package demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入类名");
		String className = scan.nextLine();
		Class cls = Class.forName(className);
		System.out.println(cls);
		System.out.println(cls.getName());
		
		Object obj = cls.newInstance();
		System.out.println(obj);
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
		
		System.out.println("请输入方法名");
		String name = scan.nextLine();
		Method m = cls.getDeclaredMethod(name);
		Object val = m.invoke(obj);
		System.out.println(val);
	}
}







