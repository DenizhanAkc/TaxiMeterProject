import java.util.Scanner;
public class taksimetre {
    public static void main (String[] args) {
            int km;
            double perKm = 2.20, total, startPrice = 10, minPrice = 20;

            Scanner input = new Scanner(System.in);
                    System.out.print("Km :");
            km = input.nextInt();

            total = startPrice + (perKm * km);
                    System.out.println("Toplam tutar : " +total);

            total = (total < 20) ? 20 : total;
                    System.out.println(total);












    }
}
