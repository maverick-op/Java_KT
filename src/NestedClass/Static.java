package NestedClass;

public class Static {
    static int x = 10;

    static class Inner{
        void Display(){
            System.out.println(x);
        }
    }

    public static void main(String[] args){

        Static.Inner inner = new Static.Inner(); //Here, Inner is static.So you don't need an Outer object:

        inner.Display();
    }
}
