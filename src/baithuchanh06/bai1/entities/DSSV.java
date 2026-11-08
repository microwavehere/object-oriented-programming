package baithuchanh06.bai1.entities;

import java.util.ArrayList;

public class DSSV {
    private ArrayList<SV> ds;

    public DSSV() {
        ds = new ArrayList<>();
    }

    // Them mot sinh vien co kiem tra trung
    public void them(SV s){
        if (!ds.contains(s)) {
            ds.add(s);
            System.out.println("Đã thêm thành công sinh viên:" + s.layHoTen());
        } else {
            System.out.println("Sinh viên " + s.layHoTen() + " đã tồn tại trong danh sách");
        }
    }
    // Tim sinh vien trong ds theo ho ten
    public SV tim(String ht){
        for (int i = 0; i < ds.size(); i++){
            if (ds.get(i).layHoTen().equals(ht)) {
                return ds.get(i);
            }
        }
        return null;
    }

    // Xoa mot sinh vien theo ho ten
    public void xoa(String ht){
        boolean removed = false;
        for(int i = ds.size() - 1; i >= 0; i--){
            if (ds.get(i).layHoTen().equalsIgnoreCase(ht)){
                ds.remove(i);
                removed = true;
            }
        }
        if (removed) {
            System.out.println("Đã xóa thành công sinh viên:" + ht);
        } else {
            System.out.println("Không tìm thấy sinh viên tên: " + ht + " để xóa.");
        }
    }

    public void inDanhSach(){
        System.out.println("--- Danh sách toàn bộ sinh viên ---");
        for (int i = 0; i < ds.size(); i++){
            ds.get(i).hienThi();
        }
    }

    public void inDanhSachTheoLoai(String loai){
        System.out.println("--- Danh sách sinh viên theo loại:" + loai.toUpperCase() + "---");
        for (int i = 0; i < ds.size(); i++){
            if (ds.get(i).loaiSV().equalsIgnoreCase(loai)){
                ds.get(i).hienThi();
            }
        }
    }
} 
