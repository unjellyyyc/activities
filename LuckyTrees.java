import javax.swing.*;
public class LuckyTrees{
  public static void main(String[] args){
    int tree;
    do{
      String zx = JOptionPane.showInputDialog("Enter input:");
      tree = Integer.parseInt(zx);
        if(tree==0){
          System.out.println(tree + "       -END-");
        }else if(tree/10<1){ 
          System.out.println(tree + "       NORMAL");
        }else if (tree%7==0 && tree%3==0){
          System.out.println(tree + "      LUCKY");
        }else if (tree>5000){
          System.out.println("Invalid Input");
          }else{
          System.out.println(tree + "      NORMAL");
          }
        }while(tree!=0);
       
      
  }
}  