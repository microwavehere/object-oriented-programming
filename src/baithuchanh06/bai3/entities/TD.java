package baithuchanh06.bai3.entities;

import java.util.HashMap;
import java.util.Map;

public class TD {
    private HashMap<String, Nghia> td;

    public TD(){
        td = new HashMap<>();
    }

    //Them mot tu vao tu dien
    public void them(String tu, Nghia ng){
        td.put(tu, ng);
        System.out.println("Đã thêm từ thành công" + tu);
    }

    //Tra tu trong tu dien
    public Nghia tra(String tu){
        return td.get(tu);
    }

    //Liet ke toan bo cac tu cua tu dien
    public void hienThi(){
        System.out.println("--- DANH SÁCH TỪ ĐIỂN ANH - VIỆT ---");
        if (td.isEmpty()) {
            System.out.println("Từ điển hiện đang trống!");
            return;
        }
        for (Map.Entry<String, Nghia> entry : td.entrySet()) {
            String tu = entry.getKey();
            Nghia ng = entry.getValue();
            System.out.println("- " + tu + " : " + ng);
        }
    }
}
