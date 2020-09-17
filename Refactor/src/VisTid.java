import java.util.Scanner;

public class VisTid
{
    public static void main(String[] args)
    {
    dansktid();
    }
    public static void dansktid()
    {

    Scanner input = new Scanner(System.in);
// Bed brugeren om input
        System.out.print("Skriv en integer i sekunder: ");
                int sekunder = input.nextInt();

                int minutter = sekunder / 60; // Find minutter in sekunder
                int resterendeminutter = sekunder % 60; // Seconds remaining
                System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendeminutter + " sekunder");
}
}