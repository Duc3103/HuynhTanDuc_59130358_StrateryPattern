
package BT3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        
        qlsv.setSoSanh(new SoSanhTheoDiem());
        
        String sDate1="28/06/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        
        SinhVien sv1 = new SinhVien("Lê Thế Dũng",date1,(float) 8.9);
        SinhVien sv2 = new SinhVien("Lê Thế Duy",date1,(float) 6);
        SinhVien sv3 = new SinhVien("Lê Thế Thiên",date1,(float) 9.1);
        SinhVien sv4 = new SinhVien("Nguyễn Lê Như Quỳnh",date1,(float) 7);
        SinhVien sv5 = new SinhVien("Trương Hoài Sơn",date1,(float) 7.2);
        
        SinhVienWrapper sv_1 = new SinhVienWrapper(sv1);
        qlsv.themSV(sv_1);
        
        SinhVienWrapper sv_2 = new SinhVienWrapper(sv2);
        qlsv.themSV(sv_2);
        
        SinhVienWrapper sv_3 = new SinhVienWrapper(sv3);
        qlsv.themSV(sv_3);
        
        SinhVienWrapper sv_4 = new SinhVienWrapper(sv4);
        qlsv.themSV(sv_4);
        
        SinhVienWrapper sv_5 = new SinhVienWrapper(sv5);
        qlsv.themSV(sv_5);
        
        qlsv.sapXep();
        
        qlsv.inDS();
        
        
        
    }
    
}

