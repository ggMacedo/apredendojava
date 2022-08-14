public class FuncaoRecursivaSomaVetor{
    public static int somarVetorI(int[] v, int tam) {   
        int soma = 0;
        for(int i=0; i<v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    
    public static int somaVetorR(int[] v, int tam){
        if( tam==1) return v[0];
        return v[tam-1] + somaVetorR(v, tam-1);
    }
    
    
    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};    
        int B[] = {258};
        
        System.out.println("SomaVetorI(A[], 10) = " + somarVetorI(A, 10));
        System.out.println("SomaVetorR(A[], 10) = " +  somaVetorR(A, 10));
        
        System.out.printf("\n\n");
        
        System.out.println("SomaVetorI(B[], 1) = " + somarVetorI(B, 1));
        System.out.println("SomaVetorR(B[], 1) = " + somaVetorR(B, 1));
    }
}