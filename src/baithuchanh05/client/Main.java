package baithuchanh05.client;

import baithuchanh05.entities.*;

public class Main {
    public static void main(String[] args){
        //Tạo 1 thùng thư chứa 100 bp
        ThungThu thungThu = new ThungThu(100);
        
        //Bỏ vào thùng thư một số bưu phẩm
        thungThu.themBuuPham(new ThuThuong("TT01", "Nguyễn Văn An", "Hà Nội"));
        thungThu.themBuuPham(new ThuBaoDam("TBD01", "Trần Thị Bình", "Đà Nẵng"));
        thungThu.themBuuPham(new BuuKien("BK01", "Lê Hoàng Nam", "TP. Hồ Chí Minh"));
        thungThu.themBuuPham(new ThuThuong("TT02", "Phạm Văn Cường", "Hải Phòng"));
        thungThu.themBuuPham(new ThuBaoDam("TBD02", "Hoàng Thuỳ Linh", "Cần Thơ"));

        System.out.println("\n");

        thungThu.lietKeToanBo();
        System.out.println("\n");

        thungThu.lietKeThuBaoDam();
        System.out.println("\n");

        System.out.println("Tổng số tiền của toàn bộ thùng thư: " + thungThu.tinhTongTien() + "đ");

        System.out.println("Tổng tiền Thư thường: " + thungThu.tinhTongTienTheoLoai("ThuThuong") + "đ");   
        System.out.println("Tổng tiền Thư bảo đảm: " + thungThu.tinhTongTienTheoLoai("ThuBaoDam") + "đ");
        System.out.println("Tổng tiền Bưu kiện" + thungThu.tinhTongTienTheoLoai("BuuKien") + "đ");
    }
}
