package com.ericbouchut.inheritance;

public class MultipleLevelInheritance {
    public static void main(String[] args) {
        FormField formField = new FormField();

        formField.store("ABC");
        formField.display();
    }
}

interface Displayable {
    void display();
}

interface Storable {
    void store(String value);
}

class FormField implements Displayable, Storable {
    private String value;

    public void display() {
        System.out.println("FormField value is " + getValue());
    }

    public void store(String value) {
        this.value = value;

        System.out.println("Storing value \"" + value + "\" in the FormField...");
    }

    public String getValue() {
        return value;
    }
}

