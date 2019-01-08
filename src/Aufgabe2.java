import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {

    public static void main(String[] args) {

        int length = Integer.parseInt(JOptionPane.showInputDialog("Länge des Arrays"));

        int[] array = new int[length];

        Random zz = new Random();

        for (int i = 0; i<length; i++)

            array[i]= zz.nextInt(1000);

        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]+" ");
        }
    }
}