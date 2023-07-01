//FACADE
public class Translator {

    private English e = new English(); //creo variabili contenente istanze delle classi del sottosistema
    private Italian i = new Italian(); 

    public void addEnglish(String s) {
        if(e.test(s)){
            e.add(s);
            i.add(e.getIndex(s));
        }
    }

    public void multiPrinting() {
        System.out.print("Italiano");
        i.printText();
        System.out.print("Inglese");
        e.printText();
    }

}