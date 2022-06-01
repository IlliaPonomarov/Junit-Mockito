import org.w3c.dom.ls.LSOutput;

public class Main {



    public static void main(String[] args) {






    }

}
//class E extends Exception {}
//class M {
//    public void c(char c) throws E {
//        if (c == 'a')
//        System.out.print("A");
//else
//        throw new E();
//    }
//    public void m(char c) {
//        System.out.print("M");
//        try {
//            c(c);
//        } catch (E e) {
//            System.out.print("E");
//        } finally {
//            System.out.print("F");
//        }
//    }
//    public static void main(String[] args) {
//        new M().m('a');
//        new M().m('b');
//        new M().m('a');
//    }
//}


class E extends Exception {}
class M {
    public void m(char c) throws E {
        if (c == 'a')
        System.out.print("A");
else
        throw new E();
    }
    public void p(char c) throws E {
        System.out.print("F");
        try {
            m(c);
        } catch (E e) {
            System.out.print("T");
            throw e;
        } finally {
            System.out.print("E");
        }
    }
    public static void main(String[] args) throws E {
        new M().p('b');
        new M().p('a');
    }
}
//class A {
//    public void x() {
//        System.out.print("Ax");
//    }
//    public static void y() {
//        System.out.print("Ay");
//    }
//}
//class B extends A {
//    public void x() {
//        super.x();
//        System.out.print("Bx");
//    }
//    public static void y() {
//        A.y();
//        System.out.print("By");
//    }
//}
//class C extends B {
//    public void x() {
//        System.out.print("Cx");
//    }
//    public static void y() {
//        System.out.print("Cy");
//    }
//}
//class M {
//    public static void main(String[] args) {
//        A o1 = new B();
//        C o2 = new C();
//        A o3 = new A();
//        B o4 = new B();
//        B o5 = new C();
//        ((B) o1).x();
//        ((B) o1).y();
//        System.out.print(" ");
//        ((A) o2).x();
//        ((A) o2).y();
//
//        System.out.print(" ");
//        o3.x();
//        o3.y();
//        System.out.print(" ");
//        o4.x();
//        o4.y();
//        System.out.print(" ");
//        ((A) o5).x();
//        ((A) o5).y();
//    }
//}
