import javax.swing.JOptionPane;

public class Initials{
public static void main(String[] args){

    char first_name;
    first_name = JOptionPane.showInputDialog("Enter your first name's initial:").charAt(0);

    char middle_name;
    middle_name = JOptionPane.showInputDialog("Enter your middle name's initial:").charAt(0);

    char family_name;
    family_name = JOptionPane.showInputDialog("Enter your family name's initial:").charAt(0);

    String Initials_name;
    Initials_name = first_name+"."+middle_name+"."+family_name;


    JOptionPane.showMessageDialog(null, Initials_name);
    System.exit(0);
  }

}