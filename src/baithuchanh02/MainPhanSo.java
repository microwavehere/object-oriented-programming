package baithuchanh02;

public class MainPhanSo {
	public static void main(String[] args) {
        // 1. Tạo phân số p = 1/2, q = 5/7
        PS p = new PS(1, 2);
        PS q = new PS(5, 7);
        System.out.println("Phan so p = " + p);
        System.out.println("Phan so q = " + q);

        // 2. Thực hiện r = p + q; Hiển thị r
        PS r = p.cong(q);
        System.out.print("r = p + q = ");
        r.hienThi();

        // 3. Thực hiện t = 2*p - p/q; Hiển thị t
        // Phân tích biểu thức: (2 * p) - (p / q)
        PS haiP = p.nhan(2);       // 2*p
        PS pChiaQ = p.chia(q);     // p/q
        PS t = haiP.tru(pChiaQ);   // (2*p) - (p/q)
        System.out.print("t = 2*p - p/q = ");
        t.hienThi();

        // 4. So sánh 2 phân số p, q
        int kqSoSanh = p.soSanh(q);
        if (kqSoSanh > 0) {
            System.out.println("p lon hon q");
        } else if (kqSoSanh < 0) {
            System.out.println("p nho hon q");
        } else {
            System.out.println("p bang q");
        }

        // 5. Tạo mảng phân số chứa 5 phân số
        PS[] ds = new PS[] {
            new PS(1, 2),
            new PS(13, 2),
            new PS(5, 7),
            new PS(6, 9),   // Tự động rút gọn thành 2/3 khi khởi tạo
            new PS(30, 23)
        };

        System.out.print("\nMang ban dau: ");
        inMang(ds);

        // Sắp xếp mảng tăng dần (Exchange Sort)
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = i + 1; j < ds.length; j++) {
                if (ds[i].soSanh(ds[j]) > 0) { // Nếu ds[i] > ds[j]
                    PS temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }

        System.out.print("Mang sau khi sap xep tang dan: ");
        inMang(ds);
    }

    private static void inMang(PS[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
