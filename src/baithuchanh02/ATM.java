package baithuchanh02;

public class ATM {
    private String soTK;
    private double soDu;

    
    public ATM(String stk, double sd) {
        this.soTK = stk;
        this.soDu = (sd >= 0) ? sd : 0;
    }

    
    public String laySTK() {
        return this.soTK;
    }

    public double laySoDu() {
        return this.soDu;
    }

    public void napTien(double st) {
        if (st > 0) this.soDu += st;
    }

    public boolean rutTien(double st) {
        if (st > 0 && this.soDu >= st) {
            this.soDu -= st;
            return true;
        }
        return false;
    }

    public boolean chuyenTien(ATM tk, double st) {
        if (tk != null && this.rutTien(st)) {
            tk.napTien(st);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "So TK: " + soTK + " | So du: " + soDu;
    }

    public static void main(String[] args) {
       
        ATM[] ds = new ATM[] {
            new ATM("1111111", 100.0),
            new ATM("2222222", 100.0),
            new ATM("3333333", 150.0),
            new ATM("4444444", 200.0),
            new ATM("5555555", 300.0)
        };

      
        ATM tk1 = timTK(ds, "1111111");
        ATM tk2 = timTK(ds, "2222222");

    
        if (tk1 != null) tk1.napTien(1000.0);
        if (tk1 != null && tk2 != null) tk1.chuyenTien(tk2, 500.0);
        if (tk2 != null) tk2.rutTien(200.0);

        
        System.out.println("=== SO DU CÁC TAI KHOAN SAU GIAO DICH ===");
        double tongTien = 0;
        for (ATM tk : ds) {
            System.out.println(tk);
            tongTien += tk.laySoDu();
        }
        System.out.println("-> TONG SO TIEN: " + tongTien);
    }

    private static ATM timTK(ATM[] ds, String stk) {
        for (ATM tk : ds) {
            if (tk.laySTK().equals(stk)) return tk;
        }
        return null;
    }
}