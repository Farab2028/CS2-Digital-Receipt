  import java.util.Scanner;
  public class Main {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   int orderNum = (int) (Math.random() * 100) + 1;
   System.out.print("Enter number of drinks: ");
int numDrinks = input.nextInt();
System.out.print("Enter number of candies: ");
int numCandies = input.nextInt();
System.out.print("Enter number of hot dogs: ");
int numHotdogs = input.nextInt();
System.out.print("Enter number of hamburgers: ");
int numHamburgers = input.nextInt();

input.nextLine();
System.out.print("Enter full high school name: ");
String fullSchoolName = input.nextLine();

int firstSpace = fullSchoolName.indexOf(" ");
int secondSpace = fullSchoolName.indexOf(" ", firstSpace + 1);

String firstInitial = fullSchoolName.substring(0, 1);
String secondInitial = fullSchoolName.substring(firstSpace + 1, firstSpace + 2);
String thirdInitial = fullSchoolName.substring(secondSpace + 1, secondSpace + 2);
String highSchoolName = firstInitial + secondInitial + thirdInitial;


   double taxRate = 0.08;
   double subtotal = (double) (drinkPrice * numDrinks + candyPrice * numCandies + hotdogPrice * numHotdogs + hamburgerPrice * numHamburgers); 
   double totalTax = subtotal * taxRate;
   double total = subtotal + totalTax; 


     
   
   
   
   
   // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar  *");
     System.out.println("*     Order #" + orderNum + "                      *");
     System.out.println("*                                    *");
     System.out.println("* " + numDrinks + " Drink ..........$" + (numDrinks * drinkPrice) + "             *");
     System.out.println("*" + numCandies + " Candy ..........$" + (numCandies * candyPrice) + "             *");
     System.out.println("*" + numHotdogs + " Hot Dog ........$" + (numHotdogs * hotdogPrice) + "             *");   
     System.out.println("*" + numHamburgers + " Hamburger ......$" + (numHamburgers * hamburgerPrice) + "             *");
     System.out.println("*                                    *");    
     System.out.println("*   Subtotal .......$" + subtotal + "             *");
     System.out.println("*   Tax ............$" + totalTax + "             *");
     System.out.println("*   Total ..........$" + total + "             *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");
  }
  }
