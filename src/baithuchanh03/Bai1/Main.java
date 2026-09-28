package baithuchanh03.bai01.Cilent;

import baithuchanh03.bai01.Entities.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng thuê bao di động (N):");
		int n = Integer.parseInt(sc.nextLine().trim());
		
		ThueBao[] dsThueBao = new ThueBao[n];
		
		for (int i = 0; i < n; i++) {
            System.out.println("\n==========================================");
            System.out.println("   NHẬP THÔNG TIN THUÊ BAO THỨ " + (i + 1));
            System.out.println("==========================================");
            
            System.out.print("Họ tên chủ thuê bao: ");
            String hoTen = sc.nextLine();
            
            System.out.print("Số điện thoại thuê bao: ");
            String sdt = sc.nextLine();

            System.out.println("\n--- Cuộc gọi 1 ---");
            System.out.print(" + SĐT nhận: ");
            String sdtNhan1 = sc.nextLine();
            System.out.print(" + Thời lượng (phút): ");
            int thoiLuong1 = Integer.parseInt(sc.nextLine());
            System.out.print(" + Loại cuộc gọi (Nội mạng / Ngoại mạng): ");
            String loai1 = sc.nextLine();
            CuocGoi cg1 = new CuocGoi(sdtNhan1, thoiLuong1, loai1);

            System.out.println("\n--- Cuộc gọi 2 ---");
            System.out.print(" + SĐT nhận: ");
            String sdtNhan2 = sc.nextLine();
            System.out.print(" + Thời lượng (phút): ");
            int thoiLuong2 = Integer.parseInt(sc.nextLine());
            System.out.print(" + Loại cuộc gọi (Nội mạng / Ngoại mạng): ");
            String loai2 = sc.nextLine();
            CuocGoi cg2 = new CuocGoi(sdtNhan2, thoiLuong2, loai2);

            dsThueBao[i] = new ThueBao(hoTen, sdt, cg1, cg2);
        }
		
		System.out.println("\n==================================================");
        System.out.println("      DANH SÁCH THÔNG TIN THUÊ BAO DI ĐỘNG        ");
        System.out.println("==================================================");
        for (ThueBao tb : dsThueBao) {
            tb.hienThiThongTin();
        }
        
        System.out.println("\n==================================================");
        System.out.println("   DANH SÁCH THUÊ BAO ĐẠT VOUCHER KHUYẾN MÃI 10%   ");
        System.out.println("==================================================");
        boolean coVoucher = false;
        for (ThueBao tb : dsThueBao) {
            if (tb.isDuDieuKienVoucher()) {
                System.out.printf("- Chủ thuê bao: %-20s | SĐT: %-10s | Tổng cước: %,.0f VNĐ\n",
                        tb.getHoTen(), tb.getSoDienThoai(), tb.tinhTongCuoc());
                coVoucher = true;
            }
        }

        if (!coVoucher) {
            System.out.println("Không có thuê bao nào đạt điều kiện nhận voucher (> 50.000 VNĐ).");
        }

        sc.close();
	    
		
	}

}
