public class CartaObiettivo extends Carta{
    private String inizio;
    private String fine;
    private int punteggio;
    
    public CartaObiettivo(){}
    
    public CartaObiettivo(int punteggio, String fine, String inizio){
        this.punteggio = punteggio;
        this.fine = fine;
        this.inizio = inizio;
    }    
     
    public void setInizio(String inizio){
       this.inizio=inizio;
    }
    
    public String getInizio(){
        return inizio;
    }
    
    public void setFine(String fine){
       this.fine = fine;
    }
    
    public String getFine(){
        return fine;
    }
    
    public void setPunteggio(int punteggio){
        this.punteggio=punteggio;
    }
    public int getPunteggio(){
        return punteggio;
    }
    
    
}
