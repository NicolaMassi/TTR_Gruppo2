
public class Mazzo{
   private int tipo;
   private Carta carte[]=new Carta[];
   
   public Mazzo(){}
   public Mazzo(int tipo)
   {
       this.tipo=tipo;
   }
    public void setTipo()
    {
     this.tipo=tipo; 
    }
    
    public int getTipo(int tipo)
    {
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
