import java.util.Scanner;

public class HowFarAway
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double startLat;
        double startLong;
        double endLat;
        double endLong;
        // your code here.
        System.out.print("Enter the latitude of the starting location: ");
        startLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        startLong = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        endLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        endLong = in.nextDouble();
        
        GeoLocation geoStart = new GeoLocation(startLat,startLong);
        
        GeoLocation geoEnd = new GeoLocation(endLat, endLong);

        System.out.print("The distance is " + geoStart.distanceFrom(geoEnd) + " miles.");
    }
}