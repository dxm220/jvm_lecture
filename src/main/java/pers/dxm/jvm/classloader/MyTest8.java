package pers.dxm.jvm.classloader;

/**
 * Created by IntelliJ IDEA.
 * User: dxm
 * Date: 2018\5\15 0015
 * Time: 11:06
 */
class CL {
    static {
        System.out.println("class CL");
    }
}

public class MyTest8 {
    public static void main(String[] args) throws Exception {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = loader.loadClass("pers.dxm.jvm.classloader.CL");
        System.out.println(clazz);
        System.out.println("--------");
        clazz = Class.forName("pers.dxm.jvm.classloader.CL");
        System.out.println(clazz);
    }
}
