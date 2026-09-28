package baithuchanh03.bai02.Cilent;

import baithuchanh03.bai02.Entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng hộ gia đình (N): ");
        int n = Integer.parseInt(sc.nextLine().trim());

        HoGiaDinh[] dsHoGiaDinh = new HoGiaDinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n==========================================");
            System.out.println("    NHẬP THÔNG TIN HỘ GIA ĐÌNH THỨ " + (i + 1));
            System.out.println("==========================================");

            System.out.print("Mã hộ: ");
            String maHo = sc.nextLine().trim();

            System.out.print("Họ tên chủ hộ: ");
            String hoTen = sc.nextLine().trim();

            System.out.print("Loại hộ (Sinh hoạt / Kinh doanh): ");
            String loaiHo = sc.nextLine().trim();

            System.out.print("Chỉ số điện cũ (đầu tháng): ");
            double chiSoCu = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Chỉ số điện mới (cuối tháng): ");
            double chiSoMoi = Double.parseDouble(sc.nextLine().trim());

            ChiSoCongTo congTo = new ChiSoCongTo(chiSoCu, chiSoMoi);
            dsHoGiaDinh[i] = new HoGiaDinh(maHo, hoTen, loaiHo, congTo);
        }

        System.out.println("\n=======================================================================================================================");
        System.out.println("                                       BẢNG KÊ TIÊU THỤ VÀ TIỀN ĐIỆN CHI TIẾT                                         ");
        System.out.println("=======================================================================================================================");
        System.out.printf("| %-8s | %-20s | %-12s | %10s | %15s | %12s | %15s |\n",
                "Mã Hộ", "Tên Chủ Hộ", "Loại Hộ", "Điện (kWh)", "Tiền Chưa Thuế", "Thuế VAT(8%)", "Tổng Tiền (VNĐ)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

        for (HoGiaDinh hgd : dsHoGiaDinh) {
            hgd.hienThiThongTin();
        }
        System.out.println("=======================================================================================================================");

        HoGiaDinh hoMaxDien = dsHoGiaDinh[0];
        for (int i = 1; i < dsHoGiaDinh.length; i++) {
            double dienHienTai = dsHoGiaDinh[i].getCongTo().tinhLuongDienTieuThu();
            double dienMax = hoMaxDien.getCongTo().tinhLuongDienTieuThu();

            if (dienHienTai > dienMax) {
                hoMaxDien = dsHoGiaDinh[i];
            }
        }

        System.out.println("\n==================================================");
        System.out.println("   HỘ GIA ĐÌNH TIÊU THỤ ĐIỆN NHIỀU NHẤT TRONG THÁNG ");
        System.out.println("==================================================");
        System.out.printf("- Mã hộ: %s\n", hoMaxDien.getMaHo());
        System.out.printf("- Chủ hộ: %s\n", hoMaxDien.getHoTenChuHo());
        System.out.printf("- Loại hộ: %s\n", hoMaxDien.getLoaiHo());
        System.out.printf("- Điện tiêu thụ: %.1f kWh\n", hoMaxDien.getCongTo().tinhLuongDienTieuThu());
        System.out.printf("- Tổng tiền phải trả (gồm VAT): %,.0f VNĐ\n", hoMaxDien.tinhTongTienDien());

        sc.close();
    }
}

   


