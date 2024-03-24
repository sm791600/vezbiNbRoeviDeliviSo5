/*Напиши програма со која ќе се пресметува кои броеви се деливи со 5 до n – тиот број
кој се внесува од тастатура.*/


package vezbiNbRoeviDeliviSo5;
import java.util.Scanner;

public class delivostso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vnes = new Scanner(System.in);
		int i,n;
		System.out.println("Vnesi do kolku broevi da se proveruva koj e deliv so 5");
		n=vnes.nextInt();
		i=1;
		while(i<=n) {
			if(i%5==0) {
				System.out.println(i);
			}
			i+=1;
		}
		
	}

}
