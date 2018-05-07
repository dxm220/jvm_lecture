package pers.dxm.jvm.classloader;

/**
 * Created by douxm on 2018\5\4 0004.
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyChild2.str);
    }
}

class MyParent2 {
    public static String str = "parent";

    static {
        System.out.println("Parent static block");
    }
}

class MyChild2 extends MyParent2 {
    public static String str = "child";

    static {
        System.out.println("Child static block");
    }
}
