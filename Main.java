import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ahmet Yılmaz", "Kızılay", "Çankaya", 8.5, 20, 15.0));
        rides.add(new EconomyRide("Ayşe Demir", "Kadıköy", "Beşiktaş", 12.0, 35, 12.0, 2.5));
        rides.add(new PremiumRide("Mehmet Kaya", "Havalimanı", "Levent", 35.0, 45, 25.0, 150.0, 1.5));
        rides.add(new SharedRide("Fatma Şahin", "Alsancak", "Bornova", 10.0, 25, 12.0, 2.0, 3));

        System.out.println("--- SÜRÜŞ BİLGİLERİ VE ÜCRETLER ---\n");
        for (Ride ride : rides) {
            System.out.println(ride.toString());
            System.out.printf("Calculated Fare: %.2f TL\n", ride.calculateFare());
            System.out.println("--------------------------------------------------");
        }
    }
}