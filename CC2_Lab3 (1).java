public class CC2_Lab3{
  public static void main(String[]args){
      char g = 'G' , h = 'H' , e = 'E' , l = 'L' , a = 'A' , y = 'Y', exclamation = '!';
      long gg = g , hh = h , ee = e , ll = l , aa = a , yy = y , xx = exclamation;
      
      
      System.out.println(g + "-" + gg);
      System.out.println(h + "-" + hh);
      System.out.println(e + "-" + ee);
      System.out.println(l + "-" + ll);
      System.out.println(a + "-" + aa);
      System.out.println(y + "-" + yy);
      System.out.println("!" + "-" + xx);
     
     System.out.println(g + "" + h + "" + e + "" + l + "" + a + "" + y + "" + "!");
     
     long Sum = gg + hh + ee + ll + aa + yy + xx;
     System.out.println("Sum: " + Sum );
     long product = gg*hh*ee*ll*aa*yy*xx;
     System.out.println("Product: " + product);
     float ave = Sum/7;
     System.out.println("Average: " + ave);
     long remainder = gg%ee%ll%aa%yy%xx;
     System.out.println("Remainder:" + remainder);
 
 
 
 
    }
  }