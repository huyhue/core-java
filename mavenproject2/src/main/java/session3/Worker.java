package session3;
public class Worker extends Person{
    private int hrs;
    private final double RATE = 7.5;
    
    public Worker(){
        super();
        hrs = 1;
    }

    public Worker(String name,int hrs) {
        super(name);
        this.hrs = hrs;
    }
    public double getSalary(){
        return hrs * RATE;
    }
    public void print(){
        super.print();
        System.out.println("Working saying...");
    }
    
}
