package atiatulmaula.smsapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author atiatulmaula.wordpress.com
 */
public class Gammu {
    public static void eksekusi(String message){
        Runtime run = Runtime.getRuntime();
        Process pr = null;
        try {
            pr = run.exec(message);
            pr.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        try {
            while ((line = buf.readLine()) != null) {                
                System.out.println("Line : "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
