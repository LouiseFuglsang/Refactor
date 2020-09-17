public class VisNuværendeTid {
    public static void main(String[] args) {
        sekunderfrajanuar1970(); }

    public static void sekunderfrajanuar1970(){

        // Find det totale antal millisekunder siden midnat, 1. januar 1970
        long totalmillisekunder = System.currentTimeMillis();

        // Find det totale sekundantal siden midnat, 1. januar 1970
    long totalsekunder = totalmillisekunder / 1000;

    // Beregn de eksisterende sekunder i minutter i timen
    long eksisterendesekunder = totalsekunder % 60;

    // Find det totale minutantal
    long totalminutter = totalsekunder / 60;

    // Beregn de eksisterende minutter i timer
    long eksisterendeminutter = totalminutter % 60;

    // Find det totale timeantal
    long totaltimer = totalminutter / 60;

    // Beregn den eksisterende time
    long eksisterendetimer = totaltimer % 24;

    // Vis resultat
        System.out.println("Eksisterende tid er " + eksisterendetimer + ":"
            + eksisterendeminutter + ":" + eksisterendesekunder + " GMT");
}
}