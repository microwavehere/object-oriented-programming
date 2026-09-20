package baithuchanh02;

public class PS {
	private int tu;
	private int mau;
	
	// CONSTRUCTORS
	public PS() {
		this.tu = 0;
		this.mau = 1;
	}
	
	public PS(int n) {
		this.tu = n;
		this.mau = 1;
	}
	
	public PS(int t, int m) {
		if (m == 0) {
			System.out.println("Mau so khong the bang 0 !");
			this.mau = 1;
		} else {
			this.mau = m;
		}
		this.tu = t;
		this.rutGon();
	}
	
	// copy constructors
	public PS(PS p) {
		this.tu = p.tu;
		this.mau = p.mau;
	}
	
	// getter & setter
	public void ganTu(int t) {
		this.tu = t;
		this.rutGon();
	}
	
	public int layTu() {
		return this.tu;
	}
	
	public void ganMau(int m) {
		if (m != 0) {
			this.mau = m;
			this.rutGon();
		} else {
			System.out.println("Mau so phai khac 0!");
		}
	}
	
	public int layMau() {
		return this.mau;
	}
	
	// PRIVATE
	private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
	
	private void rutGon() {
        if (tu == 0) {
            mau = 1;
            return;
        }
        int g = ucln(tu, mau);
        tu /= g;
        mau /= g;
        if (mau < 0) { 
            tu = -tu;
            mau = -mau;
        }
    }
	
	// hien thi & bien doi
	public void hienThi() {
		System.out.println(this.toString());
	}
	
	public void tang(int n) {
		this.tu = this.tu + n * this.mau;
		this.rutGon();
	}
	
	public void gap(int n) {
		this.tu = this.tu * n;
		this.rutGon();
	}
	
	// cac phep toan 
	public PS cong(PS p) {
		int t = this.tu * p.mau + p.tu * this.mau;
		int m = this.mau * p.mau;
		return new PS(t, m);
	}
	
	public PS cong(int n) {
		return this.cong(new PS(n));
	}
	
	public PS tru(PS p) {
		int t = this.tu * p.mau - p.tu * this.mau;
		int m = this.mau * p.mau;
		return new PS(t, m);
	}
	
	public PS tru(int n) {
		return this.tru(new PS(n));
	}
	
	public PS nhan(PS p) {
		int t = this.tu * p.tu;
		int m = this.mau * p.mau;
		return new PS(t, m);
	}
	
	public PS nhan(int n) {
		return this.nhan(new PS(n));
		
	}
	
	public PS chia(PS p) {
		if (p.tu == 0) {
			System.out.println("Loi: Khong the chia cho 0!");
			return new PS(0 , 1);
		}
		int t = this.tu * p.mau;
		int m = this.mau * p.tu;
		return new PS(t, m);
	}
	
	public PS chia(int n) {
		return this.chia(new PS(n));
	}
	
	@Override
	public String toString() {
		if (mau == 1) return String.valueOf(tu);
		return tu + "/" + mau;
	}
	
	public int soSanh(PS p) {
		int hieu = this.tu * p.mau - p.tu * this.mau;
		if (hieu > 0) return 1;
		if (hieu < 0) return -1;
		return 0;
	}
}

    class MainPhanSo {
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