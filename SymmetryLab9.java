import java.util.Scanner;
public class SymmetryLab9{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[][],x,x2,input;
		boolean check = true,checkb = true;
		System.out.print("Enter number: ");
		input = scan.nextInt();
		if(input>0&&input<=10){
			arr = new int[input][input];
			for(int y = 0;y<input;y++){
				for(int y2 = 0;y2<input;y2++){
					arr[y][y2] = scan.nextInt();
				}
			}
			for(int y = 0;y<input;y++){
				for(int y2 = 0+y;y2<input;y2++){
					if(arr[y][y2]==arr[y2][y]){
						check = true;
					}else{
						y = input;
						check = false;
						break;
					}
				}
			}
			for(int y = 0;y<input;y++){
				for(int y2 = y;y2<input;y2++){
					if(arr[y][input-y2-1]==arr[y2][input-y-1]){
						checkb = true;
					}else{
						y = input;
						checkb = false;
						break;
					}
				}
			}
			if(check&&checkb)
				System.out.println("\nYes");
			else
				System.out.println("\nNo");
		}else
			System.out.println("\nError");
	}
}