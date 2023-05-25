public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBden;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBden) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBden = soBden;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBden() {
        return soBden;
    }

    public void setSoBden(int soBden) {
        this.soBden = soBden;
    }
    
}
