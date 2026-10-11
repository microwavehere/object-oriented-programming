package baithuchanh04.client;

import baithuchanh04.entities.SinhVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nhập số lượng sinh viên (N): ");
        int n = Integer.parseInt(sc.nextLine().trim());

        SinhVien[] dsSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n----------------------------------------");
            System.out.println("NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1));
            System.out.println("----------------------------------------");
            
            System.out.print("Họ và tên đầy đủ: ");
            String hoTen = sc.nextLine().trim();

            Date ngaySinh = null;
            while (true) {
                try {
                    System.out.print("Ngày sinh (dd/MM/yyyy): ");
                    String dateStr = sc.nextLine().trim();
                    ngaySinh = sdf.parse(dateStr);
                    break;
                } catch (ParseException e) {
                    System.out.println("Sai định dạng! Vui lòng nhập lại theo chuẩn dd/MM/yyyy.");
                }
            }

            System.out.print("Điểm trung bình tích lũy: ");
            double dtb = Double.parseDouble(sc.nextLine().trim());

            dsSinhVien[i] = new SinhVien(hoTen, ngaySinh, dtb);
        }

        System.out.println("\n========================================");
        System.out.println("       DANH SÁCH TOÀN BỘ SINH VIÊN      ");
        System.out.println("========================================");
        for (SinhVien sv : dsSinhVien) {
            sv.hienThiThongTin();
        }

        System.out.println("\n========================================");
        System.out.println("     DANH SÁCH SINH VIÊN ĐẠT LOẠI GIỎI    ");
        System.out.println("========================================");
        boolean coGioi = false;
        for (SinhVien sv : dsSinhVien) {
            if (sv.getDiemTrungBinh() >= 8.0) {
                sv.hienThiThongTin();
                coGioi = true;
            }
        }
        if (!coGioi) {
            System.out.println("Không có sinh viên nào đạt loại Giỏi.");
        }

        System.out.println("\n========================================");
        System.out.println("     TÌM KIẾM SINH VIÊN TÊN 'Nam'       ");
        System.out.println("========================================");
        boolean coNam = false;
        for (SinhVien sv : dsSinhVien) {
            if (sv.layTen().equalsIgnoreCase("Nam")) {
                sv.hienThiThongTin();
                coNam = true;
            }
        }
        if (!coNam) {
            System.out.println("Không tìm thấy sinh viên tên 'Nam'.");
        }

        if (n > 0) {
            int tongTuoi = 0;
            for (SinhVien sv : dsSinhVien) {
                tongTuoi += sv.layTuoi();
            }
            double tuoiTB = (double) tongTuoi / n;
            System.out.println("\n-> Tuổi trung bình của toàn bộ sinh viên: " + tuoiTB);
        }

        int viTriXoa = -1;
        for (int i = 0; i < n; i++) {
            if (dsSinhVien[i].layTen().equalsIgnoreCase("Hòa")) {
                viTriXoa = i;
                break; 
            }
        }

        if (viTriXoa != -1) {
            for (int i = viTriXoa; i < n - 1; i++) {
                dsSinhVien[i] = dsSinhVien[i + 1];
            }
            System.out.println("\n-> Đã xóa thành công sinh viên đầu tiên tên 'Hòa'!");
        } else {
            System.out.println("\n-> Không tìm thấy sinh viên tên 'Hòa' để xóa.");
        }

        System.out.println("\n========================================");
        System.out.println("   DANH SÁCH SAU KHI XÓA SINH VIÊN TÊN HÒA ");
        System.out.println("========================================");
        for (int i = 0; i < n; i++) {
            dsSinhVien[i].hienThiThongTin();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = dsSinhVien[i].layTen() + " " + dsSinhVien[i].layHo() + " " + dsSinhVien[i].layTenDem();
                String s2 = dsSinhVien[j].layTen() + " " + dsSinhVien[j].layHo() + " " + dsSinhVien[j].layTenDem();
                
                if (s1.compareToIgnoreCase(s2) > 0) {
                    SinhVien temp = dsSinhVien[i];
                    dsSinhVien[i] = dsSinhVien[j];
                    dsSinhVien[j] = temp;
                }
            }
        }

        System.out.println("\n========================================");
        System.out.println("   DANH SÁCH SAU KHI SẮP XẾP THEO TÊN A-Z ");
        System.out.println("========================================");
        for (int i = 0; i < n; i++) {
            dsSinhVien[i].hienThiThongTin();
        }

        sc.close();
    }
}