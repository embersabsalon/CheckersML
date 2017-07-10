/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkersml;

/**
 *
 * @author Admin
 */
public class Spot {
    public int x;
    public int y;
    public String owner;
    
    Spot(){
        x = 0;
        y = 0;
        owner = "none";
    }
    
    Spot(int a,int b,String c){
        x = a;
        y = b;
        owner = c;
    }
    
}
