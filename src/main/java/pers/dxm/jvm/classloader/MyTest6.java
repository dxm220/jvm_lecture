package pers.dxm.jvm.classloader;

/**
 * Created by IntelliJ IDEA.
 * User: dxm
 * Date: 2018\5\14 0014
 * Time: 15:09
 */
public class MyTest6  {
    public static void main(String[] args) throws Exception{
        Class<?> clazz1 = Class.forName("java.lang.String");
        System.out.println(clazz1.getClassLoader());
        Class<?> clazz2 = Class.forName("pers.dxm.jvm.classloader.Test");
        System.out.println(clazz2.getClassLoader());
    }

}

class Test {
}
