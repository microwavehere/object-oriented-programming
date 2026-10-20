package baithuchanh05.entities;

public class ThuBaoDam extends BuuPham {
    public ThuBaoDam(String maBP, String nguoiNhan, String diaChi){
        super(maBP, nguoiNhan, diaChi);
    }

    @Override 
    public double tinhTien(){
        return 2000.0;
    }

    @Override 
    public String getLoai(){
        return "ThuBaoDam";
    }

    @Override
    public boolean isThuBaoDam() {
    return true; 
    }
}
