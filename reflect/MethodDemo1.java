package com.imooc.reflect;

import java.lang.reflect.Method;

public class MethodDemo1 {
	public static void main(String[] args) {
	   //要获取print(int ,int )方法  1.要获取一个方法就是获取类的信息，获取类的信息首先要获取类的类类型
		A a1 = new A();
		Class c = a1.getClass();
		/*
		 * 2.获取方法 名称和参数列表来决定  
		 * getMethod获取的是public的方法
		 * getDelcaredMethod自己声明的方法
		 */
	    try {
			//Method m =  c.getMethod("print", new Class[]{int.class,int.class});
	    	Method m = c.getMethod("print", int.class,int.class);
	    	
	    	//方法的反射操作  
	    	//a1.print(10, 20);方法的反射操作是用m对象来进行方法调用 和a1.print调用的效果完全相同
	        //方法如果没有返回值返回null,有返回值返回具体的返回值
	    	//Object o = m.invoke(a1,new Object[]{10,20});
	    	Object o = m.invoke(a1, 10,20);
	    	System.out.println("==================");
	    	//获取方法print(String,String)
             Method m1 = c.getMethod("print",String.class,String.class);
             //用方法进行反射操作
             //a1.print("hello", "WORLD");
             o = m1.invoke(a1, "hello","WORLD");
             System.out.println("===================");
           //  Method m2 = c.getMethod("print", new Class[]{});
                Method m2 = c.getMethod("print");
               // m2.invoke(a1, new Object[]{});
                m2.invoke(a1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     
	}
}
class A{
	public void print(){
		System.out.println("helloworld");
	}
	public void print(int a,int b){
		System.out.println(a+b);
	}
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
	}
}
