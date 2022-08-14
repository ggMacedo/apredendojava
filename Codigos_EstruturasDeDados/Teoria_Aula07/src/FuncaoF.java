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
            		n1=f(v, inicio, meio);
            		n2=f(v, meio+1, fim);
        	} else{
            		n1=v[inicio];
            		n2=v[fim];
        	}
        	if(n1>n2) return n1; else return n2;
    	}



}
