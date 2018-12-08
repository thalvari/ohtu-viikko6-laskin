package laskin;

public abstract class Komento {

    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button nollaa;
    protected Button undo;
    protected Sovelluslogiikka sovellus;
    protected int edellinenArvo = 0;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo,
                   Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    abstract void suorita();

    abstract void peru();

    protected void tarkastaTulos() {
        int laskunTulos = sovellus.tulos();
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        if (laskunTulos == 0) {
            nollaa.disableProperty().set(true);
        } else {
            nollaa.disableProperty().set(false);
        }
    }

    public void setEdellinenArvo(int arvo) {

    }

}
