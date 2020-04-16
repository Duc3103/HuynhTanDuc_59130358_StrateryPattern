
package BT3;

import java.util.ArrayList;


public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVienWrapper> dssv = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSV(SinhVienWrapper sv){
        dssv.add(sv);
    }
    
    private void swap(SinhVienWrapper sv1, SinhVienWrapper sv2) {
        SinhVien SV = sv1.sv;
        sv1.sv = sv2.sv;
        sv2.sv = SV;
    }
    
    public void sapXep(){
        for (int i=0; i<dssv.size()-1; i++){
            for (int j=i+1; j<dssv.size(); j++){
                if(soSanh.SoSanh(dssv.get(i).sv,dssv.get(j).sv)==1){
                   
                    swap(dssv.get(i),dssv.get(j));
                    
                }
                
            }
        }
    }

    public void inDS(){
        for (int i=0; i<dssv.size(); i++){
            System.out.println("Sinh viên thứ " + (i+1));
            dssv.get(i).sv.hienThi();
        }
    }

    void setSoSanh(SoSanhTheoDiem soSanhTheoDiem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
