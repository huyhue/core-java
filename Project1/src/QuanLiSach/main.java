/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiSach;
public class main {
    public static void main(String[] args) {
        NhaXuatBan nxb = new NhaXuatBan();
        Sach sach = new Sach();
        TacGia tacgia = new TacGia();
        nxb.inputNXB();
        sach.inputS();
        tacgia.inputTG();
        System.out.println("Hien thi thong tin vua nhap");
        nxb.outputNXB();
        sach.outputS();
        tacgia.outputTG();
    }
}
