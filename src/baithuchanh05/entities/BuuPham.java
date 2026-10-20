package baithuchanh05.entities;

public abstract class BuuPham {
    protected String maBP;
    protected String nguoiNhan;
    protected String diaChi;

    public BuuPham(String maBP, String nguoiNhan, String diaChi){
        this.maBP = maBP;
        this.nguoiNhan = nguoiNhan;
        this.diaChi = diaChi;
    }

    public abstract double tinhTien();
    public abstract String getLoai();

    public void hienThi(){
        System.out.println("Mã: " + maBP + " | Người nhận: " + nguoiNhan + " | Địa chỉ: " + diaChi + " | Cước phí: " + tinhTien() + "đ");
    }

    public boolean isThuBaoDam() {
    return false; 
    }
}
