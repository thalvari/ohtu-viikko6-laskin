package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        edellinenArvo = arvo;
        sovellus.plus(arvo);
        tarkastaTulos();
        undo.disableProperty().set(false);
    }

    @Override
    public void peru() {
        sovellus.miinus(edellinenArvo);
        tarkastaTulos();
        edellinenArvo = 0;
        undo.disableProperty().set(true);
    }

}
