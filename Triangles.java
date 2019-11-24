import java.util.Scanner;

public class Triangles{
  public static void main(String[]args){
  System.out.print("Enter Triangle Height: ");
  Scanner sc = new Scanner(System.in);
  int qwe = sc.nextInt();
  
  for(int h=1;h<=qwe;h++){
    if(h!=50){
      System.out.print("1");
      
      for(int n=2;n<=h;n++){
        System.out.print("_"+n);
      }
        System.out.print("\n");
    }else{
        System.out.print("1");
        
        
        for(int n=2;n<= h;n++){
          
          System.out.print("_"+n);
          
          
        } 
      }
   }
   }
}         
      
      
    
    