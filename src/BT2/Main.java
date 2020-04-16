
package BT2;

public class Main 
{

    public static void main(String[] args) 
    {
       GioHang GH1 = new GioHang();
       GioHang GH2 = new GioHang();
       
       GH1.setHinhThucTT(new ThanhToanOnline());
       GH2.setHinhThucTT(new ThanhToanCOD());
       
       HangHoa HH1 = new HangHoa("Dầu ăn",50000,"Đây là dầu ăn");
       HangHoa HH2 = new HangHoa("Mì tôm",100000,"Đây là mì tôm");
       HangHoa HH3 = new HangHoa("Gạo",180000,"Đây là gạo");
       HangHoa HH4 = new HangHoa("Nếp",150000,"Đây là nếp");
       
       GH1.themHangHoa(HH1);
       GH1.themHangHoa(HH2);
       GH1.themHangHoa(HH3);
       GH1.themHangHoa(HH4);
       
       GH2.themHangHoa(HH1);
       GH2.themHangHoa(HH2);
       GH2.themHangHoa(HH3);
       GH2.themHangHoa(HH4);
       
       System.out.println("\nDanh sách hàng hóa của giỏ hàng 1(online)");
       GH1.hienthi();
       System.out.println("Giỏ hàng 1: tổng tiền hàng: " + GH1.tinhTienHang() + " Tiền khách trả: "+GH1.tinhTienKhachTra());

       System.out.println("\nDanh sách hàng hóa của giỏ hàng 2(COD)");
       GH2.hienthi();
       System.out.println("Giỏ hàng 2: tổng tiền hàng: " + GH2.tinhTienHang() + " Tiền khách trả: "+GH2.tinhTienKhachTra());
    }
    
}
