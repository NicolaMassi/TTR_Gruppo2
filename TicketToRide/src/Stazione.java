public class Stazione {
    
    private String nome;
    
    public Stazione(){}
    
    public Stazione(String nome){
        this.nome=nome;
    }
    
    public void setStazione (String nome){
        this.nome=nome;
    }
    
    public String getStazione(){
        return nome;
    }
    
    @Override
    public String toString(){
        return "La stazione è:" + nome;
    }
}
