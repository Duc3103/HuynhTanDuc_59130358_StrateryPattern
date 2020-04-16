
package BT1;

public class context {
    ITinh tinhToan;
    public void setTinhToan(ITinh tinhToan){
       this.tinhToan = tinhToan;
    }
    
    public float tinh(float a, float b){
        return this.tinhToan.tinh(a, b);
    }

    String Tinh(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

