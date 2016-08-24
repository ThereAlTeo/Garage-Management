package prova;

import javax.swing.JOptionPane;

public class Gestione
{
    private VeicoloMotore[] garage;
    
    public Gestione()
    {
        check();
    }
    
    private void check()
    {
        if(InputFile.isEsiste(Finestra.NOME_FILE) != true)
        {
            garage = new VeicoloMotore[numPosti()];
            
            instant();
        }
        else
        {
            garage = new VeicoloMotore[InputFile.readFileInt(Finestra.NOME_FILE)];
            
            instant();
            
            builtArray(InputFile.readFile(Finestra.NOME_FILE));
        }
    }
    
    private void instant()
    {
        for(int i = 0; i < garage.length; i++)
            garage[i] = null;
    }
    
    private int numPosti()
    {
        int ret = 0;
        boolean var = false;
        
        do
        {
            try
            {
                ret = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Inserisci il numero di posti all'interno del garage ", "Inizializzazione", JOptionPane.INFORMATION_MESSAGE, null, null, "50"));
                var = true;
            }
            catch(NumberFormatException exc)
            {
                JOptionPane.showMessageDialog(null, "E' obbligatorio inserire il numero di posti del garage per il corretto funzionamento del software.  ", " Errore 297 ", JOptionPane.WARNING_MESSAGE);
            }
            catch(Exception exc)
            {
                JOptionPane.showMessageDialog(null, "E' obbligatorio inserire il numero di posti del garage per il corretto funzionamento del software.  ", " Errore 297 ", JOptionPane.WARNING_MESSAGE);
            }
        }while(!var);
        
        return ret;
    }
    
    private void builtArray(String[] file)
    {
        for(int i = 1; i < file.length; i++)
        {
            switch(file[i].substring(0, 0))
            {
                case "A": builtAutomobile(file[i].substring(2)); break;
                case "F": builtFurgone(file[i].substring(2)); break;
                case "M": builtMoto(file[i].substring(2)); break;
            }
        }
    }
    
    private void builtAutomobile(String dati)
    {
        Automobile auto = new Automobile();
        
        upLoadAutomobile(auto, upLoadVeicoloMotore(auto, upLoadPersona(auto, dati)));
        
        addVeicolo(auto);
    }
    
    private String upLoadPersona(VeicoloMotore veicolo, String dati)
    {
        veicolo.persona.setNome(dati.substring(0, dati.indexOf(";")));
        
        String ret = dati.substring(dati.indexOf(";") + 1);
        
        veicolo.persona.setCognome(ret.substring(0, ret.indexOf(";")));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.persona.setLuogoDiNascita(ret.substring(0, ret.indexOf(";")));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.persona.setGiornoDiNascita(Integer.parseInt(ret.substring(0, ret.indexOf(";"))));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.persona.setMeseDiNascita(Integer.parseInt(ret.substring(0, ret.indexOf(";"))));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.persona.setAnnoDiNAscita(Integer.parseInt(ret.substring(0, ret.indexOf(";"))));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.persona.setSesso(ret.charAt(0));
        
        return ret.substring(ret.indexOf(";") + 1);
    }
    
    private String upLoadVeicoloMotore(VeicoloMotore veicolo, String dati)
    {
        veicolo.setMarca(dati.substring(0, dati.indexOf(";")));
        
        String ret = dati.substring(dati.indexOf(";") + 1);
        
        veicolo.setModello(ret.substring(0, ret.indexOf(";")));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.setAnnoImmatricolazione(Integer.parseInt(ret.substring(0, ret.indexOf(";"))));
        
        ret = ret.substring(ret.indexOf(";") + 1);
        
        veicolo.setCilindrata(Integer.parseInt(ret.substring(0, ret.indexOf(";"))));
        
        return ret.substring(ret.indexOf(";") + 1);
    }
    
    private void upLoadAutomobile(Automobile auto, String dati)
    {
        auto.setNumPorte(Integer.parseInt(dati.substring(0, dati.indexOf(";"))));
    }
    
