package fraction;

public class main {
    public static void main(String[] args) {
        PhanSo fa1 = new PhanSo(1,3);  
        PhanSo fa2 = new PhanSo(2,8); 
         
        fa1.add(fa2);
        fa1.subtract(fa2);
        fa1.multiply(fa2);
        fa1.divide(fa2);
    }
}
