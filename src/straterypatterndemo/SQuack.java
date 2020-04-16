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
public class SQuack implements IQuackBehavior
{
    
    @Override
    public String quack()
    {
        return "Hello you! Quack...Quack quack qua...ck";
    }
}
