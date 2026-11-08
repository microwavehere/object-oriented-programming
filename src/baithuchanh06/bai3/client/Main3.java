package baithuchanh06.bai3.client;

import baithuchanh06.bai3.entities.*;
public class Main3 {
    public static void main(String[] args){
        TD tuDien = new TD();

        tuDien.them("hello", new Nghia("xin chào", "Thán từ", "Hello, nice to meet you."));
        tuDien.them("computer", new Nghia("máy tính", "Danh từ", "I am studying Information Technology on my computer."));
        tuDien.them("run", new Nghia("chạy", "Động từ", "He runs very fast in the morning."));

        System.out.println("\n");
        tuDien.hienThi();

        System.out.println("\n[Tra cứu từ 'computer']:");
        Nghia kq1 = tuDien.tra("computer");
        if (kq1 != null) {
            System.out.println("Kết quả: " + kq1);
        } else {
            System.out.println("Không tìm thấy từ này trong từ điển.");
        }

        System.out.println("\n[Tra cứu từ 'banana']:");
        Nghia kq2 = tuDien.tra("banana");
        if (kq2 != null) {
            System.out.println("Kết quả: " + kq2);
        } else {
            System.out.println("Không tìm thấy từ này trong từ điển.");
        }
    }
}
