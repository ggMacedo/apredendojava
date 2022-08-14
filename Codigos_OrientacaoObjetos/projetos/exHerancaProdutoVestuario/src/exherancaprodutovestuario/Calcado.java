
package exherancaprodutovestuario;


public class Calcado extends Vestuario{
    private String materialSola;
    private String materialParteSuperior;
    private String materialInterno;

    public Calcado() {
    }

    public Calcado(int c, String d, double v, String nome, String cor, String tamanho, String materialSola, String materialParteSuperior, String materialInterno) {
        super(c, d, v, nome, cor, tamanho);
        this.materialSola = materialSola;
        this.materialParteSuperior = materialParteSuperior;
        this.materialInterno = materialInterno;
    }

    public String getMaterialInterno() {
        return materialInterno;
    }

    public void setMaterialInterno(String materialInterno) {
        this.materialInterno = materialInterno;
    }

    public String getMaterialSola() {
        return materialSola;
    }

    public void setMaterialSola(String materialSola) {
        this.materialSola = materialSola;
    }

    public String getMaterialParteSuperior() {
        return materialParteSuperior;
    }

    public void setMaterialParteSuperior(String materialParteSuperior) {
        this.materialParteSuperior = materialParteSuperior;
    }
    
    @Override
    public String print(){
        System.out.println("\nCalçado");
        String ret = super.print();
        ret += "\nMaterial Sola: " + this.getMaterialSola()+ "\nMaterial Parte Superior: " + this.getMaterialParteSuperior()+ "\nMaterial Interno: " + this.getMaterialInterno();
        return ret;
    }
    
    
    
}
