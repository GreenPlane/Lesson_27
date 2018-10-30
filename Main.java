import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    int [] array = new int[30];
    int i = 0;
    int valueFound = -1;
    
    for (i = 0; i < array.length; i++){
      array[i] = (int)(Math.random() * (20) + 80);
      // Enabling this line to run allowed to check that the array was filled with correct numbers.  System.out.println(array[i]); 
    }
    
    for (i = 0; i < array.length; i++){
       System.out.println("Enter a value to search or enter, -1 to exit the search.");
    
      int userInput = scan.nextInt();
      
      if (userInput == array[i]){
        valueFound = 1;
      }
      if (valueFound == 1){
      System.out.println("Value was found.");
      }
      else {
      System.out.println("Value was not found.");
    } 
      System.out.println("Would you like to search for another number?  1 to continue, -1 to exit.");
      
      int userInput2 = scan.nextInt();
      
      if (userInput2 == 1){
        i = i;
      }
      else if (i == -1){
        i = 31;
      }
    }
  }
}
