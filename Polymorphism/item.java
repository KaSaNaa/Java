package Polymorphism;

class Item {
    public void show() {
        System.out.println("This is an item");
    }
}

class Computer extends Item {
    public void show() // method overrriding
    {
        System.out.println("This is a computer");
    }
}

class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.show();
    }
}