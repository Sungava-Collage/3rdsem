class Fruit {
    protected String name;
    protected String taste;
    protected String size;

     Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("This is a " + name + " this is a " + size);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        super.eat();
        System.out.println("Its taste is delicious and testy\n");
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        super.eat();
        System.out.println("Its taste is sweet\n");
    }
}

public class MultiHierarchicalExample {
    public static void main(String[] args) {
        Fruit apple = new Apple("Apple", "delicious", "small");
        Fruit orange = new Orange("Orange", "sweet", "big");
        apple.eat();
        orange.eat();
    }
}
