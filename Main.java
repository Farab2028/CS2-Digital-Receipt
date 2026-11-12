  public class Main {
  public static void main(String [] args) {

   String highSchoolName = "BWL";
   double drinkPirce = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   int orderNum = (int) (Math.random()*100) +1;
   int numDrinks = (int) (Math.random ()*3);
   int numCandies = (int) (Math.random ()*3);
   int numHotdogs = (int) (Math.random ()*3);
   int numHamburgers = (int) (Math.random ()*3);
   double taxRate = (double)
   double subtotal = (double) (drinkPrice * numDrinks + candyPrice * numCandies + hotdogPrice * numHotdogs + hamburgerPrice * numHamburgers); 
   double totaltax = 
   double total = 


     
   
   
   
   
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPirce + "          *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "          *");     
     System.out.println("*     Hot Dog ........$" + hotdogPrice + "          *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "          *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }
