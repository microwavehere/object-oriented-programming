package baithuchanh03.bai01.Entities;

public class ThueBao {
	private String hoTen;
	private String soDienThoai;
	private CuocGoi cg1;
	private CuocGoi cg2;
	
	public ThueBao() {
		super();
	}
	
	public ThueBao(String hoTen, String soDienThoai, CuocGoi cg1, CuocGoi cg2) {
		super();
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.cg1 = cg1;
		this.cg2 = cg2;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getSoDienThoai() {
		return soDienThoai;
	}
	
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	public CuocGoi getCg1() {
		return cg1;
	}
	
	public void setCg1(CuocGoi cg1) {
		this.cg1 = cg1;
	}
	
	public CuocGoi getCg2() {
		return cg2;
	}
	
	public void setCg2(CuocGoi cg2) {
		this.cg2 = cg2;
	}
	
	public double tinhTongCuoc() {
		return cg1.tinhTienCuoc() + cg2.tinhTienCuoc();
	}
	
	public boolean isDuDieuKienVoucher() {
		return tinhTongCuoc() > 50000;
	}
	
	public void hienThiThongTin() {
		System.out.println("Chủ thuê bao: " + hoTen + " | SĐT: " + soDienThoai);
		System.out.println("Chi tiết 2 cuộc gọi gần nhất:");
		cg1.hienThiCuocGoi();
		cg2.hienThiCuocGoi();
		System.out.printf("==> Tổng cước thanh toán: %,.0f VNĐ\n", tinhTongCuoc());
		if (isDuDieuKienVoucher()) {
            System.out.println("--> [THÔNG BÁO]: Đủ điều kiện nhận voucher khuyến mãi 10%");
        }
        System.out.println("--------------------------------------------------");
    }

}
