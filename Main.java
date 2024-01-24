
import java.util.*;
import javax.swing.
public class Main {
    public static void main(String[] args) {
        Parastar parastar1 = new Parastar("P","Parastar1")
                int tekrar=0;

           while ( tekrar<=3){

                String id = JOptionPane.showInputDialog("Enter youe ID : ")
                String password = JOptionPane.showInputDialog("Enter your pass : ");
                if (id.equals(parastar1.getiD()) && parastar1.passwordCheck(password)) {
                    JOptionPane.showMessageDialog(null, "Welcome " + parastar1.getiD());
                    break;
                 }
                else
                    tekrar++;
                while (tekrar<3) {
                JOptionPane.showMessageDialog(null,"try again");
                break;
                }

                if (tekrar==3){
                    JOptionPane.showMessageDialog(null,"you do not have premission to access the application ");
                    break;
                }

            }

    }

}
