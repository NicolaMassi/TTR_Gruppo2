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
       tratte[16] = new Tratta(4, "grigio", new Stazione("Seattle"), new Stazione("Calgary"), false);
       tratte[17] = new Tratta(4, "grigio", new Stazione("Calgary"), new Stazione("Helena"), false);
       tratte[18] = new Tratta(3, "rosa", new Stazione("Helena"), new Stazione("Saul Lake City"), false);
       tratte[19] = new Tratta(3, "rosa", new Stazione("Sault Lake City"), new Stazione("Denver"), false);
       tratte[20] = new Tratta(3, "gialla", new Stazione("Sault Lake City"), new Stazione("Denver"), false);
       tratte[21] = new Tratta(5, "bianca", new Stazione("Denver"), new Stazione("Phoenix"), false);
       tratte[22] = new Tratta(3, "grigio", new Stazione("Phoenix"), new Stazione("Los Angeles"), false);
       tratte[23] = new Tratta(6, "nera", new Stazione("Los Angeles"), new Stazione("El Paso"), false);
       tratte[25] = new Tratta(3, "grigia", new Stazione("Phoenix"), new Stazione("Santa Fe"), false);
       tratte[26] = new Tratta(2, "grigia", new Stazione("Santa Fe"), new Stazione("Denver"), false);
       tratte[27] = new Tratta(2, "grigia", new Stazione("Santa Fe"), new Stazione("El Paso"), false);
       tratte[28] = new Tratta(4, "verde", new Stazione("Denver"), new Stazione("Helena"), false);
       tratte[29] = new Tratta(6, "bianco", new Stazione("Calgary"), new Stazione("Winnipeg"), false);
       tratte[30] = new Tratta(4, "blu", new Stazione("Winnipeg"), new Stazione("Helena"), false);
       tratte[31] = new Tratta(6, "arancione", new Stazione("Helena"), new Stazione("Duluth"), false);
       tratte[32] = new Tratta(4, "nera", new Stazione("Winnipeg"), new Stazione("Duluth"), false);
       tratte[33] = new Tratta(5, "rosso", new Stazione("Helena"), new Stazione("Omaha"), false);
       tratte[34] = new Tratta(4, "rosa", new Stazione("Denver"), new Stazione("Omaha"), false);
       tratte[35] = new Tratta(4, "nera", new Stazione("Denver"), new Stazione("Kansas City"), false);
       tratte[36] = new Tratta(4, "arancio", new Stazione("Denver"), new Stazione("Kansas City"), false);
       tratte[37] = new Tratta(4, "rossa", new Stazione("Denver"), new Stazione("Oklahoma City"), false);
       tratte[38] = new Tratta(3, "blu", new Stazione("Santa Fe"), new Stazione("Oklahoma City"), false);
       tratte[39] = new Tratta(5, "giallo", new Stazione("El Paso"), new Stazione("Oklahoma City"), false);
       tratte[40] = new Tratta(4, "rosso", new Stazione("El Paso"), new Stazione("Dallas"), false);
       tratte[41] = new Tratta(6, "verde", new Stazione("El Paso"), new Stazione("Houston"), false);
       tratte[42] = new Tratta(1, "grigio", new Stazione("Houston"), new Stazione("Dallas"), false);
       tratte[43] = new Tratta(1, "grigio", new Stazione("Houston"), new Stazione("Dallas"), false);
       tratte[44] = new Tratta(2, "grigio", new Stazione("Dallas"), new Stazione("Oklahoma City"), false);
       tratte[45] = new Tratta(2, "grigio", new Stazione("Dallas"), new Stazione("Oklahoma City"), false);
       tratte[46] = new Tratta(2, "grigio", new Stazione("Oklahoma City"), new Stazione("Kansas City"), false);
       tratte[47] = new Tratta(2, "grigio", new Stazione("Oklahoma City"), new Stazione("Kansas City"), false);
       tratte[48] = new Tratta(1, "grigio", new Stazione("Kansas City"), new Stazione("Omaha"), false);
       tratte[49] = new Tratta(1, "grigio", new Stazione("Kansas City"), new Stazione("Omaha"), false);
       tratte[50] = new Tratta(2, "grigio", new Stazione("Omaha"), new Stazione("Duluth"), false);
       tratte[51] = new Tratta(2, "grigio", new Stazione("Omaha"), new Stazione("Duluth"), false);
       tratte[52] = new Tratta(6, "grigio", new Stazione("Winnipeg"), new Stazione("Sault St. Marie"), false);
       tratte[53] = new Tratta(3, "grigio", new Stazione("Duluth"), new Stazione("Sault St. Marie"), false);
       tratte[54] = new Tratta(2, "blu", new Stazione("Kansas City"), new Stazione("Saint Louis"), false);
       tratte[55] = new Tratta(2, "rosa", new Stazione("Kansas City"), new Stazione("Saint Louis"), false);
       tratte[56] = new Tratta(2, "grigio", new Stazione("Oklahoma City"), new Stazione("Little Rock"), false);
       tratte[57] = new Tratta(2, "grigio", new Stazione("Dallas"), new Stazione("Little Rock"), false);
       tratte[58] = new Tratta(2, "grigio", new Stazione("Houston"), new Stazione("new Orleans"), false);
       tratte[59] = new Tratta(3, "verde", new Stazione("Little Rock"), new Stazione("new Orleans"), false);
       tratte[60] = new Tratta(2, "grigio", new Stazione("Little Rock"), new Stazione("Saint Louis"), false);
       tratte[61] = new Tratta (2, "verde", new Stazione ("Saint Louis"), new Stazione ("Chicago"), false);
       tratte[62] = new Tratta (2, "bianco", new Stazione("Saint Louis"), new Stazione("Chicago"), false);
       tratte[63] = new Tratta (4, "blu", new Stazione("Omaha"), new Stazione("Chicago"), false);
       tratte[64] = new Tratta (3, "rosso", new Stazione("Chicago"), new Stazione("Duluth"), false);
       tratte[65] = new Tratta (3, "bianco", new Stazione("Little Rock"), new Stazione("Nashville"), false);
       tratte[66] = new Tratta (2, "grigio", new Stazione("Nashville"), new Stazione("Saint Louis"), false);
       tratte[67] = new Tratta (5, "verde", new Stazione("Saint Louis"), new Stazione("Pittsburgh"), false);
       tratte[68] = new Tratta (4, "bianco", new Stazione("Chicago"), new Stazione("Toronto"), false);
       tratte[69] = new Tratta (6,"rosa", new Stazione("Duluth"), new Stazione("Toronto"), false);
       tratte[70] = new Tratta (2, "grigio", new Stazione("Toronto"), new Stazione("Sault St.Marie"), false);
       tratte[71] = new Tratta (3, "nero", new Stazione("Chicago"), new Stazione("Pittsburgh"), false);
       tratte[72] = new Tratta (3, "arancio", new Stazione("Chicago"), new Stazione("Pittsburgh"), false);
       tratte[73] = new Tratta (4, "giallo", new Stazione("Nashville"), new Stazione("Pittsburg"), false);
       tratte[74] = new Tratta (5, "nero", new Stazione ("Sault St.Marie"), new Stazione("Montreal"), false);
       tratte[75] = new Tratta (3, "grigio", new Stazione("Montreal"), new Stazione("Toronto"), false);
       tratte[76] = new Tratta (2, "grigio", new Stazione("Toronto"), new Stazione("Pittsburgh"), false);
       tratte[77] = new Tratta (2, "grigio", new Stazione("Pittsburgh"), new Stazione("Raleigh"), false);
       tratte[78] = new Tratta (3, "nero", new Stazione("Nashville"), new Stazione("Raleigh"), false);
       tratte[79] = new Tratta (1, "grigio", new Stazione("Nashville"), new Stazione("Atlanta"), false);
       tratte[80] = new Tratta (4, "giallo", new Stazione("Atlanta"), new Stazione("New Orleans"), false);
    }
    
    public void setTratte(Tratta tratte[]) {
        this.tratte = tratte;
    }
    
    public void setStazioni(Stazione stazioni[]){
        this.stazioni = stazioni;
    }
}
