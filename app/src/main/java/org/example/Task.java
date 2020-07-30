package org.example;

public enum Task {
    BEANA(BeanA.class),
    BEANB(BeanB.class);

    private Class clazz;

    public Class getClazz() {
        return clazz;
    }

    public static void printAny() {
        System.out.println("hey");
    }

    Task(Class clazz) {
        this.clazz = clazz;
    }
}
