public class VariablesAndDataTypes{
  public static void main(String[]args){
  char letter= 'A';
  float colder = 16f;
  double hotter = 23.5;
  long hours = 24;
  short days = 7;
  byte weeks = 4;
  int month = 12;
  boolean oh = true;
  
  if(oh == true){
  System.out.print("The temperature in Baguio City has warmed through the years.\n" +
  "      " +letter+" "+ "recent news article stated that the City has been averaging" +" "+ colder +
  " " + "degrees celcius at dawn and" +" " + hotter +" "+"at noon.\n" +
  "             " + "Regardless, lowlanders still feels cold" +" "+hours +" "+ "hours a day," + days +
  " " + "days a week," +" "+weeks  +" "+"weeks per month and" +" "+ month +" "+"months each year.");
 }else{
  System.out.print("The boolean was changed to a False value.");
 }

    }
 }
  