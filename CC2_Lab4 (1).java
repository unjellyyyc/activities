import java.util.Scanner;
public class CC2_Lab4{
public static void main(String[] args){


      int age = 0;


        Scanner in = new Scanner(System.in);
        System.out.print("Name:");
        String a = in.nextLine();
        System.out.print("Age: ");
        age = in.nextInt();
        
          

         if (a.equals("Jhim") || a.equals("Ethan")){
            if(age > 4 && age < 11){
            System.out.println("Hamster,Dog");
            }else if (age > 10 && age < 16){
            System.out.println("Spider,Dog");
            }else if (age > 15 && age < 21){
            System.out.println("Dog, Snake");
            }else if (age == 21){
            System.out.println("No Pets, Not Interested");
            }
         }else if (a.equals("Joy") || a.equals("Sally")){
            if (age>4 && age<11){
            System.out.println("Hamster, Cat");
            }else if (age>10 && age<16){
            System.out.println("Cat, Rabbit");
            }else if (age>15 && age< 21){
            System.out.println("Cat");
            }else if (age == 21){
            System.out.print("No Pets, Not Interested");
            }
          }else{
            System.out.print("Error");
            }
          
      }
	
	}
