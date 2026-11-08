package baithuchanh06.bai1.entities;

public class SVTH extends SV {
    protected String tenDT;
    protected double diemDT;

    public SVTH(String hoTen, int namSinh, double dtb, String tenDT, double diemDT){
        super(hoTen, namSinh, dtb);
        this.tenDT = tenDT;
        this.diemDT = diemDT;
    }

    @Override 
    public String loaiSV(){
        return "TH";
    }

    @Override 
    public void hienThi(){
        super.hienThi();
        System.out.println(" | [TH] Tên ĐT: " + tenDT + " | Điểm ĐT: " + diemDT);
    }

    @Override 
    public boolean equals(Object s) {
        if (s instanceof SVTH) {
            SVTH ss = (SVTH) s;
            return hoTen.equals(ss.hoTen) && namSinh == ss.namSinh && dtb == ss.dtb &&
                   tenDT.equals(ss.tenDT) && diemDT == ss.diemDT;
        }
        else return false;
    }
}
