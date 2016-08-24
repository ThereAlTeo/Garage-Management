package prova;

import java.util.Calendar;

public class VeicoloMotore implements Pagamento, CSV
{
    protected Persona persona;
    protected int annoImmatricolazione;
    protected int cilindrata;
    protected String marca;
    protected String modello;
    protected Calendar dataEnter = Calendar.getInstance();
    protected Calendar dataExit = Calendar.getInstance();
    
    public static final double COSTO_AL_SECONDO = 0.001944444444444444444444444;
    
    public VeicoloMotore(String nome, String cognome, String luogoDiNascita, int giornoDiNascita, int meseDiNascita, int annoDiNascita, char sesso, int anni, int annoImmatricolazione, int cilindrata, String marca, String modello)
    {
        persona = new Persona(nome, cognome, luogoDiNascita, giornoDiNascita, meseDiNascita, annoDiNascita, sesso);
        this.annoImmatricolazione = annoImmatricolazione;
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
        this.dataEnter.set(dataEnter.get(Calendar.YEAR), dataEnter.get(Calendar.MONTH), dataEnter.get(Calendar.DAY_OF_MONTH), dataEnter.get(Calendar.HOUR), dataEnter.get(Calendar.MINUTE), dataEnter.get(Calendar.SECOND));
        this.dataExit = null;
    }
    
    public VeicoloMotore()
    {
        persona = new Persona();
        this.annoImmatricolazione = 0;
        this.cilindrata = 0;
        this.marca = "";
        this.modello = "";
        this.dataEnter.set(dataEnter.get(Calendar.YEAR), dataEnter.get(Calendar.MONTH), dataEnter.get(Calendar.DAY_OF_MONTH), dataEnter.get(Calendar.HOUR), dataEnter.get(Calendar.MINUTE), dataEnter.get(Calendar.SECOND));
        this.dataExit = null;
    }
    
    public VeicoloMotore(VeicoloMotore veicolo)
    {
        persona = new Persona(veicolo.persona);
        annoImmatricolazione = veicolo.getAnnoImmatricolazione();
        cilindrata = veicolo.getCilindrata();
        marca = veicolo.getMarca();
        modello = veicolo.getModello();
        this.dataEnter = veicolo.dataEnter;
    }
    
    public int getAnnoImmatricolazione() { return annoImmatricolazione; }
    
        public void setAnnoImmatricolazione(int annoImmatricolazione) { this.annoImmatricolazione = annoImmatricolazione; }
        
    public int getCilindrata() { return cilindrata; }
    
        public void setCilindrata(int cilindrata) { this.cilindrata = cilindrata; }
        
    public String getMarca() { return marca; }
    
        public void setMarca(String marca) { this.marca = marca; }
    
    public String getModello() { return modello; }
    
        public void setModello(String modello) { this.modello = modello; }
        
    private long secondiTotali()
    {
        this.dataExit.set(dataExit.get(Calendar.YEAR), dataExit.get(Calendar.MONTH), dataExit.get(Calendar.DAY_OF_MONTH), dataExit.get(Calendar.HOUR), dataExit.get(Calendar.MINUTE), dataExit.get(Calendar.SECOND));
        
        return (this.dataExit.getTimeInMillis() - this.dataEnter.getTimeInMillis());
    }
    
    public double costo()
    {
        String costo = Double.toString(COSTO_AL_SECONDO * this.secondiTotali());
        
        return Double.parseDouble(costo.substring(0, costo.indexOf(".") + 3));
        
        // A cosa serve tutto ciò? Non riuscivo a trovare un metodo valido per affettuare l'arrotondamento, quindi l'ho realizzato io !!
    }
    
    public String toString()
    {
        return this.persona.toString() + "\nHa parcheggiato il veicolo: " + this.getMarca() + " " + this.getModello() + ", immatricolato nel: " + this.getAnnoImmatricolazione() + "\n Cilindrata: " + this.getCilindrata()  ;
    }
    
    public String csv()
    {
        return this.persona.csv() + this.getMarca() + ";" + this.getModello() + ";" + this.getAnnoImmatricolazione() + ";" + this.getCilindrata() + ";";
    }
}
