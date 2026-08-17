import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Q1 Find smallest from 3 number
        //1.Enter Data
        System.out.print("Please enter First Number: ");
        int number1=input.nextInt();

        System.out.print("Please enter Second Number: ");
        int number2=input.nextInt();

        System.out.print("Please enter Third Number: ");
        int number3=input.nextInt();

        //call method
        minNumber(number1,number2,number3);

        //Q2 check number is positive or negative
        System.out.println("---------------------------------------------------------");

        System.out.print("Enter number to check if it's positive or negative: ");
        int number=input.nextInt();

        //call method
        checkNumber(number);

        //Q3 check password
        System.out.println("---------------------------------------------------------");

        System.out.println("1.A password must have at least 10 charcheter.");
        System.out.println("2.A password consists of only letterd and Digits.");
        System.out.println("3.A password must contain at least two digit.");
        System.out.print("Please Enter password(You are agreeing to the above Terms and conditions): ");
        input.nextLine();
        String password= input.nextLine();

        //call method
        boolean isValid=checkPassword(password);

        if(isValid){
            System.out.println("The password("+password+") is: Valid");
        }else {
            System.out.println("The password("+password+") is: Not Valid");
        }






    }


    //Method to find smallest number
    public static void minNumber(int num1,int num2,int num3){
        int smallNumber;
        //compare operation for three number if find smallest number assign to var smallNumber
        if(num1<num2){
            if(num1<num3){
                smallNumber=num1;
            }else {
                smallNumber=num3;
            }
        }else if(num2<num3) {
            smallNumber=num2;
        }else {
            smallNumber=num3;
        }

        System.out.println("The smallest Number is: "+smallNumber);
    }

    //Method check number if it's + or -
    public static void checkNumber(int num){
        if(num>=0){
            System.out.println("The number ("+num+") is positive");
        }else {
            System.out.println("The number ("+num+") is negative");
        }
    }

    //Method to check password if it's meet the rule
    public static boolean checkPassword(String password){
        boolean isValid=true;
        if(password.length()<10){
            System.out.println("The password must have at least 10 characters!!");
            isValid=false;
        }
        if(password.contains("@")||password.contains("!")||password.contains("#")||password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")){
            System.out.println("The password consists of only letters and digits!!");
            isValid=false;
        }
        //حتى اتحقق ان فيه رقمين اول شي يكون فيه عداد حتى يحسب كم رقم فيه وبعدين ادخل لوب حتى اتحقق من كل حرف في باسورد وبعدها اتحقق اذا حرف رقم زيد عداد بواحد
        int countDigit=0;
        for (int i = 0; i < password.length(); i++) {
            char check=password.charAt(i);
            if (check>='0' && check<='9') {
                countDigit++;
            }
        }
        //check if password have 2 digit at least
        if(countDigit<2){
            System.out.println("The password must contain at least two digit!!");
            isValid=false;
        }

        return isValid;
    }
}