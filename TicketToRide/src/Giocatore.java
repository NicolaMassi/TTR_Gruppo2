public class Giocatore {
    
    private Trenino treniniDisponibili[] = new Trenino[];
    private Tratta trattePrese[] = new Tratta[];
    private CartaObiettivo carteObiettivo[] = new CartaObiettivo[];
    private CartaTreno carteTreno[] = new CartaTreno[];
    private boolean trattaMaggiore;
    
    public Giocatore(){}
    
    public Giocatore(Trenino treniniDisponibili[], Tratta trattePrese[], CartaObiettivo carteObiettivo[], CartaTreno carteTreno[]){
        this.treniniDisponibili = treniniDisponibili;
        this.trattePrese = trattePrese;
        this.carteObiettivo = carteObiettivo;
        this.carteTreno = carteTreno;
    }
    
    public void setTreniniDisponibili(Trenino treniniDisponibli[]){
        this.treniniDisponibili = treniniDisponibili;
    }
    
    public void setTrattePrese(Trenino trattePrese[]){
        this.trattePrese = trattePrese;
    }
    
    public void setCarteObiettivo(CartaObiettivo carteObiettivo[]){
        this.carteObiettivo = carteObiettivo;
    }
    
    public void setCarteTreno(CartaTreno carteTreno[]){
        this.carteTreno = carteTreno;
    }
    
    public void settrattaMaggiore (boolean trattaMaggiore){
        this.trattaMaggiore = trattaMaggiore;
    }
    
    public boolean getTrattaMaggiore(){
        return trattaMaggiore;
    }
}
