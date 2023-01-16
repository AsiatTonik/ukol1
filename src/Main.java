
public class Main {
    private static final String NAZEV_SOUBORU = "soubor.txt";
    private static final String ODDELOVAC = ":";
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
        Zakaznici zakaznici = new Zakaznici();

        try {
        zakaznici.nactiZeSouboru(NAZEV_SOUBORU, ODDELOVAC);
    } catch (ZakazniciException e) {
        System.err.println("Chyba"
                +e.getLocalizedMessage());
    }
        int poradi = 1;
        for (Zakaznik zakaznik : zakaznici.getList()) {
            System.out.println(
                    poradi + ") " + zakaznik.getJmeno() + ": " + zakaznik.getPocetProdeju()
            );
            poradi++;

    }
}