public class Main {


}
interface Y {
    void a();
}
abstract class J implements Y {
    public void a() {
        System.out.print("J");
    }
}
class K extends J {
    public void a(int i) {
        System.out.print("K");
    }
}
class L extends K {
    public void a() {
        super.a();
        System.out.print("L");
    }
}
class A {
    static void s() {
        Y o1 = new L();
        L o2 = new L();
        K o3 = new K();
        J o4 = new K();
        J o5 = new L();
        o1.a();
        o2.a();
        ((J)o3).a();
        o4.a();
        ((L)o5).a();
    }
}
class B extends A {
    static void s() {
        Y o1 = new L();
        K o2 = new K();
        Y o3 = new K();
        J o4 = new K();
        L o5 = new L();
        o1.a();
        ((J)o2).a();
        o3.a();
        ((K)o4).a();
        o5.a();
    }
}
class M {
    public static void main(String[] args) {
        A o = new B();
        o.s();
    }
}
