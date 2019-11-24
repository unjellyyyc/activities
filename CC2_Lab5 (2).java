
public class CC2_Lab5{
  public static void main(String[]args){
    double messageCount = Math.random() * 1000;
    double totalCharge = 0;

    System.out.println("You have sent " + (int)messageCount + " messages.");

    if(messageCount <200){
    System.out.println("You have incurred " + totalCharge + " PHP in charges.");
    }else if(messageCount > 200){
      totalCharge = ((int)messageCount - 200)*0.5;
      
      System.out.println("You have incurred " + totalCharge + " PHP in charges.");
    
    }
  
  
  
  
  }



}