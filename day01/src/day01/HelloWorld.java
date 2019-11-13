package day01;
/**
 * public 公开的 公共的  访问修饰符   决定了这个类的工作范围   
 * class  是一个关键字  来标识一个类
 * HelloWorld  当前类的名字
 */

public class HelloWorld {
//	当前类中的所有内容都必须写在这一对大括号内
	
//	java中所有的代码都必须写在方法里面
	
	/**
	 * 	main 方法
	 * 	main方法是程序的入口
	 *  当需要执行一个代码的时候，系统首先去找main方法，直接执行main方法中的代码
	 *  
	 * 	public 访问修饰符
	 * 	static  静态修饰符  
	 *  void   没有返回值，  如果该方法需要返回值，则这里就应该写返回值的类型
	 *  main 方法的名字  
	 *  (String [] args)   调用方法的时候传入的参数
	 */
	public static void main(String [] args){
		//  这一对大括号之间 是main方法的方法体
		//执行main方法，就是在执行这一对大括号中的内容
		System.out.println("Hello World");
		System.out.println("你只需要比昨天强一点");
		System.out.println("还是要做一次修稿");
		
	}

}
