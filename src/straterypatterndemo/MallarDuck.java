/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypatterndemo;

/**
 *
 * @author Duc_PC
 */
public class MallarDuck extends Duck
{
    
    public MallarDuck()
    {
        
    }
    
    @Override
    public String Display()
    {
       return "Xin chào! Em là vịt cổ xanh" +"\n"+
               performQuack()+"\n"+
               performFly();
    }
}
