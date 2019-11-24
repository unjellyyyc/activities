import java.util.Scanner;
public class KamoteSayote{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int nKamote, mNeighbor, kSayote;
    System.out.print("Enter Input: ");
    nKamote = sc.nextInt();
    mNeighbor = sc.nextInt();
    kSayote = sc.nextInt();
   
    if (mNeighbor <= nKamote && nKamote >= 1 && kSayote <= 1000 && mNeighbor <= 1000 && nKamote <= 1000){
   
      int x = nKamote/mNeighbor;
      int rmndr = nKamote%mNeighbor;
      int y= rmndr*kSayote;
     
      System.out.println(x +" kamotes");
      System.out.println(y + " sayotes");
   
    }else{
      System.out.print("Invalid Input.");
   
   
    }
 
 
 
  }


}