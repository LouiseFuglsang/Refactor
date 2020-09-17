import java.util.Scanner;

public class BeregnByttepenge {

    public static void main(String[] args) {
     danskebyttepenge();
      }

    public static void danskebyttepenge() {

        // Skab en scanner
    Scanner input = new Scanner(System.in);

    // Modtag beløbet
        System.out.print(
                "Indtast et beløb i decimaltal, f.eks. 11,56: ");
    double beloeb = input.nextDouble();

    int tilbagevaerendebeloeb = (int)(beloeb * 100);

    // Find antallet af kroner
    int antalKroner = tilbagevaerendebeloeb / 100;
    tilbagevaerendebeloeb = tilbagevaerendebeloeb % 100;

    // Find antallet af ører i det tilbageværende beløb
    int antalOerer = tilbagevaerendebeloeb;

    // Display results
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalKroner + " kroner");
        System.out.println("    " + antalOerer + " ører");
}
}
