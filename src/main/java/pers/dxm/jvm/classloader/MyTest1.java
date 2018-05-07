package pers.dxm.jvm.classloader;

/**
 * Created by douxm on 2018\5\4 0004.
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}

class MyParent1 {
    public static String str = "parent";

    static {
        System.out.println("Parent static block");
    }
}

class MyChild1 extends MyParent1 {
    static {
        System.out.println("Child static block");
    }
}
