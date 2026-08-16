package SingletonClass;

public class SingletonClass {
    public static void main(String[] args){

        //Eager Initialization
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();

        System.out.println("Eager " + (e1==e2));

        //Lazy Initalization
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();

        System.out.println("LAzy " + (l1==l2));

        //Synchronized LAzy Initialization

        SynchronizedSingleton s1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton s2 = SynchronizedSingleton.getInstance();

        System.out.println("Synchronized " + (s1==s2));

        //Double checked

        DoubleChecked d1 = DoubleChecked.getInstance();
        DoubleChecked d2 = DoubleChecked.getInstance();

        System.out.println("Double check " + (d1==d2));

        // Bill Pugh

        BillPugh b1 = BillPugh.getInstance();
        BillPugh b2 = BillPugh.getInstance();

        System.out.println("Bill Pugh "+ (b1==b2));

        // Enum Singletom

        EnumSingleton en1 = EnumSingleton.instance;
        EnumSingleton en2 = EnumSingleton.instance;

        System.out.println("Enum " + (en1==en2));

    }
}
