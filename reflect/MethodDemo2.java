package com.imooc.reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class MethodDemo2 {
	public static void main(String[] args) {
		UserService us = new UserService();
		/*
		 * 通过键盘输入命令执行操作
		 * 输入update命令就调用update方法
		 * 输入delete命令就调用delete方法
		 * ...
		 */
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("请输入命令:");
			String action = br.readLine();
			/*if("update".equals(action)){
				us.update();
			}
			if("delete".equals(action)){
				us.delete();
			}
			if("find".equals(action)){
				us.find();
			}*/
			/*
			 * action就是方法名称， 都没有参数--->通过方法的反射操作就会简单很多
			 * 通过方法对象然后进行反射操作
			 */
			Class c = us.getClass();
			Method m = c.getMethod(action);
			m.invoke(us);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
