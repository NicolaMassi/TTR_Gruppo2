public class Tabellone {
    
    private Tratta tratte[] = new Tratta[10];
    private Stazione stazioni[] = new Stazione[10];

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
    }
    
    public void setTratte(Tratta tratte[]) {
        this.tratte = tratte;
    }
    
    public void setStazioni(Stazione stazioni[]){
        this.stazioni = stazioni;
    }
}
