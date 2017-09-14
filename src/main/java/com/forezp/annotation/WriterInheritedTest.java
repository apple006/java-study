package com.forezp.annotation;

import java.lang.reflect.Method;

/**
 * Created by fangzhipeng on 2017/9/14.
 */
public class WriterInheritedTest extends WriterTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.forezp.annotation.WriterInheritedTest");
        if (c.isAnnotationPresent(Writer.class)) {
            Writer w = (Writer) c.getAnnotation(Writer.class);
            System.out.println("name:" + w.name() + "   age:" + w.age());
        }
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Writer.class)) {
                Writer w = method.getAnnotation(Writer.class);
                System.out.println("name:" + w.name() + "   age:" + w.age());
            }
        }
    }
}
