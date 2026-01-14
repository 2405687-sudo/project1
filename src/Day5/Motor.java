package Day5;

interface Motor1{
    int capacity = 29;
    void run();
    void consume();
}
class washingMachine implements Motor1{
    public void run(){
        System.out.println("Motor running");
    }
    public void consume(){
        System.out.println("Motor is consuming power");
    }
}
public class Motor {
    public static void main(String[] args){
        washingMachine a = new washingMachine();
        System.out.println("Capacity of the motor is-" + a.capacity);
    }
}
