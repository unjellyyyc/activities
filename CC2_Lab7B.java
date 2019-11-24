import java.util.*;
import java.lang.*;
public class CC2_Lab7B{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String S; int numa, numb,numc,sum, numOperations,max;
  System.out.print("Enter # of operations: ");

  numOperations = sc.nextInt();
 
  if(numOperations>=1 && numOperations<=100){
  System.out.print("Enter all operations in one line: ");
 
    for(int a = 1; a<= numOperations;a++){
      S = sc.next();
      if(S.equals("negate")){
        numa = sc.nextInt();
        numb = numa + numa;
        System.out.println(numa-numb);
      }else if(S.equals("add")){
        numa = sc.nextInt();
        numb = sc.nextInt();
        sum = numa + numb;
        System.out.println(sum);
      }else if(S.equals("max")){
        numa = sc.nextInt();
        numb = sc.nextInt();
        System.out.println(Math.max(numa,numb));  
      }else{
        System.out.println("Invalid");
          }
      }  
      }else{
        System.out.println("Invalid number of operations");
    }
  }
}


