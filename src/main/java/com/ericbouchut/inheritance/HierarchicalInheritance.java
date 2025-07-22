package com.ericbouchut.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.child1();
        child1.parent();

        System.out.println();

        Child2 child2 = new Child2();
        child2.child2();
        child2.parent();
    }
}

class Parent {
  void parent() {
      System.out.println("Parent");
  }
}

class Child1 extends Parent {
    void child1() {
        System.out.println("Child1");
    }
}

class Child2 extends Parent {
    void child2() {
        System.out.println("Child2");
    }
}