public class Tabellone {
    
    private Tratta tratte[] = new Tratta[10];
    private Stazione stazioni[] = new Stazione[10];

    public Tabellone(){}
    
    public Tabellone(Tratta tratte[], Stazione stazioni[]){
        this.tratte = tratte;
        this.stazioni = stazioni;
    }
    
    public void setTratte(Tratta tratte[]) {
        this.tratte = tratte;
    }
    
    public void setStazioni(Stazione stazioni[]){
        this.stazioni = stazioni;
    }
}
