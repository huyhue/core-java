package session3;
public class main {
    public static void main(String[] args) {
        Worker w = new Worker("choi", 70);
        w.print();
        System.out.println("name= " +w.getName());
        System.out.println("salary= " +w.getSalary());

        Person p = new Person("Bat");
        p.print();
        
//        Person p = new Person();
//        p.print();
//        p= new Worker();
//        p.print();
        
        
    }
}
