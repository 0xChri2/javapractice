class A {
    void f() {
        System.out.println("A.f()");
    }

    void f(int i) {
        System.out.println("A.f(int)");
    }

    void g() {
        System.out.println("A.g()");
    }

    static class B extends A {
    void f() {
        System.out.println("B.f()");
    }

    void g(int i) {
        System.out.println("B.g(int)");
    }

    void h() {
        System.out.println("B.h()");
        this.g();
    }
}

public class Main{

    public static void main(String[] args) {
        A a = new A();
        a.f();
        a.f(1);
        a.g();
        B b = new B();
        a.f();
        a.f(1);
        a.g();
        A o = new B();
        o.f();
    }


}