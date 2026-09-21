//package baithuchanh02;

import java.util.Date;

public class NhanVien {
    private String hoTen;
    private Date ngaySinh;
    private String chucVu;
    private double heSoLuong;
    private double luongCoBan;

    public NhanVien(String hoTen, Date ngaySinh, String chucVu, double heSoLuong, double luongCoBan){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoPhuCap(){
        if (chucVu.equalsIgnoreCase("GD") || chucVu.equalsIgnoreCase("Giam doc")) {
            return 1.0;
        } else if (chucVu.equalsIgnoreCase("PGD") || chucVu.equalsIgnoreCase("Pho GiamDoc")){
            return 0.8;
        } else if (chucVu.equalsIgnoreCase("TP") || chucVu.equalsIgnoreCase("Truong Phong")){
            return 0.5;
        } else if(chucVu.equalsIgnoreCase("PP") || chucVu.equalsIgnoreCase("Pho Phong")){
            return 0.4;
        }
        return 0.0;
    }


    public double tinhLuong(){
        return (heSoLuong + getHeSoPhuCap()) * luongCoBan;
    }

    public double tinhBHXH(){
        return tinhLuong() * 0.06;
    }

    public double tinhBHTN(){
        return tinhLuong() * 0.01;
    }

    public double tinhSoTienConNhan(){
        return tinhLuong() - tinhBHXH() - tinhBHTN();
    }

    public String getHoTen(){
        return hoTen;
    }

    public Date getNgaySinh(){
        return ngaySinh;
    }

    public void hienThiThongTin(){
        System.out.printf("%-18s | Lương: %10.1f | BHXH: %8.1f | BHTN: %7.1f | Thực lĩnh: %10.1f\n",
                hoTen, tinhLuong(), tinhBHXH(), tinhBHTN(), tinhSoTienConNhan());
    }




    @Deprecated 
    public static void main(String[] agrs){
        NhanVien[] ds = new NhanVien[]{
            new NhanVien("Nguyen Van A", new Date("05/15/1980"), "GD", 4.5, 5000),
            new NhanVien("Tran Thi B", new Date("08/20/1985"), "PGD", 4.0, 5000),
            new NhanVien("Le Van C", new Date("01/10/1975"), "TP", 3.5, 5000),
            new NhanVien("Pham Thi D", new Date("12/05/1992"), "PP", 3.0, 5000),
            new NhanVien("Hoang Van E", new Date("03/30/1998"), "NV", 2.0, 5000)
        };

        System.out.println("================ DANH SACH NHAN VIEN ================");
        for (NhanVien nv : ds) {
            nv.hienThiThongTin();
        }

        double tongLuong = 0;
        for (NhanVien nv : ds){
            tongLuong += nv.tinhLuong();
        }
        double luongTrungBinh = tongLuong / ds.length;

        System.out.println("-----------------------------------------------------");
        System.out.printf("=> TONG LUONG CA CONG TY: %.1f\n", tongLuong);
        System.out.printf("=> LUONG TRUNG BINH:       %.1f\n", luongTrungBinh);

        NhanVien nvTuoiCaoNhat = ds[0];
        for (int i = 1;i < ds.length;i++){
            if(ds[i].getNgaySinh().before(nvTuoiCaoNhat.getNgaySinh())){
                nvTuoiCaoNhat = ds[i];
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("=> NHAN VIEN CO TUOI CAO NHAT: " + nvTuoiCaoNhat.getHoTen());
    }
}
