public class CafeReceipt
{
   public static <strings> void main(String[] args)
   {
      //Information to be printed.
      /* Declare and initialize the variables used below. */
      String customerName = "Hisao";
      int cupsOfCoffee = 1;
      double costOfCoffee = 99.9 ;
      boolean  tip = true;

      //Print that information in the console.
      System.out.println("Dear " + customerName + ", thank you for supporting our business!");
      System.out.println("Cups of coffee bought: " + cupsOfCoffee + ".");
      System.out.println("Cost of 1 cup of coffee: $" + costOfCoffee + ".");
      System.out.println("Your total is: $99.9.");
      System.out.print("Tip is included? " + tip + ".");
   }
}