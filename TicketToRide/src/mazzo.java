public class mazzo{
   private int tipo;
   private Carta carte[] = new Carta[1];
   
   public mazzo(){}
   
   public mazzo(int tipo){
       this.tipo=tipo;
   }
    public void setTipo(int tipo){
     this.tipo = tipo; 
    }
    
    public int getTipo(){
      return tipo;  
    }
    
    /**
     *
     * @return
     */
    public String toString()
    {
        if(tipo==0)
            return"la carta è una carta treno";
        return"la carta è una carta tratta";
    }
    

}
