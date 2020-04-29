package chuyenxe;

import java.util.Scanner;

public class chuyenxe {
    protected String masochuyen, hotentaixe, soxe;
    protected double doanhthu;
    
    Scanner sc = new Scanner(System.in);

    public chuyenxe(String masochuyen, String hotentaixe, String soxe, double doanhthu) {
        super();
        this.masochuyen = masochuyen;
        this.hotentaixe = hotentaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
    public chuyenxe() {
        super();
        this.masochuyen = "";
        this.hotentaixe = "";
        this.soxe = "";
        this.doanhthu = 0;
    }

    public String getMasochuyen() {
        return masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        this.masochuyen = masochuyen;
    }

    public String getHotentaixe() {
        return hotentaixe;
    }

    public void setHotentaixe(String hotentaixe) {
        this.hotentaixe = hotentaixe;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    public void nhapthongtinchuyenxe(){
        System.out.print("Nhap ma so chuyen");
        masochuyen =sc.nextLine();
        System.out.print("Nhap ho ten tai xe");
        hotentaixe =sc.nextLine();
        System.out.print("Nhap so xe");
        soxe =sc.nextLine();
        System.out.print("Nhap doanh thu");
        doanhthu =sc.nextDouble();
    }

    @Override
    public String toString() {
        return "masochuyen: " + this.masochuyen + ", hotentaixe: " + this.hotentaixe + ", soxe: " + this.soxe + ", doanhthu: " + this.doanhthu;
    }
    
}
