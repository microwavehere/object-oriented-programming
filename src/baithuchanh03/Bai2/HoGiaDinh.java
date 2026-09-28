package baithuchanh03.bai02.Entities;

public class HoGiaDinh {
	private String maHo;
	private String hoTenChuHo;
	private String loaiHo;
	private ChiSoCongTo congTo;
	
	public HoGiaDinh() {
		super();
	}
	
	public HoGiaDinh(String maHo, String hoTenChuHo, String loaiHo, ChiSoCongTo congTo) {
		super();
		this.maHo = maHo;
		this.hoTenChuHo = hoTenChuHo;
		this.loaiHo = loaiHo;
		this.congTo = congTo;
	}
	
	public String getMaHo() {
		return maHo;
	}
	
	public void setMaHo(String maHo) {
		this.maHo = maHo;
	}
	
	public String getHoTenChuHo() {
		return hoTenChuHo;
	}
	
	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}
	
	public String getLoaiHo() {
		return loaiHo;
	}
	
	public void setLoaiHo(String loaiHo) {
		this.loaiHo = loaiHo;
	}
	
	public ChiSoCongTo getCongTo() {
		return congTo;
	}
	
	public void setCongTo(ChiSoCongTo congTo) {
		this.congTo = congTo;
	}
	
	public double tinhTienDienChuaThue() {
		double dienTieuThu = congTo.tinhLuongDienTieuThu();
		if(loaiHo.equalsIgnoreCase("Kinh doanh") || loaiHo.equalsIgnoreCase("Kinh doanh ")) {
			return dienTieuThu * 3200.0;
		} else {
			return dienTieuThu * 2500.0;
		}
	}
	
	public double tinhThueVAT() {
		return tinhTienDienChuaThue() * 0.8;
	}
	
	public double tinhTongTienDien() {
		return tinhTienDienChuaThue() + tinhThueVAT();
	}
	
	public void hienThiThongTin() {
	    System.out.printf("| %-8s | %-20s | %-12s | %10.1f | %,15.0f | %,12.0f | %,15.0f |\n",
	            maHo, hoTenChuHo, loaiHo, congTo.tinhLuongDienTieuThu(),
	            tinhTienDienChuaThue(), tinhThueVAT(), tinhTongTienDien());
	}

}