    private void builtFurgone(String dati)
    {
        Furgone furgone = new Furgone();
        
        upLoadFurgone(furgone, upLoadVeicoloMotore(furgone, upLoadPersona(furgone, dati)));
        
        addVeicolo(furgone);
    }
    
    private void upLoadFurgone(Furgone furgone, String dati)
    {
        furgone.setCapacitaDiCarico(Float.parseFloat(dati.substring(0, dati.indexOf(";"))));
    }
    
    private void builtMoto(String dati)
    {
        Moto moto = new Moto();
        
        upLoadMoto(moto, upLoadVeicoloMotore(moto, upLoadPersona(moto, dati)));
        
        addVeicolo(moto);
    }
    
    private void upLoadMoto(Moto moto, String dati)
    {
        moto.setTipologia(dati.substring(0, dati.indexOf(";")));
        
        moto.setMarcie(Integer.parseInt(dati.substring(dati.indexOf(";")+1, dati.indexOf(";"))));
    }
    
    public boolean addVeicolo(VeicoloMotore veicolo)
    {
        boolean ret = false, esc = true;
        
        for(int i = 0; i < garage.length && esc; i++)
        {
            if(garage[i] == null){
                garage[i] = new VeicoloMotore(veicolo);
                ret = true;
                esc = false;
            }  
        }
        
        return ret;
    }
    
    public boolean addVeicolo(Furgone Furgone)
    {
        boolean ret = false, esc = true;
        
        for(int i = 0; i < garage.length && esc; i++)
        {
            if(garage[i] == null){
                garage[i] = new VeicoloMotore(Furgone);
                ret = true;
                esc = false;
            }  
        }
        
        return ret;
    }
    
    public boolean addVeicolo(Moto Moto)
    {
        boolean ret = false, esc = true;
        
        for(int i = 0; i < garage.length && esc; i++)
        {
            if(garage[i] == null){
                garage[i] = new VeicoloMotore(Moto);
                ret = true;
                esc = false;
            }  
        }
        
        return ret;
    }
    
    public boolean addVeicolo(Automobile Automobile)
    {
        boolean ret = false, esc = true;
        
        for(int i = 0; i < garage.length && esc; i++)
        {
            if(garage[i] == null){
                garage[i] = new VeicoloMotore(Automobile);
                ret = true;
                esc = false;
            }  
        }
        
        return ret;
    }
    
    public boolean killVeicolo(int pos)
    {
        if(pos < 0 || pos >= garage.length)
            return false;
        else
        {
            if(garage[pos] == null)
                return false;
            else
            {
                garage[pos] = null;
                return true;
            }
        }
    }
    
    public int getNumGarage()
    {
        return garage.length;
    }
    
    public VeicoloMotore getGarage(int pos)
    {
        return garage[pos];
    }
    
    public String myCasting(int pos, boolean info)
    {
        if(!info)
        {
            if(this.garage[pos] instanceof Automobile){
                return ((Automobile) this.garage[pos]).toString();
            }
            else if(this.garage[pos] instanceof Furgone){
                return ((Furgone) this.garage[pos]).toString();
            }
            else if(this.garage[pos] instanceof Moto){
                return ((Moto) this.garage[pos]).toString();
            }
            else 
                return this.garage[pos].toString();
        }
        else
        {
            if(this.garage[pos] instanceof Automobile){
                return ((Automobile) this.garage[pos]).csv();
            }
            else if(this.garage[pos] instanceof Furgone){
                return ((Furgone) this.garage[pos]).csv();
            }
            else if(this.garage[pos] instanceof Moto){
                return ((Moto) this.garage[pos]).csv();
            }
            else 
                return this.garage[pos].csv();
        }
    }
    
    public double pagamento(int pos)
    {
        return this.garage[pos].costo();
    }
    
    public String[] writeGlobalInfo()
    {
        String[] ret = new String[garage.length];
        
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = myCasting(i, true);
        }
        
        return ret;
    }
}
