package prova;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AscoltatoreBottoni implements ActionListener
{
    private static final int ANNO_BISESTILE = 2012;
    
    private JTextField fieldNome;
    private JTextField fieldCognome;
    private JTextField fieldCitta;
    private JComboBox comboAnno;
    private JComboBox comboMese;
    private JComboBox comboGiorno;
    private JComboBox comboSesso;
    private JComboBox comboAnnoImmatricolazione;
    private JComboBox comboCilindrata;
    private JTextField fieldMarca;
    private JTextField fieldModello;
    private JComboBox comboNumeroPorte;
    private JTextField fieldCapCarico;
    private JTextField fieldTipologia;
    private JComboBox comboMarcie;
    private JTextField fieldInfoKill;
    private JTextField fieldInfoPrint;
    
    // costruttore AutoMobile
    public AscoltatoreBottoni(JTextField fieldNome, JTextField fieldCognome, JTextField fieldCitta, JComboBox comboAnno, JComboBox comboMese, JComboBox comboGiorno, JComboBox comboSesso, JComboBox comboAnnoImmatricolazione, JComboBox comboCilindrata, JTextField fieldMarca, JTextField fieldModello, JComboBox comboNumeroPorte)
    {
        this.fieldNome = fieldNome;
        this.fieldCognome = fieldCognome;
        this.fieldCitta = fieldCitta;
        this.comboGiorno = comboGiorno;
        this.comboMese = comboMese;
        this.comboAnno = comboAnno;
        this.comboSesso = comboSesso;
        this.comboAnnoImmatricolazione = comboAnnoImmatricolazione;
        this.comboCilindrata = comboCilindrata;
        this.fieldMarca = fieldMarca;
        this.fieldModello = fieldModello;
        this.comboNumeroPorte = comboNumeroPorte;
    }
    
    // costruttore Furgone
    public AscoltatoreBottoni(JTextField fieldNome, JTextField fieldCognome, JTextField fieldCitta, JComboBox comboAnno, JComboBox comboMese, JComboBox comboGiorno, JComboBox comboSesso, JComboBox comboAnnoImmatricolazione, JComboBox comboCilindrata, JTextField fieldMarca, JTextField fieldModello, JTextField fieldCapCarico)
    {
        this.fieldNome = fieldNome;
        this.fieldCognome = fieldCognome;
        this.fieldCitta = fieldCitta;
        this.comboGiorno = comboGiorno;
        this.comboMese = comboMese;
        this.comboAnno = comboAnno;
        this.comboSesso = comboSesso;
        this.comboAnnoImmatricolazione = comboAnnoImmatricolazione;
        this.comboCilindrata = comboCilindrata;
        this.fieldMarca = fieldMarca;
        this.fieldModello = fieldModello;
        this.fieldCapCarico = fieldCapCarico;
    }
    
    // costruttore Moto
    public AscoltatoreBottoni(JTextField fieldNome, JTextField fieldCognome, JTextField fieldCitta, JComboBox comboAnno, JComboBox comboMese, JComboBox comboGiorno, JComboBox comboSesso, JComboBox comboAnnoImmatricolazione, JComboBox comboCilindrata, JTextField fieldMarca, JTextField fieldModello, JTextField fieldTipologia, JComboBox comboMarcie)
    {
        this.fieldNome = fieldNome;
        this.fieldCognome = fieldCognome;
        this.fieldCitta = fieldCitta;
        this.comboGiorno = comboGiorno;
        this.comboMese = comboMese;
        this.comboAnno = comboAnno;
        this.comboSesso = comboSesso;
        this.comboAnnoImmatricolazione = comboAnnoImmatricolazione;
        this.comboCilindrata = comboCilindrata;
        this.fieldMarca = fieldMarca;
        this.fieldModello = fieldModello;
        this.fieldTipologia = fieldTipologia;
        this.comboMarcie = comboMarcie;
    }
    
    // costruttore per Libeare e Informare 
    public AscoltatoreBottoni(JTextField field)
    {
        this.fieldInfoKill = field;
        this.fieldInfoPrint = field; 
    }
    
    private void insertAutomobile()
    {
        Automobile auto = new Automobile();
            
        if(isAutomobile(auto) == true)
        {
            if(Finestra.gestione.addVeicolo(auto) == true){
                JOptionInformation(" Inserimento avenuto con successo ", " Information ");
            }
            else
                JOptionError("Inserimento fallito: I posti sono tutti occupati", " Errore 789");
        }
        else            
            JOptionError("Inserimento fallito: Valori non consoni. ", " Errore 509 ");                
    }
    
    private boolean isAutomobile(Automobile auto)
    {
        return correzionePersona(auto) && correzioneVeicoloMotore(auto) && correzioneAutomobile(auto);
    }
    
    private int retMese(String mese)
    {
        switch(mese)
        {
            case "Gennaio": return 1;
            case "Febbraio": return 2;
            case "Marzo": return 3;
            case "Aprile": return 4;
            case "Maggio": return 5;
            case "Giugno": return 6;
            case "Luglio": return 7;
            case "Agosto": return 8;
            case "Settembre": return 9;
            case "Ottobre": return 10;
            case "Novembre": return 11;
            default: return 12;
        }
    }
    
    private boolean correzionePersona(VeicoloMotore veicolo)
    {        
        // controllo fieldNome
        if(this.fieldNome.getText().equals("")){
            fieldNome.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldNome.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            veicolo.persona.setNome(fieldNome.getText());
        }
        
        // controllo fieldCognome
        if(this.fieldCognome.getText().equals("")){
            fieldCognome.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldCognome.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            veicolo.persona.setCognome(fieldCognome.getText());
        }
        
        // controllo città
        if(this.fieldCitta.getText().equals("")){
            fieldCitta.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldCitta.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            veicolo.persona.setLuogoDiNascita(fieldCitta.getText());
        }
        
        //controllo data di nascita da migliorare molto ... troppo codice :(
        try
        {
            veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
            veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
            veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
            
            if((Integer.parseInt(this.comboAnno.getSelectedItem().toString()) - ANNO_BISESTILE)%4 == 0)
            {
                if(this.comboMese.getSelectedItem().toString().equals("Febbraio"))
                {
                    if(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()) <= 29)
                    {
                        veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                        veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                        veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                        this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        return true;
                    }
                    else
                    {
                        this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.RED));
                        return false;
                    }
                }
                else
                {
                    switch(this.comboMese.getSelectedItem().toString())
                    {
                        case "Gannaio":
                        case "Marzo":
                        case "Maggio":
                        case "Luglio":
                        case "Agosto":
                        case "Ottobre":
                        case "Dicembre":
                        {
                            veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                            veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                            veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                            this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            return true;
                        }
                        case "Aprile":
                        case "Giugno":
                        case "Settembre":
                        case "Novembre":
                        {
                            if(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()) <= 30)
                            {
                                veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                                veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                                veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                                this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                return true;
                            }
                            else
                            {
                                this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.RED));
                                return false;
                            }
                        }
                    }
                }
            }
            else
            {
                if(this.comboMese.getSelectedItem().toString().equals("Febbraio"))
                {
                    if(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()) <= 28)
                    {
                        veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                        veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                        veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                        this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        return true;
                    }
                    else
                    {
                        this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.RED));
                        return false;
                    }
                }
                else
                {
                    switch(this.comboMese.getSelectedItem().toString())
                    {
                        case "Gannaio":
                        case "Marzo":
                        case "Maggio":
                        case "Luglio":
                        case "Agosto":
                        case "Ottobre":
                        case "Dicembre":
                        {
                            veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                            veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                            veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                            this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                            return true;
                        }
                        case "Aprile":
                        case "Giugno":
                        case "Settembre":
                        case "Novembre":
                        {
                            if(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()) <= 30)
                            {
                                veicolo.persona.setAnnoDiNAscita(Integer.parseInt(this.comboAnno.getSelectedItem().toString()));
                                veicolo.persona.setMeseDiNascita(retMese(this.comboMese.getSelectedItem().toString()));
                                veicolo.persona.setGiornoDiNascita(Integer.parseInt(this.comboGiorno.getSelectedItem().toString()));
                                this.comboAnno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                this.comboMese.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                                return true;
                            }
                            else
                            {
                                this.comboGiorno.setBorder(BorderFactory.createLineBorder(Color.RED));
                                return false;
                            }
                        }
                    }
                }
            }
        }
        catch(NumberFormatException exc){
            exc.getMessage();
            exc.getStackTrace();
            exc.toString();
        }
        catch(Exception exc){
            exc.getMessage();
            exc.getStackTrace();
            exc.toString();
        }
        
        // inserimento del sesso
        veicolo.persona.setSesso(this.comboSesso.getSelectedItem().toString().charAt(0));
                
        return true;
    }
    
    private boolean correzioneVeicoloMotore(VeicoloMotore veicolo)
    {
        // inserimento annoImmatricolazione
        veicolo.setAnnoImmatricolazione(Integer.parseInt(this.comboAnnoImmatricolazione.getSelectedItem().toString()));
        
        // inserimento cilindrata
        veicolo.setCilindrata(Integer.parseInt(this.comboCilindrata.getSelectedItem().toString()));
        
        // controllo fieldMarca
        if(this.fieldMarca.getText().equals("")){
            fieldMarca.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldMarca.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            veicolo.setMarca(fieldMarca.getText());
        }
        
        // controllo fieldModello
        if(this.fieldModello.getText().equals("")){
            fieldModello.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldModello.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            veicolo.setModello(fieldModello.getText());
        }
        
        return true;
    }
    
    private boolean correzioneAutomobile(Automobile auto)
    {
        // inserimento numeroPorte
        auto.setNumPorte(Integer.parseInt(this.comboNumeroPorte.getSelectedItem().toString()));
        
        return true;
    }
    
    private void insertFurgone()
    {
        Furgone furgone = new Furgone();
        
        if(isFurgone(furgone) == true)
        {            
            if(Finestra.gestione.addVeicolo(furgone) == true)
                JOptionInformation(" Inserimento avenuto con successo ", " Information ");
            else
                JOptionError("Inserimento fallito: I posti sono tutti occupati", " Errore 789");
        }
        else            
            JOptionError("Inserimento fallito: Valori non consoni. ", " Errore 509 ");                
    }    
    
    private boolean correzioneFurgone(Furgone furgone)
    {
        // controllo fieldCapCarico
        if(this.fieldCapCarico.getText().equals("") || !isFieldCapCarico(this.fieldCapCarico.getText())){
            fieldCapCarico.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldCapCarico.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            furgone.setCapacitaDiCarico(Float.parseFloat(fieldCapCarico.getText()));
        }
        
        return true;
    }
    
    private boolean isFieldCapCarico(String field)
    {
        boolean ret = false;
        
        try
        {
            Float.parseFloat(field);
            ret = true;
        }
        catch(NumberFormatException exc) { ret = false;}
        catch(Exception exc) { ret = false;}
        
        return ret;
    }
    
    private boolean isFurgone(Furgone furgone)
    {
        return correzionePersona(furgone) && correzioneVeicoloMotore(furgone) && correzioneFurgone(furgone);
    } 
    
    private void insertMoto()
    {
        Moto moto = new Moto();
        
        if(isMoto(moto) == true){            
            if(Finestra.gestione.addVeicolo(moto) == true)
                JOptionInformation(" Inserimento avenuto con successo ", " Information ");
            else
                JOptionError("Inserimento fallito: I posti sono tutti occupati", " Errore 789");
        }
        else            
            JOptionError("Inserimento fallito: Valori non consoni. ", " Errore 509 ");
    }
    
    private boolean correzioneMoto(Moto moto)
    {
        // controllo fieldTipologia
        if(this.fieldTipologia.getText().equals("")){
            fieldTipologia.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        else{
            fieldTipologia.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            moto.setTipologia(fieldTipologia.getText());
        }
        
        // inserimento marcie
        moto.setMarcie(Integer.parseInt(this.comboMarcie.getSelectedItem().toString()));
        
        return true;
    }
    
    private boolean isMoto(Moto moto)
    {
        return correzionePersona(moto) && correzioneVeicoloMotore(moto) && correzioneMoto(moto);
    }
    
    private int JOptionAutentificazionePosto(String contenuto, String titolo)
    {
        return JOptionPane.showConfirmDialog(null, contenuto, titolo, JOptionPane.YES_NO_OPTION);
    }
    
    private void JOptionPagamento(double contenuto, String titolo)
    {
        JOptionPane.showMessageDialog(null, "Il cliente deve pagare " + contenuto + " euro. ", titolo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void JOptionWarning(String contenuto, String titolo)
    {
        JOptionPane.showMessageDialog(null, contenuto, titolo, JOptionPane.WARNING_MESSAGE);
    }
    
    private void JOptionInformation(String contenuto, String titolo)
    {
        JOptionPane.showMessageDialog(null, contenuto, titolo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void JOptionError(String contenuto, String titolo)
    {
        JOptionPane.showMessageDialog(null, contenuto, titolo, JOptionPane.ERROR_MESSAGE);
    }
    
    private void pagamento(int pos)
    {
        JOptionPagamento(Finestra.gestione.pagamento(pos), " Pagamento ");
        Finestra.gestione.killVeicolo(pos);
    }
            
    private void killPlace()
    {
        if(returnPosKill() == true)
        { 
            int pos = Integer.parseInt(this.fieldInfoKill.getText());
            
            if((pos >= Finestra.gestione.getNumGarage()) || (pos < 0))
                JOptionWarning("Il valore inserito è inferiore o superirore al Range di riferimento. ", " Errore 135 ");
            else
            {
                if(Finestra.gestione.getGarage(pos) == null)
                    JOptionWarning("Il posto inserito non risulta essere occupato da Veicoli. ", " Errore 129 ");
                else
                {
                    if(JOptionAutentificazionePosto(Finestra.gestione.myCasting(pos, false), " Il cliente da eliminare è il seguente ?? ") == JOptionPane.YES_OPTION)
                    {
                        pagamento(pos);
                    }    
                }
            }
        }
    }
    
    private boolean returnPosKill()
    {
        try
        {
            Integer.parseInt(this.fieldInfoKill.getText()); 
        }
        catch(NumberFormatException exc)
        {
            fieldInfoKill.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        catch(Exception exc)
        {
            fieldInfoKill.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        
        return true;
    }
    
    private void printInformazioni()
    {
        int deb = returnPosPrint();
        
        if(deb != -1)
        {
            if((deb >= Finestra.gestione.getNumGarage()) || (deb < 0))
                JOptionWarning("Il valore inserito è inferiore o superirore al Range di riferimento. ", " Errore 135 ");
            else
            {
                if(Finestra.gestione.getGarage(deb) == null)
                    JOptionWarning("Il posto inserito non risulta essere occupato da Veicoli. ", " Errore 129 ");
                else
                {
                    JOptionInformation(Finestra.gestione.myCasting(deb, false), " Stampa dell'informazione ");
                }
            }
        }
        else
            JOptionWarning("Formato non riconosciuto ", " Errore 447 ");
    }
    
    private int returnPosPrint()
    {
        try
        {
            int i = Integer.parseInt(this.fieldInfoPrint.getText());
            return i;
        }
        catch(NumberFormatException exc)
        {
            fieldInfoPrint.setBorder(BorderFactory.createLineBorder(Color.RED));
            return -1;
        }
        catch(Exception exc)
        {
            fieldInfoPrint.setBorder(BorderFactory.createLineBorder(Color.RED));
            return -1;
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "Inserisci Automobile":
                insertAutomobile(); 
                break;
            case "Inserisci Furgone":
                insertFurgone();
                break;
            case "Inserisci Moto":
                insertMoto();
                break;
            case "Libera posto":
                killPlace();
                break;
            case "Stampa informazioni":
                printInformazioni();
                break;
        }
    }
}
