package pers.dxm.jvm.classloader;

/**
 * Created by douxm on 2018\5\6 0006.
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(Test1.s);
    }
}

class Test1 {
    public final static String s = "hello world";

    static {
        System.out.println("This is Test1");
    }
}