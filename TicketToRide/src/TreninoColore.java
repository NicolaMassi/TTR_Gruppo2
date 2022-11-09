public class TreninoColore {
    
    private String colore;
    
   public TreninoColore(){}
   
   public TreninoColore(String colore){
            this.colore = colore;      
        }
   
    public void SetTrenino(String colore){
            this.colore = colore;
        }
    
    public String getTrenino(){
            return colore;
        }
    
    @Override 
    public String toString()
        {
            return "Il trenino è di colore: " + colore + "\n";
        }
}
