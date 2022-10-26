
import java.util.*;

public class TreninoColore {
    
    private String colore;
    
   public TreninoColore(){} //costruttore vuoto
   public TreninoColore(String colore)
        {
            this.colore = colore;      
        }
   
    public void SetTrenino(String colore) //metodo set
        {
            this.colore = colore;
        }
    
    public String getTrenino() //metodo get
        {
            return colore;
        }
    
    @Override 
    public String toString()
        {
            return "Il trenino è di colore: " + colore + "\n";
        }
}
