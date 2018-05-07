package pers.dxm.jvm.classloader;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: dxm
 * Date: 2018\5\7 0007
 * Time: 11:34
 */
public class MyTest4 {
    public static void main(String[] args) {
        System.out.println(Test2.s);
    }
}

class Test2 {
    public static final String s = UUID.randomUUID().toString();

    static {
        System.out.println("This is Test2");
    }
}
