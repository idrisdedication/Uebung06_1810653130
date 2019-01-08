import javax.swing.*;
import java.util.Random;

public class Aufgabe3 {

    public static void main(String[] args) {

        Random zz = new Random();

        int[] array = new int[100];

        for(int i = 0; i<array.length;i++ )

            array[i]=zz.nextInt(100);

        while(true)
        {
            String stelle = JOptionPane.showInputDialog("Welche Stelle wollen Sie ändern?");

            if(isNumeric(stelle)){

                int zahl = Integer.parseInt(stelle);

                int bestaetige = JOptionPane.showConfirmDialog(null, "Der Wert lautet: "+array[zahl], "Wollen Sie den Wert ändern?", JOptionPane.YES_NO_OPTION);

                if (bestaetige == JOptionPane.YES_OPTION){

                    int neuerWert = Integer.parseInt(JOptionPane.showInputDialog("Wie soll der neue Wert lauten?"));

                    array[zahl] = neuerWert;

                    JOptionPane.showMessageDialog(null, "Der Wert wurde auf "+array[zahl]+" geändert!");
                }
            }
            else {
                break;
            }
        }
    }
    private static boolean isNumeric(String eingabe){
        try {
            int zahl = Integer.parseInt(eingabe);
        }
        catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}