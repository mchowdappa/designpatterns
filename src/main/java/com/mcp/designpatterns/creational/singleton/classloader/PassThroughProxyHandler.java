package com.mcp.designpatterns.creational.singleton.classloader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PassThroughProxyHandler implements InvocationHandler {
    private final Object delegate;
    public PassThroughProxyHandler(Object delegate) {
        this.delegate = delegate;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Method delegateMethod = delegate.getClass().getMethod(method.getName(), method.getParameterTypes());
        return delegateMethod.invoke(delegate, args);
    }
}
