public class Lab_TH_5_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyPH ql = new QuanLyPH();

        PhLyThuyet lyThuyet1 = new PhLyThuyet("LT1","A",100,10);
        PhMayTinh mayTinh1 = new PhMayTinh("MT1","B",80,8);
        PhThiNghiem thiNghiem1 = new PhThiNghiem("TN1","C",150,15);
        PhLyThuyet lyThuyet2 = new PhLyThuyet("LT2", "D",120,12);
        PhMayTinh mayTinh2 = new PhMayTinh("MT2","E",90,9);
        PhThiNghiem thiNghiem2 = new PhThiNghiem("TN2","F",200,20);
        
        ql.themPH(lyThuyet1);
        ql.themPH(lyThuyet2);
        ql.themPH(mayTinh1);
        ql.themPH(mayTinh2);
        ql.themPH(thiNghiem1);
        ql.themPH(thiNghiem2);
        
        System.out.println("Danh sach phong hoc: ");
        ql.inDSPhongHoc();
        
        System.out.println("Danh sach phong hhoc dat chuan : ");
        ql.inDSPHdatChuan();
        
        ql.sapxepSoBden();
        System.out.println("Danh sach phong hoc sau khi sap xep so bong den : ");
        ql.inDSPhongHoc();
        
        ql.sapxepDayNha();
        System.out.println("Danh sach phong hoc sau khi sap xep theo day nha : ");
        ql.inDSPhongHoc();
        
        ql.capnhatSoMT("MT1",30);
        
        boolean xoaThanhCong = ql.xoaPH("TN2");
        if(xoaThanhCong){
            System.out.println("Xoa phong hoc thanh cong");
  
        }else{
            System.out.println("Khong tim thay phong de xoa");
                }
        
        System.out.println("Danh sach phong hoc 60 may tinh : ");
        ql.inDSPhong60MT();
    }
    
}
