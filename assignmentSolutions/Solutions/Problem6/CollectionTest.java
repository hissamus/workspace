import java.util.Scanner;

public class CollectionTest {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		int b1=b/2;
		long ans=power(a, b1);
		if(b%2==0){
			ans=ans*ans;
		}
		else{
			ans=(ans*ans)*a;
		}
		System.out.println(a+" raise to power of "+b+" is "+ans);
		
		
	}
	public static int power(int a, int b){
		if (b == 1) {
			return a;
			} else if (b == 0) {
			return 1;
			}

			return a * power(a, b - 1); 
		
		
	}

}
