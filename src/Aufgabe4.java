import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {

    public static void main(String[] args) {

        List<String> freunde = new ArrayList<String>() {

            @Override
            public String toString() {

                String string = "";

                for (String a : this) {

                    string += a + " ";
                }
                return string;
            }
        };
        for (int i=0; i<5; i++){

            freunde.add(JOptionPane.showInputDialog("Wie lauten die Namen deiner besten Freunde?"));
        }
        System.out.println(freunde);
    }
}