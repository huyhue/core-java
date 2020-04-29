package chuyenxe;

import java.util.Scanner;

public class chuyenxenopthanh extends chuyenxe{
    private String sotuyen;
    private double sokmdiduoc;

    public chuyenxenopthanh() {
        super();
    }

    public chuyenxenopthanh(String sotuyen, double sokmdiduoc) {
        super();
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;
    }

    public String getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public double getSokmdiduoc() {
        return sokmdiduoc;
    }

    public void setSokmdiduoc(double sokmdiduoc) {
        this.sokmdiduoc = sokmdiduoc;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapthongtinchuyenxe(){
        super.nhapthongtinchuyenxe();
        System.out.print("Nhap so tuyen: ");
        sotuyen =sc.nextLine();
        System.out.print("Nhap so km di duoc: ");
        sokmdiduoc =sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "sotuyen: " + this.sotuyen + ", sokmdiduoc:" + this.sokmdiduoc ;
    }
    
    
    
    
}
