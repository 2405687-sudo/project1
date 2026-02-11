package Day6;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello! Welcome to Java Programming.");
    }
}

class GreetingDemo {
    public static void main(String[] args) {
        Greeting g = new GreetingImpl();
        g.sayHello();
    }
}