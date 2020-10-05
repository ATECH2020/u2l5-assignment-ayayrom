import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      final int windowCost = 11;
      final int boardCost = 8;
      int windows, boards;
      double taxRate, total, grandTotal;
      System.out.println("Enter the tax rate");
      taxRate = in.nextDouble();
      System.out.println("Enter the amount of boards");
      boards = in.nextInt();
      System.out.println("Enter the amount of windows");
      windows = in.nextInt();

      total = (windows*windowCost) + (boards*boardCost);
      System.out.println("Your total: ");
      System.out.println(total);

      grandTotal = total * (1 + taxRate);
      System.out.println("Your grand total:");
      System.out.print(grandTotal);
    }
}
