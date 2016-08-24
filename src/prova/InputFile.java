package prova;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

//import java.io.*;
public class InputFile
{
    private static final String ERRORE_STREAM = "\tATTENZIONE !!!\n ERRORE 290: Il file desiderato non è collocato nella corretta posizione.";
    private static final String ERRORE_GENERICO = "\tATTENZIONE !!!\n ERRORE 270: Durante l'esecuzione si è verificato un errore.";    
    
    private static void myERR_STR() { JOptionPane.showMessageDialog(null, ERRORE_STREAM, null, JOptionPane.INFORMATION_MESSAGE); }
    
    private static void myERR_GEN() { JOptionPane.showMessageDialog(null, ERRORE_GENERICO, null, JOptionPane.INFORMATION_MESSAGE); }
    
    public static int valFile(String nome)
    {
        int ret = 0;
        try
        {
            BufferedReader fileIN = new BufferedReader(new FileReader(nome));
            
            while(fileIN.readLine() != null) ret++;
            fileIN.close();
        }
        catch(FileNotFoundException exc){ myERR_STR();
        }
        catch(IOException exc){ myERR_GEN();
        }
        
        return ret;
    }
    
    public static String[] readFile(String nome)
    {
        String ret[] = new String[InputFile.valFile(nome)];
        
        try
        {
            BufferedReader fileIN = new BufferedReader(new FileReader(nome));
                     
            for(int i = 0; i < ret.length; i++)
                ret[i] = fileIN.readLine();
            
            fileIN.close();   
        }
        catch(FileNotFoundException exc){ myERR_STR();
        }
        catch(IOException exc){ myERR_GEN();
        }
        
        return ret;
    }
    
    public static int[] readFileIntArray(String nome)
    {
        String[] had = readFile(nome);
        int[] ret = new int[had.length];
        
        try
        {
            for(int i = 0; i < had.length; i++)
                ret[i] = Integer.parseInt(had[i]);
        }
        catch(NumberFormatException exc){
            System.out.println("\tATTENZIONE !!!\n ERRORE 280: Il formato richiesto non corrisponde a quello inserito.");
        }
        catch(Exception exc){
            System.out.println("\tATTENZIONE !!!\n ERRORE 270: Durante l'esecuzione si è verificato un errore.");
        }
        
        return ret;
    }
    
    
    public static int readFileInt(String nome)
    {
        int ret = 0;
        
        try
        {
            BufferedReader fileIN = new BufferedReader(new FileReader(nome));
            
            ret = Integer.parseInt(fileIN.readLine());
            
        }
        catch(NumberFormatException exc){
            System.out.println("\tATTENZIONE !!!\n ERRORE 280: Il formato richiesto non corrisponde a quello inserito.");
        }
        catch(Exception exc){
            System.out.println("\tATTENZIONE !!!\n ERRORE 270: Durante l'esecuzione si è verificato un errore.");
        }
        
        return ret;
    }
    
    public static boolean isEsiste(String nome)
    {
        boolean ret = false;
        
        try
        {
            BufferedReader fileIN = new BufferedReader(new FileReader(nome));
            
            if(fileIN.readLine() != null) ret = true;
            
        }
        catch(NumberFormatException exc){
            ret = false;
        }
        catch(Exception exc){
            ret = false;
        }
        
        return ret;
    }
}
