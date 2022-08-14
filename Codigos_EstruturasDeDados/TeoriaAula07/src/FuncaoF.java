public class FuncaoF{

	public static int f(int x, int y){
        	int p = 1;
        	while(y>0){
           	 p = p * x;
          	  y=y-1;
        	}
        	return p;
	}

	public static int f2(int v[], int inicio, int fim) {
        	int meio = (inicio+fim)/2;
        	int n1, n2;
        	if(meio>inicio){
            		n1=f2(v, inicio, meio);
            		n2=f2(v, meio+1, fim);
        	} else{
            		n1=v[inicio];
            		n2=v[fim];
        	}
        	if(n1>n2) return n1; else return n2;
    	}

    public static void main(String[] args) {
    	int result, result2;
    	int[] v = {1, 54, 90, 8, 10, 65, 72, 31, 59, 78};
    	int e=0;
        int d= v.length - 1;
    	
    	result = f(8, 10);
    	result2 = f2(v, e, d);
    	System.out.println(result);
    	System.out.println(result2);
    	
    }

}
