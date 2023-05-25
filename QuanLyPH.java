import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HP
 */
public class QuanLyPH {
    private final List<PhongHoc> dsPhongHoc;
    
    public QuanLyPH(){
        dsPhongHoc = new ArrayList<>();
    }
    
    public boolean themPH(PhongHoc phonghoc){
        for(PhongHoc ph : dsPhongHoc){
            if(ph.getMaPhong().equals(phonghoc.getMaPhong())){
                return false;
            }
        }
        dsPhongHoc.add(phonghoc);
        return true;
    }
    
    public PhongHoc timPH(String maPhong){
        for(PhongHoc ph : dsPhongHoc){
            if(ph.getMaPhong().equals(maPhong)){
                return ph;
            }
        }
        return null;
    }
    
    public void inDSPhongHoc(){
        for(PhongHoc ph : dsPhongHoc){
            System.out.println("Ma phong : "+ph.getMaPhong());
            System.out.println("Day nha : "+ph.getDayNha());
            System.out.println("Dien tich : "+ph.getDienTich());
            System.out.println("So bong den : "+ph.getSoBden());
            System.out.println();
        }
    }
    public void inDSPHdatChuan(){
        for(PhongHoc ph : dsPhongHoc){
            boolean datChuan = true;
            if(ph instanceof PhLyThuyet lyThuyet){
                if(!lyThuyet.coMayChieu()){
                    datChuan = false;
                }
            }else if(ph instanceof PhMayTinh mayTinh){
                double tiLe = mayTinh.getsoMayTinh()/ph.getDienTich();
                if(tiLe < 1.5){
                    datChuan = false;
                }
            }else if(ph instanceof PhThiNghiem thiNghiem){
                if(!thiNghiem.isBonRua()){
                    datChuan = false;
                }
            }
            if(datChuan){
                System.out.println("Ma phong : "+ph.getMaPhong());
                System.out.println("Day nha : "+ph.getDayNha());
                System.out.println("Dien tich : "+ph.getDienTich());
                System.out.println("So bong den : "+ph.getSoBden());
                System.out.println();
            }
        }
    }
    public void sapxepDayNha(){
      Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc :: getDayNha));  
    }
    public void sapxepSoBden(){
        Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc :: getSoBden));
    }
    
    public void capnhatSoMT(String maPhong, int soMayTinh){
        PhongHoc phonghoc = timPH(maPhong);
        if(phonghoc instanceof PhMayTinh mayTinh){
            mayTinh.setSoMayTinh(soMayTinh);
        }
    }
    public boolean xoaPH(String maPhong){
        Iterator<PhongHoc> iterator = dsPhongHoc.iterator();
        while(iterator.hasNext()){
            PhongHoc ph = iterator.next();
            if(ph.getMaPhong().equals(maPhong)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public int demTongSoPh(){
        return dsPhongHoc.size();
    }
    
    public void inDSPhong60MT(){
        for(PhongHoc ph : dsPhongHoc){
        if(ph instanceof PhMayTinh mayTinh){
            if(mayTinh.getsoMayTinh() == 60){
                System.out.println("Ma phong : "+ph.getMaPhong());
                System.out.println("Day nha : "+ph.getDayNha());
                System.out.println("Dien tich : "+ph.getDienTich());
                System.out.println("So bong den : "+ph.getSoBden());
                System.out.println();
            }
        }
    }
  }
}
