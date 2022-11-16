import java.util.Random;

public class mazzo{
   private int tipo;
   private Carta carte[] = new Carta[36];
   
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
   @Override
    public String toString()
    {
        if(tipo==0)
            return"La carta è una carta treno.";
        return"la carta è una carta tratta";
    }
    
    public void mescolaMazzo(){
        Random rand = new Random();
        
        for (int i = 0; i < carte.length; i++) {
            int randIndex = rand.nextInt(carte.length);
            Carta temp = carte[randIndex];
            carte[randIndex] = carte[i];
            carte[i] = temp;
        }
    }
}
