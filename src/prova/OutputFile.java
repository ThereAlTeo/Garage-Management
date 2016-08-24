package prova;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

//import java.io.*;
public class OutputFile
{
    private static final String ERRORE_STREAM = "\tATTENZIONE !!!\n ERRORE 290: Il file desiderato non è collocato nella corretta posizione.";
    private static final String ERRORE_GENERICO = "\tATTENZIONE !!!\n ERRORE 270: Durante l'esecuzione si è verificato un errore.";
    
    private static void myERR_STR() { JOptionPane.showMessageDialog(null, ERRORE_STREAM, null, JOptionPane.INFORMATION_MESSAGE); }
    
    private static void myERR_GEN() { JOptionPane.showMessageDialog(null, ERRORE_GENERICO, null, JOptionPane.INFORMATION_MESSAGE); }
    
    public static void writeFileString(String nome, String testo, boolean scrivere)
    {
        try
        {
            BufferedWriter fileOUT = new BufferedWriter(new FileWriter(nome, scrivere));
            
            fileOUT.write(testo);
            fileOUT.newLine();
            fileOUT.close();
        }
        catch(FileNotFoundException exc){ myERR_STR();
        }
        catch(IOException exc){ myERR_GEN();
        }
    }
    
    public static void writeFileString(String nome, String testo)
    {
        try
        {
            BufferedWriter fileOUT = new BufferedWriter(new FileWriter(nome));
            
            fileOUT.write(testo);
            fileOUT.newLine();
            fileOUT.close();
        }
        catch(FileNotFoundException exc){ myERR_STR();
        }
        catch(IOException exc){ myERR_GEN();
        }
    }
    
    public static void writeFileString(String nome, String[] testo)
    {
        try
        {
            BufferedWriter fileOUT = new BufferedWriter(new FileWriter(nome));
            
            fileOUT.write(Finestra.gestione.getNumGarage());
            
            for(int i = 0; i < testo.length; i++)
            {
                fileOUT.write(testo[i]);
                fileOUT.newLine();
            }
            
            fileOUT.close();
        }
        catch(FileNotFoundException exc){ myERR_STR();
        }
        catch(IOException exc){ myERR_GEN();
        }
    }
}
