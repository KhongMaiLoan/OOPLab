/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author ngao
 */
public class DiscJockey {
    PersonComponent personlist;
    public DiscJockey(PersonComponent newpersonlist)
    {
        personlist=newpersonlist;
                
    }
    
    public void getPersonList()
    {
        personlist.displayPersonInfo();
    }
}
