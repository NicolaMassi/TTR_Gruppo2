public class Tratta {
    
    private int lunghezza;
    private String colore;
    private Stazione inizio;
    private Stazione fine;
    private boolean occupata;
    
   public Tratta(){
   } 
   
   public Tratta(int lunghezza){
   
       this.lunghezza = lunghezza;
   }
   
   public Tratta(String colore){
   
       this.colore = colore;
   }
   
   public Tratta(Stazione inizio, Stazione fine){
   
       this.inizio = inizio;
       this.fine = fine;
   }
   
   public Tratta(boolean occupata){
   
       this.occupata = occupata;
   }
   
   public int getLunghezza(){
       return lunghezza;
   }
   
    public String getColore(){
      return colore;
   }
    
    public Stazione getInizio(){
      return inizio;
   }
    
    public Stazione getFine(){
      return fine;
   }
   
    public boolean getOccupata(){
      return occupata;
   }
      
    public void setLunghezza(int lunghezza){
      this.lunghezza = lunghezza;
    }   
       
    public void setColore(String colore){
      this.colore = colore;
    }     
    
    public void setInizio(Stazione inizio){
      this.inizio = inizio;
    }   
       
    public void setFine(Stazione fine){
      this.fine = fine;
    }   
       
    public void setOccupata(boolean occupata){
      this.occupata = occupata;
    }   
       
       
    @Override
    public String toString(){
    
        return " " + lunghezza +  " " + colore + " " + inizio + " " + fine + " " + occupata + " ";
    }
}
