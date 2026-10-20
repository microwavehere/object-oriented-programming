package baithuchanh05.entities;

public class ThungThu {
    private BuuPham[] ds;
    private int soLuong;

    public ThungThu(int sucChua){
        ds = new BuuPham[sucChua];
        soLuong = 0;
    }

    public void themBuuPham(BuuPham bp){
        if (soLuong < ds.length) {
            ds[soLuong++] = bp;
            System.out.println("Đã thêm bưu phẩm thành công");
        } else {
            System.out.println("Thùng thư đã đầy, không thể thêm");
        }
    }

    public void lietKeToanBo(){
        System.out.println(" DANH SÁCH TOÀN BỘ BƯU PHẨM TRONG THÙNG");
        for(int i = 0; i < soLuong; i++){
            ds[i].hienThi();
        }
    }

    public void lietKeThuBaoDam(){
        System.out.println(" DANH SÁCH THƯ ĐẢM BẢO");
        boolean found = false;
        for (int i = 0; i < soLuong; i++){
            if (ds[i].isThuBaoDam()){
                ds[i].hienThi(); 
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có thư bảo đảm trong thùng");
        }
    }

    public double tinhTongTien(){
        double tong = 0;
        for (int i = 0; i < soLuong; i++){
            tong = tong + ds[i].tinhTien();
        }
        return tong;
    }

    public double tinhTongTienTheoLoai(String loai){
        double tong = 0;
        for (int i = 0; i < soLuong; i++){
            if(ds[i].getLoai().equalsIgnoreCase(loai)){
                tong = tong + ds[i].tinhTien();
            }
        }
        return tong;
    }
}
