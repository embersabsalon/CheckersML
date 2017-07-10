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
public class Board {
    public LinkedList<Line> board;
    
    Board(){
        board = new LinkedList<Line>();
        Line l1 = new Line("p21");
        Line l2 = new Line("p22");
        Line l3 = new Line("p23");
        Line l4 = new Line("b1");
        Line l5 = new Line("b2");
        Line l6 = new Line("p11");
        Line l7 = new Line("p12");
        Line l8 = new Line("p13");
        board.add(l1);
        board.add(l2);
        board.add(l3);
        board.add(l4);
        board.add(l5);
        board.add(l6);
        board.add(l7);
        board.add(l8);    
    }
    
    public Line get(int x){
        return board.get(x);
    }
}
