
package model;


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int d, int m, int a) {
        this.setDia(d);
        this.setMes(m);
        this.setAno(a);
    }
    
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <=31){
            this.dia = dia;
        }else{
            this.dia = 0;
        }
    }

    public int getMes() {
        return this.mes;
       
    }
       
    public void setMes(int mes) {
        if(mes >= 1 && mes <=12){
            this.mes = mes;
        }else{
            this.mes = 0;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if(ano >= 1500 && ano <=2100){
            this.ano = ano;
        }else{
            this.ano = 0000;
        }
    }
    
    public void cadastrarDados(){
        
    }
    
    public String encontraMes(int mess){
        String mes2 = "";
        switch(mess){
            case 1:
                mes2 = "Janeiro";
                break;
            case 2:
                mes2 = "Fevereiro";
                break;
            case 3:
                mes2 = "Março";
                break;
            case 4:
                mes2 = "Abril";
                break;
            case 5:
                mes2 = "Maio";
                break;
            case 6:
                mes2 = "Junho";
                break;
            case 7:
                mes2 = "Julho";
                break;
            case 8:
                mes2 = "Agosto";
                break;
            case 9:
                mes2 = "Setembro";
                break;
            case 10:
                mes2 = "Outubro";
                break;
            case 11:
                mes2 = "Novembro";
                break;
            case 12:
                mes2 = "Dezembro";
                break;
            default:
                mes2 = "Mês inválido";
                break;
        }
        return mes2;    
    }
    
    public String imprimirData(){
        String ret = "Hoje é dia " + this.getDia() + " do mês de " + this.encontraMes(this.getMes()) + " do ano de " + this.getAno();
        return ret;
        
    }
    
}
