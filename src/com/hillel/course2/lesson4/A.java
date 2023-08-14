package com.hillel.course2.lesson4;

import java.util.Objects;

public class A {
    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return a == a1.a && b == a1.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
