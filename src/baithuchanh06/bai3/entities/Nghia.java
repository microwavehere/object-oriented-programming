package baithuchanh06.bai3.entities;

public class Nghia {
    private String nghia;
    private String phanLoai;
    private String viDu;

    public Nghia(String nghia, String phanLoai, String viDu){
        this.nghia = nghia;
        this.phanLoai = phanLoai;
        this.viDu = viDu;
    }
        public String getNghia(){
            return nghia;
        }

        public void setNghia(String nghia) {
            this.nghia = nghia;
        }

        public String getPhanLoai(){
            return phanLoai;
        }
        
        public void setPhanLoai(String phanLoai) {
            this.phanLoai = phanLoai;
        }

        public String getViDu() {
            return viDu;
        }

        public void setViDu(String viDu) {
            this.viDu = viDu;
        }

        @Override 
        public String toString(){
            return "[" + phanLoai + "] Nghĩa: " + nghia + " | Ví dụ: \"" + viDu + "\"";
        }
}
