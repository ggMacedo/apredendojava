package expublicacao;


public class Revista extends Publicacao{
    private String editor;
    private String local;

    public Revista(String t, String d, String editor, String local) {
        super(t, d);
        this.setEditor(editor);
        this.setLocal(local);
    }
    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Titulo: " + super.getTitulo() + "\nData publicação: " + super.getDataPublicacao() + "\nEditor: " + this.getEditor() + "\nLocal: " + this.getLocal());
    } 
    
    
    
    
}
