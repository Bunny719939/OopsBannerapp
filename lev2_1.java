public class lev2_1 {
public static void main(String[] args) {
// Cost price and selling price
int costPrice = 129;
int sellingPrice = 191;
// Calculate profit and profit percentage
int profit = sellingPrice - costPrice;
double profitPercentage = (profit / (double) costPrice) * 100;
// Display the result in a single print statement
System.out.printf("""
The Cost Price is INR %d and Selling Price is INR %d
The Profit is INR %d and the Profit Percentage is %.2f%%
""", costPrice, sellingPrice, profit, profitPercentage);

};
}