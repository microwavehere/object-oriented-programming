package baithuchanh04.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SinhVien{
    private String hoTen;
    private Date ngaySinh;
    private double diemTrungBinh;

    public SinhVien(){
        super();
    }

    public SinhVien(String hoTen, Date ngaySinh, double diemTrungBinh){
        super();
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoTen(){
        return hoTen;
    }
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public Date getNgaySinh(){
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh(){
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh){
        this.diemTrungBinh = diemTrungBinh;
    }

    public String layHo(){
        if(hoTen == null || hoTen.trim().isEmpty()) return " ";
        String[] parts = hoTen.trim().split("\\s+");
        return parts[0];
    }

    public String layTen(){
        if(hoTen == null || hoTen.trim().isEmpty()) return " ";
        String[] parts = hoTen.trim().split("\\s+");
        return parts[parts.length - 1];
    }

    public String layTenDem(){
        if (hoTen == null || hoTen.trim().isEmpty()) return "";
        String[] parts = hoTen.trim().split("\\s+");
        if (parts.length <= 2){
            return (parts.length == 2) ? parts[1] : "";
        }
        String tenDem = "";
        for (int i = 1; i < parts.length - 1; i++){
            tenDem += parts[i] + " ";
        }
        return tenDem.trim();
    }

    public int layTuoi(){
        if (ngaySinh == null) return 0;
        Calendar calBirth = Calendar.getInstance();
        calBirth.setTime(ngaySinh);
        int birthYear = calBirth.get(Calendar.YEAR);

        Calendar calCurrent = Calendar.getInstance();
        int currentYear = calCurrent.get(Calendar.YEAR);

        return currentYear - birthYear;
    }

    public String layXepLoai(){
        if (diemTrungBinh >= 8.0){
            return "Giỏi";
        } else if (diemTrungBinh >= 7.0){
            return "Khá";
        } else if (diemTrungBinh >= 5.0){
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void hienThiThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = (ngaySinh != null) ? sdf.format(ngaySinh) : "";
        System.out.println("----------------------------------------");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Họ: " + layHo() + " | Tên đệm: " + layTenDem() + " | Tên: " + layTen());
        System.out.println("Ngày sinh: " + strDate + " (Tuổi: " + layTuoi() + ")");
        System.out.println("Điểm TB: " + diemTrungBinh + " | Xếp loại: " + layXepLoai());
    }
}