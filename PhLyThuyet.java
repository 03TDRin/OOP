package lab_th_5_bai1;

/**
 *
 * @author HP
 */
public class PhLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhLyThuyet(String maPhong, String dayNha, double dienTich, int soBden) {
        super(maPhong, dayNha, dienTich, soBden);
        this.coMayChieu = coMayChieu;
    }
    
    
    
    public boolean coMayChieu(){
        return coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }
    
}
