package pers.dxm.jvm.classloader;

/**
 * Created by IntelliJ IDEA.
 * User: dxm
 * Date: 2018\5\10 0010
 * Time: 1:22
 */
public class MyTest5 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("count1:" + Singleton.count1);
        System.out.println("count2:" + Singleton.count2);
    }
}

class Singleton {
    public static int count1 = 1;
    private static Singleton singleton = new Singleton();

    public Singleton() {
        count1++;
        count2++;
        System.out.println("构造方法中的count1为" + count1);
        System.out.println("构造方法中的count2为" + count2);
    }

    public static int count2 = 0;

    public static Singleton getInstance() {
        return singleton;
    }
}
