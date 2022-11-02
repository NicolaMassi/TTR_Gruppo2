
public class CartaTreno {

    private String colore;
    private boolean jolly;
    
    
    public CartaTreno(){}
    public CartaTreno(String colore, boolean jolly)
        {
            this.colore = colore;
            this.jolly = jolly;
        }
    
    public void setColore (String colore)
        {
            this.colore = colore;
        }
    
    public String getColore()
        {
            return colore;
        }   
    
    public boolean isJolly(boolean jolly)
        {
            if(jolly)
                return true;
            
            return false;
        }
    
}
