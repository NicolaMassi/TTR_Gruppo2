public class Tabellone extends Tratta{
    
    private Tratta tratte[] = new Tratta[100];
    private Stazione stazioni[] = new Stazione[36];

    public Tabellone(){}
    
    public Tabellone(Tratta tratte[], Stazione stazioni[]){
       tratte[1] = new Tratta(1, "grigio", new Stazione("Vancouver"), new Stazione("Seattle"), false); 
       tratte[2] = new Tratta(1, "grigio", new Stazione("Vancouver"), new Stazione("Seattle"), false); 
       tratte[3] = new Tratta(3, "grigio", new Stazione("Vancouver"), new Stazione("Calgary"), false); 
       tratte[4] = new Tratta(1, "grigio", new Stazione("Seattle"), new Stazione("Portland"), false); 
       tratte[5] = new Tratta(1, "grigio", new Stazione("Seattle"), new Stazione("Portland"), false);
       tratte[6] = new Tratta(5, "verde", new Stazione("Portland"), new Stazione("San Francisco"), false);
       tratte[7] = new Tratta(5, "rosa", new Stazione("Portland"), new Stazione("San Francisco"), false);
       tratte[8] = new Tratta(3, "gialla", new Stazione("San Francisco"), new Stazione("Los Angeles"), false);
       tratte[9] = new Tratta(3, "rosa", new Stazione("San Francisco"), new Stazione("Los Angeles"), false);
       tratte[10] = new Tratta(2, "griga", new Stazione("Los Angeles"), new Stazione("Las Vegas"), false);
       tratte[11] = new Tratta(3, "arancio", new Stazione("Las Vegas"), new Stazione("Sault Lake City"), false);
       tratte[12] = new Tratta(5, "arancio", new Stazione("Sault Lake City"), new Stazione("San Francisco"), false);
       tratte[13] = new Tratta(5, "bianco", new Stazione("Sault Lake City"), new Stazione("San Francisco"), false);
       tratte[14] = new Tratta(6, "blu", new Stazione("Sault Lake City"), new Stazione("Portland"), false);
       tratte[15] = new Tratta(6, "gialla", new Stazione("Seattle"), new Stazione("Helena"), false);
       tratte[16] = new Tratta(4, "grigio", new Stazione("Seattle"), new Stazione("Caglary"), false);
       tratte[17] = new Tratta(4, "grigio", new Stazione("Caglary"), new Stazione("Helena"), false);
       tratte[18] = new Tratta(3, "rosa", new Stazione("Helena"), new Stazione("Saul Lake City"), false);
       tratte[19] = new Tratta(3, "rosa", new Stazione("Sault Lake City"), new Stazione("Denver"), false);
       tratte[20] = new Tratta(3, "gialla", new Stazione("Sault Lake City"), new Stazione("Denver"), false);
       tratte[21] = new Tratta(5, "bianca", new Stazione("Denver"), new Stazione("Phoenix"), false);
       tratte[22] = new Tratta(3, "grigio", new Stazione("Phoenix"), new Stazione("Los Angeles"), false);
       tratte[23] = new Tratta(6, "nera", new Stazione("Los Angeles"), new Stazione("El Paso"), false);
       tratte[25] = new Tratta(3, "grigia", new Stazione("Phoenix"), new Stazione("Santa Fe"), false);
    }
    
    public void setTratte(Tratta tratte[]) {
        this.tratte = tratte;
    }
    
    public void setStazioni(Stazione stazioni[]){
        this.stazioni = stazioni;
    }
}
