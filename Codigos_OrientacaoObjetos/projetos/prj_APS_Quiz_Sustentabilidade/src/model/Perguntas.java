
package model;


public abstract class Perguntas implements mascara_Perguntas{
    //VETORES E MATRIZ COM AS PERGUNTAS DO QUIZ, AS OPÇÕES DE RESPOSTAS E AS OPÇÕES CORRETAS DE CADA PERGUNTA
        private String[] questoes = {"O que cobre a maior parte do nosso planeta?",
                                     "O que as fumaças dos cigarros, dos carros e indústria causam?",
                                     "O que os depósitos de lixos colocados em solo sem isolamento podem prejudicar?",
                                     "Como podemos preservar o solo?",
                                     "Qual atitude indica o desperdício de água?",
                                     "O que deve ser feito para evitar erosão?",
                                     "Qual tipo de água não tem risco de doenças?",
                                     "O que são recursos naturais?",
                                     "Qual é o nome da mistura de água e restos de lixo decomposto que contamina o solo?",
                                     "Uma latinha de refrigerante deve ser descartada em qual lixo?"};
        private String[][] opcoesResp = {
                                            {"Água","Ar","Solo","Vegetais"},
                                            {"Poluição das cidades","Poluição do ar","Morte dos peixes e vegetais","Poluição dos rios e lagos"},
                                            {"Somente o homem","As residências","O lençol de água subterrâneo","As plantas frutíferas"},
                                            {"Desmatando","Queimando","Poluindo","Reflorestando"},
                                            {"Desligar o chuveiro", "Lavar o carro na mangueira", "Fechar torneira ao escovar os dentes", "Tomar banho rápido"},
                                            {"Desmatar as árvores", "Reflorestar enconstas", "Planejar construções", "Evitar queimadas"},
                                            {"Água clara", "Água de rios limpos", "Água cristalina", "Água filtrada"},
                                            {"Recursos de pequeno porte", "Recursos da água", "Diversos componentes da natureza", "Diferentes criações do homem"},
                                            {"Sujeira", "Imundíce", "Chorume", "Mal cheiro"},
                                            {"Metal", "Vidro", "Plástico", "Orgânico"}
                                            
                                        };
        private char[] opcoesCertas = {'A','B','C','D', 'B', 'A', 'D', 'C', 'C', 'A'};
    //-----------------------------------------------------------------------------------//
        
    //ATRIBUTOS
        private char resposta;
        private int index;
        private int totalPerguntas = questoes.length;
    //------------------------------------------------------------------------------------------//
    
    //MÉTODOS GET E SET
        @Override
        public char getResposta() {
            return this.resposta;
        }
        @Override
        public void setResposta(char resposta) {
            this.resposta = resposta;
        }
        @Override
        public int getIndex() {
            return this.index;
        }
        @Override
        public void setIndex(int index) {
            this.index = index;
        }
        @Override
        public int getTotalPerguntas() {
            return this.totalPerguntas;
        }
        @Override
        public void setTotalPerguntas(int totalPerguntas) {
            this.totalPerguntas = totalPerguntas;
        }
        @Override
        public String[] getQuestoes() {
            return questoes;
        }
        @Override
        public void setQuestoes(String[] questoes) {
            this.questoes = questoes;
        }
        @Override
        public String[][] getOpcoesResp() {
            return opcoesResp;
        }
        @Override
        public void setOpcoesResp(String[][] opcoesResp) {
            this.opcoesResp = opcoesResp;
        }
        @Override
        public char[] getOpcoesCertas() {
            return opcoesCertas;
        }
        @Override
        public void setOpcoesCertas(char[] opcoesCertas) {
            this.opcoesCertas = opcoesCertas;
        }
    //----------------------------------------------------------------------------------------//         
}
