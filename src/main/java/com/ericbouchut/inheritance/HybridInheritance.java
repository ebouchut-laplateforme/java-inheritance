package com.ericbouchut.inheritance;

/*
 * What we call <b>hybrid inheritance</b> is a mix of class and interface(s) inheritance.
 * In this example the <code>MultiplyCalculator</code> class extends <code>Calculator</code> class
 * and implements one or more interfaces.
 */

interface Compute {
    double compute();
}

interface Initializable {
    void initialize(double value);
}

/**
 * <code>AbstractCalculator</code> is an <b>abstract</b> class, meaning it does not provide the implementation
 * for some methods, such as the <code>compute</code> method, but <b>requires</b> its subclasses to implement it.
 */
abstract class AbstractCalculator implements Compute, Initializable {
    private double value;

    @Override
    public void initialize(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    abstract public double compute();
}

class MultiplyCalculator extends AbstractCalculator {
    private double mutiplier;

    public MultiplyCalculator(int mutiplier) {
        this.mutiplier = mutiplier;
    }

    public double compute() {
        return mutiplier * getValue();
    }
}

public class HybridInheritance {

    public static void main(String[] args) {
        MultiplyCalculator calc = new MultiplyCalculator(2);
        calc.initialize(4);
        System.out.println(calc.compute());
    }
}
