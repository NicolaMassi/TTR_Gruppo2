public class mazzo{
   private int tipo;
   private Carta carte[] = new Carta[];
   
   public mazzo(){}
   
   public mazzo(int tipo, Carta carte[]){
       this.tipo=tipo;
       this.carte = carte;
   }
   
    public void setTipo(int tipo){
     this.tipo = tipo; 
    }
    
    public int getTipo(){
      return tipo;  
    }
    
    public String toString()
    {
        if(tipo==0)
            return"La carta è una carta treno.";
        return"la carta è una carta tratta";
    }
}
