package baithuchanh03.bai01.Entities;

public class CuocGoi {
	private String soDienThoaiNhan;
	private int thoiLuong;
	private String loaiCuocGoi;
	
	public CuocGoi() {
		super();
	}
	
	public CuocGoi(String soDienThoaiNhan, int thoiLuong, String loaiCuocGoi) {
		super();
		this.soDienThoaiNhan = soDienThoaiNhan;
		this.thoiLuong = thoiLuong;
		this.loaiCuocGoi = loaiCuocGoi;
	}
	
	public String getSoDienThoaiNhan() {
		return soDienThoaiNhan;
	}
	
	public void setSoDienThoaiNhan(String soDienThoaiNhan) {
		this.soDienThoaiNhan = soDienThoaiNhan;
	}
	
	public int getThoiLuong() {
		return thoiLuong;
	}
	
	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}
	
	public String getLoaiCuocGoi() {
		return loaiCuocGoi;
	}
	
	public void setLoaiCuocGoi(String loaiCuocGoi) {
		this.loaiCuocGoi = loaiCuocGoi;
	}
	
	public double tinhTienCuoc() {
		if(loaiCuocGoi.equalsIgnoreCase("Nội mang") || loaiCuocGoi.equalsIgnoreCase("Noi mang")) {
			return thoiLuong * 1000.0;
		} else {
			return thoiLuong * 2000.0;
		}
	}
	
	public void hienThiCuocGoi() {
		System.out.printf("   + SĐT nhận: %s | Loại: %s | Thời lượng: %d phút => Cước: %,.0f VNĐ\n",
                soDienThoaiNhan, loaiCuocGoi, thoiLuong, tinhTienCuoc());
	}

}
