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
public class CheckersML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Board look: ");
        Board board = new Board();
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                if(board.get(i).get(j).owner == "none"){
                    System.out.print("  "+" |");
                }
                else if(board.get(i).get(j).owner == "p1"){
                    System.out.print(" x"+" |");
                }
                else if(board.get(i).get(j).owner == "p2"){
                    System.out.print(" o"+" |");
                }
                else{
                    System.out.println("...");
                }
            }
            System.out.println("");
        }
        
        System.out.println("Moving a chip...");
        board.move(5, 0, 4, 1);
        
        System.out.println("Board new: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                if(board.get(i).get(j).owner == "none"){
                    System.out.print("  "+" |");
                }
                else if(board.get(i).get(j).owner == "p1"){
                    System.out.print(" x"+" |");
                }
                else if(board.get(i).get(j).owner == "p2"){
                    System.out.print(" o"+" |");
                }
                else{
                    System.out.println("...");
                }
            }
            System.out.println("");
        }
    }
    
}
