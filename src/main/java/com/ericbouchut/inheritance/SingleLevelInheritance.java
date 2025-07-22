package com.ericbouchut.inheritance;

public class SingleLevelInheritance {

    public static void main(String[] args) {
        Son son = new Son();

        son.grandFather();
        son.father();
        son.son();
    }
}

class GrandFather {
    void grandFather() {
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather {
    void father() {
        System.out.println("Father");
    }
}

class Son extends Father {
    void son() {
        System.out.println("Son");
    }
}
