package fraction;
public class PhanSo {
    private int numerator, denominator;
 
    public PhanSo(int numerator, int denominator) {
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }
     
     public int getnumerator() {
        return numerator;
    }
 
    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }
 
    public int getdenominator() {
        return denominator;
    }
 
    public void setdenominator(int denominator) {
        this.denominator = denominator;
    }
 
    public int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void reduce() {
        int i = USCLN(this.getnumerator(), this.getdenominator());
        this.setnumerator(this.getnumerator() / i);
        this.setdenominator(this.getdenominator() / i);
    }
     
    public void add(PhanSo ps) {
        int ts = this.getnumerator() * ps.getdenominator() + ps.getnumerator() * this.getdenominator();
        int ms = this.getdenominator() * ps.getdenominator();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.reduce();
        System.out.println("Tổng hai phân số = " + phanSoTong.numerator + "/" + phanSoTong.denominator);
    }
      
    public void subtract(PhanSo ps) {
        int ts = this.getnumerator() * ps.getdenominator() - ps.getnumerator() * this.getdenominator();
        int ms = this.getdenominator() * ps.getdenominator();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.reduce();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.numerator + "/" + phanSoHieu.denominator);
    }
     
    public void multiply(PhanSo ps) {
        int ts = this.getnumerator() * ps.getnumerator();
        int ms = this.getdenominator() * ps.getdenominator();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.reduce();
        System.out.println("Tích hai phân số = " + phanSoTich.numerator + "/" + phanSoTich.denominator);
    }
     
    public void divide(PhanSo ps) {
        int ts = this.getnumerator() * ps.getdenominator();
        int ms = this.getdenominator() * ps.getnumerator();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.reduce();
        System.out.println("Thương hai phân số = " + phanSoThuong.numerator + "/" + phanSoThuong.denominator);
    }
}
