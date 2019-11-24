import java.util.Scanner;
public class BonusPoint{
  public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
  int num1, num2, num3, num4, num5, num6;
  try{
  System.out.print("Enter 6 numbers: ");
  num1=scan.nextInt();
  num2=scan.nextInt();
  num3=scan.nextInt();
  num4=scan.nextInt();
  num5=scan.nextInt();
  num6=scan.nextInt();
    if(num1>=0&&num1<10&&num2>=0&&num2<10&&num3>=0&&num3<10&&num4>=0&&num4<10&&num5>=0&&num5<10&&num6>=0&&num6<10){
      for(int a=11; a<100; a++){
        if(a/10==num1||a/10==num2||a/10==num3||a/10==num4||a/10==num5||a/10==num6
           ||a%10==num1||a%10==num2||a%10==num3||a%10==num4||a%10==num5||a%10==num6){
            continue;
        }
          System.out.println(a);
      }
    }else{
      System.out.print("Invalid!");
      }
  }catch(Exception e){
      System.out.print("Invalid!");
    }
  }
}