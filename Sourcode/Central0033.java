/*Nama : Jamila Ulfiah*/
/*NIM  : 13020210033*/

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0033 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0033 obj = new Central0033();
        obj.aaa();
    }
}
