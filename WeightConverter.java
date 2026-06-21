import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

       if(choice == 1){
           System.out.print("Enter weight in lbs: ");
           weight = scanner.nextDouble();
           newWeight = weight * 0.453592;
           System. out.printf("The new weight is: %.1f", newWeight);
       }
        else if(choice == 2){
            System.out.print("Enter weight in kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System. out.printf("The new weight is: %.1f", newWeight);
        }
        else{
            System.out.print("That was not a valid choice");
       }
        
        scanner.close();
    }
}
