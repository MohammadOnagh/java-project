import java.util.*;
public class InfoBankBimar {
    private ArrayList<Paziresh> bimarList;

    public InfoBankBimar() {
        bimarList = new ArrayList<>();
        for (int i =0; i<5;i++){
            String dr;
            if (i%2==0) {
                dr = "Dr Asghariyan";
            }
            else{
                dr="Dr Sorayayi";
            }
            // Mariz haye tarif shode dar tarikh 4 bahman mah hastand
            bimarList.add(new Paziresh("Mariz"+i,"Marize Shomare "+i,"lName"+i,
                    dr,"4 Bahman 1402","Asetaminophen"));

        }
    }
}
