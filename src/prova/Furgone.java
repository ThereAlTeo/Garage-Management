package prova;

public class Furgone extends VeicoloMotore
{
    protected float capacitaDiCarico;
    
    public Furgone(String nome, String cognome, String luogoDiNascita, int giornoDiNascita, int meseDiNascita, int annoDiNascita, char sesso, int anni, int annoImmatricolazione, int cilindrata, String marca, String modello, float capacitaDiCarico)
    {
        super(nome, cognome, luogoDiNascita, giornoDiNascita, meseDiNascita, annoDiNascita, sesso, anni, annoImmatricolazione, cilindrata, marca, modello);
        this.capacitaDiCarico = capacitaDiCarico;
    }
    
    public Furgone()
    {
        super();
        this.capacitaDiCarico = 0;
    }
    
    public float getCapacitaDiCarico() { return capacitaDiCarico; }
    
        public void setCapacitaDiCarico(float capacitaDiCarico) { this.capacitaDiCarico = capacitaDiCarico; }
        
    public String toString()
    {
        return super.toString() + "\nIlveicolo di tipo: Furgone ha la seguente capacità di carico: " + this.getCapacitaDiCarico();
    }
    
    public String csv()
    {
        return "F;" + super.csv() + this.getCapacitaDiCarico() + ";";
    }
}
