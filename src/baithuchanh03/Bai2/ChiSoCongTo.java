package baithuchanh03.bai02.Entities;

public class ChiSoCongTo {
	private double chiSoCu;
	private double chiSoMoi;
	
	public ChiSoCongTo() {
		super();
	}
	
	public ChiSoCongTo(double chiSoCu, double chiSoMoi) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	
	public double getChiSoCu() {
		return chiSoCu;
	}
	
	public void setChiSoCu(double chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	
	public double getChiSoMoi() {
		return chiSoMoi;
	}
	
    public void setChiSoMoi(double chiSoMoi) {
    	this.chiSoMoi = chiSoMoi;
    }
    
    public double tinhLuongDienTieuThu() {
    	return chiSoMoi - chiSoCu;
    }
}
