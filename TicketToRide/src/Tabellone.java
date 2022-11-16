public class Tabellone extends Tratta{
    
    private Tratta tratte[] = new Tratta[100];
    private Stazione stazioni[] = new Stazione[36];

    public Tabellone(){}
    
    public Tabellone(Tratta tratte[], Stazione stazioni[]){

        stazioni [1] = new Stazione ("Vancouver");
        stazioni [2] = new Stazione ("Seattle");
        stazioni [3] = new Stazione ("Portland");
        stazioni [4] = new Stazione ("San Francisco");
        stazioni [5] = new Stazione ("Los Angeles");
        stazioni [6] = new Stazione ("Las Vegas");
        stazioni [7] = new Stazione ("Salt Lake City");
        stazioni [8] = new Stazione ("Phoenix");
        stazioni [9] = new Stazione ("Calgary");
        stazioni [10] = new Stazione ("Helena");
        stazioni [11] = new Stazione ("Denver");
        stazioni [12] = new Stazione ("Santa Fe");
        stazioni [13] = new Stazione ("El Paso");
        stazioni [14] = new Stazione ("Oklahoma City");
        stazioni [15] = new Stazione ("Kansas City");
        stazioni [16] = new Stazione ("Omaha");
        stazioni [17] = new Stazione ("Duluth");
        stazioni [18] = new Stazione ("Winnipeg");
        stazioni [19] = new Stazione ("Dalla");
        stazioni [20] = new Stazione ("Houston");
        stazioni [21] = new Stazione ("Little Rock");
        stazioni [22] = new Stazione ("Saint Louis");
        stazioni [23] = new Stazione ("Chicago");
        stazioni [24] = new Stazione ("Sault St. Marie");
        stazioni [25] = new Stazione ("New Orleans");
        stazioni [26] = new Stazione ("Nashville");
        stazioni [27] = new Stazione ("Pittsburgh");
        stazioni [28] = new Stazione ("Toronto");
        stazioni [29] = new Stazione ("Montreal");
        stazioni [30] = new Stazione ("Boston");
        stazioni [31] = new Stazione ("New York");
        stazioni [32] = new Stazione ("Washington");
        stazioni [33] = new Stazione ("Raleigh");
        stazioni [34] = new Stazione ("Atlanta");
        stazioni [35] = new Stazione ("Charleston");
        stazioni [36] = new Stazione ("Miami");

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
       tratte[25] = new Tratta(3, "grigio", new Stazione("Phoenix"), new Stazione("Santa Fe"), false);
       tratte[81] = new Tratta(4, "arancio",  new Stazione("Atlanta"), new Stazione("New Orleans"), false); 
       tratte[82] = new Tratta(2, "grigio",  new Stazione("Atlanta"), new Stazione("Raleigh"), false);
       tratte[83] = new Tratta(2, "grigio",  new Stazione("Atlanta"), new Stazione("Raleigh"), false);
       tratte[84] = new Tratta(2, "grigio",  new Stazione("Raleigh"), new Stazione("Washington"), false);
       tratte[85] = new Tratta(2, "grigio",  new Stazione("Raleigh"), new Stazione("Washington"), false);
       tratte[86] = new Tratta(2, "arancio",  new Stazione("Washington"), new Stazione("New York"), false);
       tratte[87] = new Tratta(2, "nero",  new Stazione("Washington"), new Stazione("New York"), false);
       tratte[88] = new Tratta(2, "bianco",  new Stazione("Pittsburgh"), new Stazione("New York"), false);
       tratte[89] = new Tratta(2, "verde",  new Stazione("Pittsburgh"), new Stazione("New York"), false);
       tratte[90] = new Tratta(2, "grigio",  new Stazione("Boston"), new Stazione("Montreal"), false);
       tratte[91] = new Tratta(2, "grigio",  new Stazione("Boston"), new Stazione("Montreal"), false);
       tratte[92] = new Tratta(3, "blu",  new Stazione("Montreal"), new Stazione("New York"), false);
       tratte[93] = new Tratta(2, "giallo",  new Stazione("Boston"), new Stazione("New York"), false);
       tratte[94] = new Tratta(2, "rosso",  new Stazione("Boston"), new Stazione("New York"), false);
       tratte[95] = new Tratta(2, "grigio",  new Stazione("Pittsburgh"), new Stazione("Washington"), false);
       tratte[96] = new Tratta(2, "grigio",  new Stazione("Raleigh"), new Stazione("Charleston"), false);
       tratte[97] = new Tratta(2, "grigio",  new Stazione("Atlanta"), new Stazione("Charleston"), false);
       tratte[98] = new Tratta(4, "rosa",  new Stazione("Charleston"), new Stazione("Miami"), false);
       tratte[99] = new Tratta(5, "blu",  new Stazione("Atlanta"), new Stazione("Miami"), false);
       tratte[100] = new Tratta(6, "rosso",  new Stazione( "Miami"), new Stazione("New Orleans"), false);

    }
    
    public void setTratte(Tratta tratte[]) {
        this.tratte = tratte;
    }
    
    public void setStazioni(Stazione stazioni[]){
        this.stazioni = stazioni;
    }
}
