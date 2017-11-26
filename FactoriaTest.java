

public class FactoriaTest {
	static long Factoria(int n){
		if(n==1) return 1;
		else return n*Factoria(n-1);
	}
	public static void main(String a[]){
		int n=8;
		System.out.println(n+"!="+Factoria(n));
	}
}
