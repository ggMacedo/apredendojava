
package model;

public interface mascara_Perguntas {
    char getResposta();
    void setResposta(char resposta);
    int getIndex();
    void setIndex(int index);
    int getTotalPerguntas();
    void setTotalPerguntas(int totalPerguntas);
    String[] getQuestoes();
    void setQuestoes(String[] questoes);
    String[][] getOpcoesResp();
    void setOpcoesResp(String[][] opcoesResp);
    char[] getOpcoesCertas();
    void setOpcoesCertas(char[] opcoesCertas);
    
}
