package prova;

public class Moto extends VeicoloMotore
{
    protected String tipologia;
    protected int marcie;
    
    public Moto(String nome, String cognome, String luogoDiNascita, int giornoDiNascita, int meseDiNascita, int annoDiNascita, char sesso, int anni, int annoImmatricolazione, int cilindrata, String marca, String modello, String tipologia, int marcie)
    {
        super(nome, cognome, luogoDiNascita, giornoDiNascita, meseDiNascita, annoDiNascita, sesso, anni,annoImmatricolazione, cilindrata, marca, modello);
        this.tipologia = tipologia;
        this.marcie = marcie;
    }
    
    public Moto()
    {
        super();
        this.tipologia = "";
        this.marcie = 4;
    }
    
    public String getTipologia() { return tipologia; }
    
        public void setTipologia(String tipologia) { this.tipologia = tipologia; }
        
    public int getMarcie() { return marcie; }
    
        public void setMarcie(int marcie) 
        { 
            if(marcie > 6)
                this.marcie = 6;
            else if(marcie < 1)
                this.marcie = 1;
            else this.marcie = marcie;
        }
        
    public String toString()
    {
        return super.toString() + "\nIl veicolo di tipo: Moto " + this.getTipologia() + " ha " + this.getMarcie() + " marcie";
    }
    
    public String csv()
    {
        return "M;" + super.csv() + this.getTipologia() + ";" + this.getMarcie() + ";";
    }
}
