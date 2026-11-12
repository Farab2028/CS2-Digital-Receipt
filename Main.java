  public class Main {
  public static void main(String [] args) {

   String highSchoolName = "BWL";
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   int orderNum = (int) (Math.random()*100) +1;
   int numDrinks = (int) (Math.random ()*3);
   int numCandies = (int) (Math.random ()*3);
   int numHotdogs = (int) (Math.random ()*3);
   int numHamburgers = (int) (Math.random ()*3);
   double taxRate = 0.08;
   double subtotal = (double) (drinkPrice * numDrinks + candyPrice * numCandies + hotdogPrice * numHotdogs + hamburgerPrice * numHamburgers); 
   double totalTax = subtotal * taxRate;
   double total = subtotal + totalTax; 


     
   
   
   
   
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar Order #" + orderNum + " *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "          *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "          *");     
     System.out.println("*     Hot Dog ........$" + hotdogPrice + "          *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "          *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }
