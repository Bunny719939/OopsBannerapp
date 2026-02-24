public class lev1_3 {
public static void main(String[] args) {
// Distance in kilometers
double kilometers = 10.8;
// Conversion factor
double conversionFactor = 1.6;
// Convert kilometers to miles
double miles = kilometers / conversionFactor;
// Display the result
System.out.printf("The distance %.1f km in miles is %.2f%n",
kilometers, miles);
}
}