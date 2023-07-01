public class Traduttore {
    Italiano ita = new Italiano();
    Francese fra = new Francese();
    Inglese ing = new Inglese();

    public void selezionaItaliano() {
        ita.traduttoreItaliano();
    }

    public void selezionaInglese() {
        ing.traduttoreInglese();
    }

    public void selezionaFrancese() {
        fra.traduttoreFrancese();
    }
}