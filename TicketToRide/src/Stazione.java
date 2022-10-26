public class Stazione {
    
    private String stazione;
    
    public Stazione(){}
    
    public Stazione(String stazione)
    {
        this.stazione=stazione;
    }
    
    public void setStazione (String stazione)
    {
        this.stazione=stazione;
    }
    
    public String getStazione()
    {
        return stazione;
    }
    
    public String toString()
    {
        return "La stazione è:" + stazione;
    }
}
