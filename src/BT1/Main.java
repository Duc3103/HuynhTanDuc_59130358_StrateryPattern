package BT1;

public class Main 
{

    public static void main(String[] args) 
    {
        context ct1 = new context();
        
        ct1.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct1.Tinh(75, 12));
        
        ct1.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ct1.Tinh(54, 78));
        
    }
    
}
