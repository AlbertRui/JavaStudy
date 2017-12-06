package com.imooc.reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class MethodDemo2 {
	public static void main(String[] args) {
		UserService us = new UserService();
		/*
		 * ͨ��������������ִ�в���
		 * ����update����͵���update����
		 * ����delete����͵���delete����
		 * ...
		 */
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("����������:");
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
			 * action���Ƿ������ƣ� ��û�в���--->ͨ�������ķ�������ͻ�򵥺ܶ�
			 * ͨ����������Ȼ����з������
			 */
			Class c = us.getClass();
			Method m = c.getMethod(action);
			m.invoke(us);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
