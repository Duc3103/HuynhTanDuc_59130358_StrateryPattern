
package BT3;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int SoSanh(SinhVien o1, SinhVien o2) {
        if (o1.getDiemTB() > o2.getDiemTB()) return 1;
        else if (o1.getDiemTB() < o2.getDiemTB()) return -1;
        else return 0;
    }   
}

