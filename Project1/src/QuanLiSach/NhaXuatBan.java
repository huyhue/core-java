package QuanLiSach;

import java.util.Scanner;

public class NhaXuatBan {
    String tenNxb, Ngaytl, tenNdd;
    int Ntl;

    public NhaXuatBan() {
    }

    public NhaXuatBan(String tenNxb, String Ngaytl, String tenNdd, int Ntl) {
        this.tenNxb = tenNxb;
        this.Ngaytl = Ngaytl;
        this.tenNdd = tenNdd;
        this.Ntl = Ntl;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    public String getNgaytl() {
        return Ngaytl;
    }

    public void setNgaytl(String Ngaytl) {
        this.Ngaytl = Ngaytl;
    }

    public String getTenNdd() {
        return tenNdd;
    }

    public void setTenNdd(String tenNdd) {
        this.tenNdd = tenNdd;
    }

    public int getNtl() {
        return Ntl;
    }

    public void setNtl(int Ntl) {
        this.Ntl = Ntl;
    }

    @Override
    public String toString() {
        return "NhaXuatBan{" + "tenNxb=" + tenNxb + ", Ngaytl=" + Ngaytl + ", tenNdd=" + tenNdd + ", Ntl=" + Ntl + '}';
    }
    
    public void inputNXB() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("tên nhà xuất bản: ");
        tenNxb = nhap.nextLine();
        System.out.print("ngày thành lập: ");
        Ngaytl = nhap.nextLine();
        System.out.print("tên người đại diện: ");
        tenNdd = nhap.nextLine();
        System.out.print("năm thành lập: ");
        Ntl = Integer.parseInt(nhap.nextLine());
    }
    
     public void outputNXB() {
        System.out.println(toString());
    }
     
     //code tham khao (khong su dung trong bai)
   /* public void input(ArrayList<NhaXuatBan>listNXB) {
		Scanner sc = new Scanner(System.in);
		input();
		System.out.println("Moi ban nhap ten nha xuat ban: ");
		while(true) {
			tenNXB = sc.nextLine();
			boolean isExist = false;
			for( int i = 0; i < listNXB.size(); i++) {
				if(listNXB.get(i).getTenNXB().equalsIgnoreCase(tenNXB)) {
					isExist = true;
					break;
				}
			}
			if( !isExist ) {
				break;
			}else {
				System.out.println("Moi ban nhap lai ten nha xuat ban: ");
			}
		}
		
	}*/


}
