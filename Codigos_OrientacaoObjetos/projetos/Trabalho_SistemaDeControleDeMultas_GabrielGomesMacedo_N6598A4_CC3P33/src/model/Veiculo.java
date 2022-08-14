
package model;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
public abstract class Veiculo {
    private String placa;
    private String cor;
    private String nome_veiculo;
    private String marca_veiculo;
    
    public Veiculo(){
        
    }

    public Veiculo(String p, String c, String nome_v, String marca_v) {
        this.setPlaca(p);
        this.setCor(c);
        this.setNome_veiculo(nome_v);
        this.setMarca_veiculo(marca_v);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome_veiculo() {
        return nome_veiculo;
    }

    public void setNome_veiculo(String nome_veiculo) {
        this.nome_veiculo = nome_veiculo;
    }

    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

}
