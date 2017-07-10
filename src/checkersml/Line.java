/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkersml;

import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Line {
    public LinkedList<Spot> line;
    
    Line(){
        LinkedList<Spot> line = new LinkedList<Spot>();
    }
    
    Line(String a){
        line = new LinkedList<Spot>();
        if(a == "p11"){
            for (int i = 0; i < 8; i++) {
                if(i%2 == 0){
                    Spot aa = new Spot(5,i,"p1");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(5,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "p12"){
            for (int i = 0; i < 8; i++) {
                if(i%2 != 0){
                    Spot aa = new Spot(6,i,"p1");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(6,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "p13"){
            for (int i = 0; i < 8; i++) {
                if(i%2 == 0){
                    Spot aa = new Spot(7,i,"p1");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(7,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "p21"){
            for (int i = 0; i < 8; i++) {
                if(i%2 == 0){
                    Spot aa = new Spot(0,i,"p2");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(0,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "p22"){
            for (int i = 0; i < 8; i++) {
                if(i%2 != 0){
                    Spot aa = new Spot(1,i,"p2");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(1,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "p23"){
            for (int i = 0; i < 8; i++) {
                if(i%2 == 0){
                    Spot aa = new Spot(2,i,"p2");
                    line.add(aa);
                }
                else{
                    Spot aa = new Spot(2,i,"none");
                    line.add(aa);
                }
            }
        }
        else if(a == "b1"){
            for (int i = 0; i < 8; i++) {
                    Spot aa = new Spot(3,i,"none");
                    line.add(aa);
            }
        }
        else if(a == "b2"){
            for (int i = 0; i < 8; i++) {
                    Spot aa = new Spot(4,i,"none");
                    line.add(aa);
            }
        }
    }
    
    public Spot get(int x){
        return line.get(x);
    }
    
    public void remove(int x, int y){
        Spot neww = new Spot(x,y,"none");
        line.remove(y);
        line.add(y, neww);
    }
    
    public void add(int x, int y, String player){
        Spot neww = new Spot(x,y,player);
        line.remove(y);
        line.add(y, neww);
    }
    
}
