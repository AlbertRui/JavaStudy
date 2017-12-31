package me.pattern.proxy.imitate_jdk_proxy;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object o,Method m);
}
