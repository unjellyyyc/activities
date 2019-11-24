import java.io.*;
import java.text.DecimalFormat;

public class Room{
   public static void main(String[] args)throws Exception{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    double length;
    double width;
    double area;

    System.out.print("Enter Length: ");
    length = Double.parseDouble (br.readLine());
    System.out.print("Enter Width: ");
    width = Double.parseDouble (br.readLine());
    area = length*width;
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.print("The floor space of the room is "+ df.format(area)+ "square units.");

  }

}