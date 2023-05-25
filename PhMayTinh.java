public class PhMayTinh extends PhongHoc{
    private int soMayTinh;
    
    public PhMayTinh(String maPhong, String dayNha,double dienTich ,int soBden) {
        super(maPhong, dayNha, dienTich, soBden);
        this.soMayTinh = soMayTinh;
    }
    
    public int getsoMayTinh(){
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }
    
    
}
