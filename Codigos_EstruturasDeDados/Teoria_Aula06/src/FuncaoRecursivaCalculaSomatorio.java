public class FuncaoRecursivaCalculaSomatorio{
	private static int S(int n){
        if (n==0 || (n==1)) return 1;
        return n + S(n-1);
    }
}