package pers.dxm.jvm.classloader;

/**
 * Created by IntelliJ IDEA.
 * User: dxm
 * Date: 2018\5\15 0015
 * Time: 10:25
 */
class MyParent3 {
    public static int a = 1;

    static {
        System.out.println("This is MyParent3");
    }
}

class MyChild3 extends MyParent3 {
    public static int b = 2;

    static {
        System.out.println("This is MyChild3");
    }
}

public class MyTest7 {
    static {
        System.out.println("This is MyTest7");
    }

    public static void main(String[] args) {
        MyParent3 myParent3;
        System.out.println("---------");
        myParent3 = new MyParent3();
        System.out.println("---------");
        System.out.println(MyParent3.a);
        System.out.println("---------");
        System.out.println(MyChild3.b);
    }
}