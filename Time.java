import java.util.Scanner;
public class Time{
    public static void main(String[] args){

      int hours, minutes, rminutes;

      Scanner in = new Scanner (System.in);
      System.out.print("Enter number of minutes: ");
      minutes = in.nextInt();
      hours = minutes/60;
      rminutes = minutes%60;

      System.out.print(minutes + " minutes is " +hours+ " hours and " +rminutes+ " minutes. ");

  }
}