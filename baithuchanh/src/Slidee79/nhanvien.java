package Slidee790;
import java.util.Scanner;

import javax.xml.crypto.NoSuchMechanismException;

public class nhanvien {
    String HoTen;  
    String GioiTinh;
    String QueQuan;
    String PhongBan;
    String DiaChi;
    int manv;
    int NamSinh;
    int Tuoi;
    
    public void nhapThongTinNv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap Ho va Ten nhan vien : ");
        HoTen = sc.nextLine();
        System.out.print("nhap gioi tinh :");
        GioiTinh = sc.nextLine();
        System.out.print("nhap que quan nhan vien : ");
        QueQuan = sc.nextLine();
        System.out.print("Phong ban hien tai : ");
        PhongBan = sc.nextLine();
        System.out.print("Nhap dia chi thuong tru :");
        DiaChi = sc.nextLine();
        System.out.print("nhap ma nhan vien : ");
        manv = sc.nextInt();
        System.out.print("nhap nam sinh : ");
        NamSinh = sc.nextInt();
    }
    public int TinhTuoi(){
        Tuoi = 2024 - NamSinh;
        return Tuoi;
    }
    public void inThongTinNv()
    {
        System.out.println("Thong tin nhan vien :");
        System.out.println("Ten: "+HoTen);
        System.out.println("GioiTinh :" +GioiTinh);
        System.out.println("Ma so nhan vien: "+manv);
        System.out.println("Tuoi: "+Tuoi);
        System.out.println("Que quan: "+QueQuan);
        System.out.println("Phong ban :" +PhongBan);
        System.out.println("Dia Chi:" +DiaChi);
    }
    public static void main(String[] args) {
        nhanvien nv = new nhanvien/();
        nv.nhapThongTinNv();
        nv.TinhTuoi();
        nv.inThongTinNv();
    }
}

