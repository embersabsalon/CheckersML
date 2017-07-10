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
public class Checkersgame {
    
    public int[][] board = new int[7][7];
    public int player1;
    public int player2;
    public LinkedList pieces1;
    public LinkedList pieces2;
    public LinkedList piece1selfmoves;
    public LinkedList piece1enemymoves;
    public LinkedList piece2selfmoves;
    public LinkedList piece2enemymoves;
    
    Checkersgame(){
        board = new int[7][7];
        player1 = 12;
        player2 = 12;
        
    }
    
}
