public class PhThiNghiem extends PhongHoc{
    private String chuyenNganh;
    private int sucChua;
    private boolean bonRua;
    
    public PhThiNghiem(String maPhong, String dayNha, double dienTich, int soBden) {
        super(maPhong, dayNha, dienTich, soBden);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }
     
    
}
