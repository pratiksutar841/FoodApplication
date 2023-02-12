import java.util.Scanner;
public class FoodApplication
{
    public static void main(String[] args)
    {
        System.out.println("Hello Welcome to the food app");
        System.out.print("Please Create a password : ");
        Scanner sc = new Scanner(System.in);
        String pas1 = sc.next();
        System.out.println("Your password is now : "+pas1);

        System.out.print("Please Enter your password: ");
        String pass = sc.next();

        while (!pass.equals(pas1))
        {
            System.out.print("This is not right password, Please try again: ");
            pass = sc.next();
        }
        System.out.println("Access Granted");
        System.out.print("Are you hungry Yes or No: ");
        String ans1 = sc.next();

        if (ans1.equals("Yes"))
        {
            System.out.print("Choose What you want to eat between pizza, burger or Sandwich = ");
            String ans2= sc.next();
            while (!ans2.equals("pizza")&& !ans2.equals("burger")&& !ans2.equals("sandwich"))
            {
                System.out.println("Sorry we do not have it what would you like between pizza,burger or sandwich");
                ans2 = sc.next();
            }
            if (ans2.equals("pizza")||ans2.equals("burger")||ans2.equals("sandwich"))
            {
                System.out.print("Do you want something to drink ? yes or no : ");
                String ans3 = sc.next();
                while (!ans3.equals("yes")&& !ans3.equals("no"))
                {
                    System.out.println("wrong command please try again: ");
                    ans3 = sc.next();
                }
                if (ans3.equals("yes"))
                {
                    System.out.println("What would you like to drink coke or juice ? : ");
                    String ans4= sc.next();
                    while (!ans4.equals("coke")&& !ans4.equals("juice"))
                    {
                        System.out.println(" sorry we don't have it what would you like between coke and juice: ");
                        ans4 = sc.next();
                    }
                    if (ans4.equals("coke")||ans4.equals("juice"))
                    {
                        System.out.println("Greate you orderd "+ans2+ " and " +ans4);
                    }
                    System.out.print("please confirm your password = ");
                    pass =sc.next();
                    while (!pass.equals(pas1))
                    {
                        System.out.print("This is not right password, Please try again: ");
                        pass = sc.next();
                    }
                    System.out.println("Thank you order is on it's way");
                }
                else {
                    System.out.println("You have ordered " + ans2);

                    System.out.println("please confirm your password");
                    pass = sc.next();
                    while (!pass.equals(pas1)) {
                        System.out.print("This is not right password, Please try again: ");
                        pass = sc.next();
                    }
                }
            }
        }
        else
        {
            System.out.println("Alright have a good day");
        }
    }
}
