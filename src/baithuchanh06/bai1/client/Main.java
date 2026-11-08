package baithuchanh06.bai1.client;

import baithuchanh06.bai1.entities.*;

public class Main {
    public static void main(String[] args) {
        DSSV danhSach = new DSSV();

        danhSach.them(new SVSP("Nguyen Van A", 2004, 8.0, "Truong THPT Phan Chu Trinh", 8.5));
        danhSach.them(new SVTH("Le Thi B", 2004, 7.5, "He thong quan ly thu vien", 9.0));
        danhSach.them(new SVSP("Tran Van C", 2003, 8.2, "Truong THPT Tran Cao Van", 7.5));

        //Kiem tra trung lap
        System.out.println("\nKiểm tra trùng lặp: ");
        danhSach.them(new SVSP("Nguyen Van A", 2004, 8.0, "Truong THPT Phan Chu Trinh", 8.5));

        System.out.println("\n");
        danhSach.inDanhSach();

        System.out.println("\n");
        danhSach.inDanhSachTheoLoai("SP");

        //Tim kiem sv theo ho ten
        System.out.println("\nThực hiện tìm kiếm:");
        SV svTimKiem = danhSach.tim("Le Thi B");
        if (svTimKiem != null) {
            System.out.println("Đã tìm thấy sinh viên:");
            svTimKiem.hienThi();
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }

        // Xoa Sinh vien
        System.out.println("\nThực hiện xóa sinh viên:");
        danhSach.xoa("Tran Van C");

        System.out.println("\n");
        danhSach.inDanhSach();
    }
}
