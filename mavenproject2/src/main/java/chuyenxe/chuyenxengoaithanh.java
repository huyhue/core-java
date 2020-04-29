package chuyenxe;

import java.util.Scanner;

public class chuyenxengoaithanh extends chuyenxe{
    private String noiden;
    private int songaydiduoc;

    public chuyenxengoaithanh(String noiden, int songaydiduoc) {
        super();
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }
    public chuyenxengoaithanh() {
         super();
        this.noiden = "";
        this.songaydiduoc = 0;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongaydiduoc() {
        return songaydiduoc;
    }

    public void setSongaydiduoc(int songaydiduoc) {
        this.songaydiduoc = songaydiduoc;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapthongtinchuyenxe(){
        super.nhapthongtinchuyenxe();
        System.out.print("Nhap noi den: ");
        noiden =sc.nextLine();
        System.out.print("Nhap so ngay di duoc: ");
        songaydiduoc =sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "noiden:" + this.noiden + ", songaydiduoc:" + this.songaydiduoc;
    }
    
    
}
