package baithuchanh06.bai1.entities;

public class SVSP extends SV {
    protected String noiTT;
    protected double diemTT;

    public SVSP(String hoTen, int namSinh, double dtb, String noiTT, double diemTT) {
        super(hoTen, namSinh, dtb);
        this.noiTT = noiTT;
        this.diemTT = diemTT;
    }

    @Override
    public String loaiSV() {
        return "SP";
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" | [SP] Nơi TT: " + noiTT + " | Điểm TT: " + diemTT);
    }

    @Override
    public boolean equals(Object s) {
        if (s instanceof SVSP) {
            SVSP ss = (SVSP) s;
            return hoTen.equals(ss.hoTen) && namSinh == ss.namSinh && dtb == ss.dtb &&
                   noiTT.equals(ss.noiTT) && diemTT == ss.diemTT;
        }
        else return false;
    }
}
