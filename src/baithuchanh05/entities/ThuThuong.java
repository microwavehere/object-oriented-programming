package baithuchanh05.entities;

public class ThuThuong extends BuuPham {
    public ThuThuong(String maBP, String nguoiNhan, String diaChi){
        super(maBP, nguoiNhan, diaChi);
    }

    @Override 
    public double tinhTien(){
        return 800.0;
    }

    @Override 
    public String getLoai(){
        return "ThuThuong";
    }
}
