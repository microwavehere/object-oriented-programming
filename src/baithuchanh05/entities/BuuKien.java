package baithuchanh05.entities;

public class BuuKien extends BuuPham {
    public BuuKien(String maBP, String nguoiNhan, String diaChi){
        super(maBP, nguoiNhan, diaChi);
    }

    @Override 
    public double tinhTien(){
        return 5000.0;
    }

    @Override 
    public String getLoai(){
        return "BuuKien";
    }
}
