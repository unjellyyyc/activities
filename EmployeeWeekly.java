import javax.swing.*;
import java.text.DecimalFormat;
public class EmployeeWeekly{
  public static void main(String args[]){
  DecimalFormat df = new DecimalFormat("0.00");
  double input, bonus, total;
  int inputb;
  int range[] = {299,399,499,599,699,799,899,999,1000};
  int nClass [] = {0,0,0,0,0,0,0,0,0};
  char classification[] = {'A','B','C','D','E','F','G','H','I'};
  try{
    System.out.println("---------- TRYING SIMULATION ----------");
    first: for(int x=1;;x++){
      input = Double.parseDouble(JOptionPane.showInputDialog("Employee "+x+" Gross:"));
      if(input>=0&&input<=100000){
        bonus = input*.09;
        total = bonus+200;
        System.out.println("Employee #"+x);
        System.out.println("Week Gross "+x+": "+df.format(input));
        System.out.println("Week Bonus "+x+": "+df.format(bonus));
        System.out.println("Week Total "+x+": "+df.format(total));
        
        for(int y=0; y<range.length-1; y++){
          if(total<=range[y]){
            System.out.println("Classification "+x+": "+classification[y]);
            nClass[y]+=1;
            break;
          }else if(total>=range[range.length-1]){
            System.out.println("Classification "+x+": "+classification[range.length-1]);
            nClass[nClass.length-1]+=1;
            break;
          }
        }
        System.out.println("-----------");
      }else{
        System.out.println("---------- SIMULATION FAIL ----------");
        break;
      }
      do{
        inputb = Integer.parseInt(JOptionPane.showInputDialog("Enter another employee?\n[0] Yes\n[1] No"));
          if(inputb == 1){
            for(int y=0; y<nClass.length; y++){
              System.out.println("There are "+nClass[y]+" employees in class "+classification[y]+".");
            }
            System.out.println("---------- SIMULATION SUCCESSFUL ----------");
            break first;
          }
      }while(inputb !=0);
    }
  }catch(Exception e){
    System.out.println("---------- SIMULATION FAIL ----------");
  }
  }
}