public class Commesso {    //CREATOR

    public static IScarpe getScarpe (String tipo) {    // factory method

        IScarpe s = null;

        if(tipo.equals("ginnastica")) s=CommessoGinnastica.getScarpe();
        if(tipo.equals("tennis"))     s=CommessoTennis.getScarpe();
        if(tipo.equals("eleganti"))   s=CommessoEleganti.getScarpe();

        return s;

    }
}
