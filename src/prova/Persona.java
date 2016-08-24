package prova;

public class Persona
{
    private String nome;
    private String cognome;
    private String luogoDiNascita;
    private int giornoDiNascita;
    private int meseDiNascita;
    private int annoDiNascita;
    private char sesso;
    
    public Persona(String nome, String cognome, String luogoDiNascita, int giornoDiNascita, int meseDiNascita, int annoDiNascita, char sesso)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.luogoDiNascita = luogoDiNascita;
        this.giornoDiNascita = giornoDiNascita;
        this.meseDiNascita = meseDiNascita;
        this.annoDiNascita = annoDiNascita;
        this.sesso = sesso;
    }
    
    public Persona()
    {
        this.nome = "";
        this.cognome = "";
        this.luogoDiNascita = "";
        this.giornoDiNascita = 0;
        this.meseDiNascita = 0;
        this.annoDiNascita = 0;
        this.sesso = ' ';
    }
    
    public Persona(Persona persona)
    {
        nome = persona.getNome();
        cognome = persona.getCognome();
        luogoDiNascita = persona.getLuogoDiNascita();
        giornoDiNascita = persona.getGiornoDiNascita();
        meseDiNascita = persona.getMeseDiNascita();
        annoDiNascita = persona.getAnnoDiNascita();
        sesso = persona.getSesso();
    }
    
    public String getNome() { return nome; }
    
        public void setNome(String nome) { this.nome = nome; }
        
    public String getCognome() { return cognome; }
    
        public void setCognome(String cognome) { this.cognome = cognome; }
        
    public String getLuogoDiNascita() { return luogoDiNascita; }
    
        public void setLuogoDiNascita(String luogoDiNascita) { this.luogoDiNascita = luogoDiNascita; }
        
    public int getGiornoDiNascita() { return giornoDiNascita; }
    
        public void setGiornoDiNascita(int giornoDiNascita) { this.giornoDiNascita = giornoDiNascita; }
        
    public int getMeseDiNascita() { return meseDiNascita; }
    
        public void setMeseDiNascita(int meseDiNascita) { this.meseDiNascita = meseDiNascita; }
        
    public int getAnnoDiNascita() { return annoDiNascita; }
    
        public void setAnnoDiNAscita(int annoDiNascita) { this.annoDiNascita = annoDiNascita; }
        
    public char getSesso() { return sesso; }    
    
        public void setSesso(char sesso) { this.sesso = sesso; }
        
    public String toString()
    {
        return "Nome: " + getNome() + "\tCognome: " + getCognome() + "\nNato a: " + getLuogoDiNascita() + " il " + getGiornoDiNascita() + "/" + getMeseDiNascita() + "/" + getAnnoDiNascita() + "Sesso: " + getSesso();
    }
    
    public String csv()
    {
        return getNome() + ";" + getCognome() + ";" + getLuogoDiNascita() + ";" + getGiornoDiNascita() + ";" + getMeseDiNascita() + ";" + getAnnoDiNascita() + ";" + getSesso() + ";";
    }
}
