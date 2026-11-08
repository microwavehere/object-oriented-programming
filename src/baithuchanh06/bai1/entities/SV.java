package baithuchanh06.bai1.entities;

public class SV {
    protected String hoTen;
    protected int namSinh;
    protected double dtb;

    public SV(String hoTen, int namSinh, double dtb){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }

    public String layHoTen(){
        return hoTen;
    }
    
    public String loaiSV(){
        return " ";
    }
    
    public void hienThi(){
        System.out.print("Họ tên: " + hoTen + " | Năm sinh: " + namSinh + " | ĐTB:" + dtb);
    }

    @Override 
    public boolean equals(Object s){
        if (s instanceof SV) {
            SV ss = (SV) s;
            return hoTen.equals(ss.hoTen) && namSinh == ss.namSinh && dtb == ss.dtb;
        }
        else return false;
    }
}    
