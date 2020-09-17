import java.util.Scanner;

public class BeregnLaan {
    public static void main(String[] args) {
    danskberegnlaan();
    }
    public static void danskberegnlaan(){
    // Skab en scanner
    Scanner input = new Scanner(System.in);

    // Indtast årlig rentesats
        System.out.print("Indtast årlig rentesats, f.eks. 8,25: ");
    double aarligRentesats = input.nextDouble();

    // Få fat i den månedlige rentesats
    double maanedligRentesats = aarligRentesats / 1200;

    // Indtast antal år
        System.out.print(
                "Indtast antal år uden decimaler, f.eks. 5: ");
    int antalAar = input.nextInt();

    // Indtast lånebeløb
        System.out.print("Indtast lånebeløb, f.eks., f.eks. 120000,95: ");
    double laanebeloeb = input.nextDouble();

    // Beregn afbetaling
    double maanedligafbetaling = laanebeloeb * maanedligRentesats / (1
            - 1 / Math.pow(1 + maanedligRentesats, antalAar * 12));
    double totalafbetaling = maanedligafbetaling * antalAar * 12;

    // Vis resultat
        System.out.println("Den månedlige afbetaling er i kr"+
                (int)(maanedligafbetaling *100)/100.0);
        System.out.println("Den totale afbetaling er i kr"+
                (int)(totalafbetaling *100)/100.0);
}

}