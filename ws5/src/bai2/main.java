package bai2;

public class main {
    public static void main(String[] args) {
        Technician te = new Technician("IT","001","Huy",0.56,2016,true);
        te.salary();
        te.reward();
        System.out.println(te);
        
        Manager ma = new Manager("manager",13000,"002","tong",1.5,2014,false);
        ma.salary();
        ma.reward();
        System.out.println(ma);
        
        
        
    }
}
