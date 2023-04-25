package main.java.ru.asteises.patterns.delegationPattern;

public class DelegartionPattern {

    public static void main(String[] args) {
        DelegartionPattern dp = new DelegartionPattern();
        DelegartionPattern.A a = dp.new A();
        a.f();
        DelegartionPattern.B b = dp.new B();
        b.f();
    }

    class A {
        void f() {
            System.out.println("f");
        }
    }

    class B {
        A a = new A();
        void f() {
            a.f();
        }
    }
}
