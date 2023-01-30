public class Test {

    public static void main(String[] args) {
        C c = new C();


        B.run();
    }
}

class A {
     {
        System.out.println("A");
    }
}

class B extends A {

     public static void run(){
        System.out.println("run working");
    }


    static {
        System.out.println("B");
    }
}

class C extends B{


    public static void run(){
        System.out.println("C running");
    }

    static {
        System.out.println("C");
    }
}
