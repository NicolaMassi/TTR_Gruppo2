
public class CartaTreno extends Carta{

    private String colore;
    private boolean jolly;
    
    
    public CartaTreno(){}
    
    public CartaTreno(String colore, boolean jolly){
            this.colore = colore;
            this.jolly = jolly;
        }
    
    public void setColore (String colore){
            this.colore = colore;
        }
    
    public String getColore(){
            return colore;
        }   
    
    public boolean isJolly(){
            if(jolly)
                return true;
            return false;
        }
}
