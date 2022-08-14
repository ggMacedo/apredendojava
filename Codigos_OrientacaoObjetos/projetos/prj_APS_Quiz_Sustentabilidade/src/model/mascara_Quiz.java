
package model;


public interface mascara_Quiz {
    int getResultado();
    void setResultado(int resultado);
    int getSecundos();
    void setSecundos(int secundos);
    int getRespostasCorretas();
    void setRespostasCorretas(int respostasCorretas);
    int getDificuldade();
    void setDificuldade(int dificuldade);
    void validar_Dificuldade();
    
}
