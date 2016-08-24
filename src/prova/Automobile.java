package prova;

public class Automobile extends VeicoloMotore
{
    protected int numPorte;
    
    public Automobile(String nome, String cognome, String luogoDiNascita, int giornoDiNascita, int meseDiNascita, int annoDiNascita, char sesso, int anni, int annoImmatricolazione, int cilindrata, String marca, String modello, int numPorte)
    {
        super(nome, cognome, luogoDiNascita, giornoDiNascita, meseDiNascita, annoDiNascita, sesso, anni, annoImmatricolazione, cilindrata, marca, modello);
        this.numPorte = numPorte;
    }
    
    public Automobile()
    {
        super();
        this.numPorte = 0;
    }
    
    public int getNumPorte() { return numPorte; }
    
        public void setNumPorte(int numPorte) { this.numPorte = numPorte; }
        
    public String toString()
    {
        return super.toString() + "\nIl veicolo di tipo: Automobile ha " + this.getNumPorte() + " porte.";
    }
    
    public String csv()
    {
        return "A;" + super.csv() + this.getNumPorte() + ";";
    }
}
