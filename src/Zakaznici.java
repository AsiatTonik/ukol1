import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zakaznici {

    private List<Zakaznik> zakaznici = new ArrayList<>();
        public void nactiZeSouboru(String nazevSouboru, String oddelovac ) throws ZakazniciException{
            int cisloRadku = 1;
            String[] polozky = new String[2];

            try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(nazevSouboru))))
            {
                while (scanner.hasNextLine()){
                    radek = scanner.nextLine();
                    polozky = radek.split(oddelovac);
                    String jmeno = polozky[0].trim();
                    int pocetProdeju = Integer.parseInt(polozky[1].trim());


                }

            }
            public void zapisDoSouboru(String nazevSouboru, String oddelovac)
            throws ZakazniciException {
                try (PrintWriter writer =
                             new PrintWriter(
                                     new BufferedWriter(
                                             new FileWriter(
                                                     nazevSouboru)))) {

                    String radek;
                    for (Zakaznik zakaznik : zakaznici) {
                        radek = zakaznik.getJmeno() + oddelovac
                                + zakaznik.getPocetProdeju() + oddelovac

                        writer.println(radek);

                    }
                } catch (IOException e) {
                    throw new ZakazniciException(
                            "Chyba!: "
                                    +e.getMessage());
                }
            }

            public List<Zakaznik> getList() {
                return new ArrayList<>(zakaznici);
            }

            public void pridej(Zakaznik novyZakaznik) {
                zakaznici.add(novyZakaznik);
            }

            public void odeber(int index) {
                zakaznici.remove(index);
            }
        }

        }
}


