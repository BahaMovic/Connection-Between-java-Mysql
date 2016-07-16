import java.util.Scanner;

public class binary {
public static void main(String[] args){
	double Number ;
	System.out.println("Enter Your Number : ");
	Scanner s = new Scanner(System.in);
	Number = s.nextDouble();
	
	for(int i = 10 ; i>=0 ; i--){
		double pow = Math.pow(2, i);
		if(Number>=pow){
			System.out.print(1+" ");
			Number -= pow;
		}else{
			System.out.print(0+" ");
		}
	}
}
}
