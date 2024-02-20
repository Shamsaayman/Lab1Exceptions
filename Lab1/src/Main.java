import java.util.InputMismatchException;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

//////////////////////// NUMBER 1 //////////////////////////////////

//try{
//        System.out.println("Please enter First number:");
//        int  num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//    System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
//    System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
//    System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
//    System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
//    System.out.println(num1 + " mod " + num2 + "=" + (num1%num2));
//}
//
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//catch(ArithmeticException  e){
//    System.out.printf("Error");
//}

 //////////////////////// NUMBER 2//////////////////////////////////
//try{
//        System.out.println("Input a number:");
//        int num = s.nextInt();
//
//        for ( int i = 1 ; i<=10 ; i++){
//            System.out.println(num + " x " + i + " = " + num*i);
//        }
//}
//catch(NumberFormatException  e){
//            System.out.printf("Error");
//        }
//catch(InputMismatchException  e){
//            System.out.printf("Error");
//        }
//////////////////////// NUMBER 3 //////////////////////////////////
//try {
//    System.out.println("Please enter radius:");
//    double rad = s.nextDouble();
//    System.out.println("Perimeter is: " + (2 * 3.14 * rad));
//    System.out.println("Area is: " + (rad * rad * 3.14));
//}
//catch(NumberFormatException  e){
//            System.out.printf("Error");
//        }
//catch(InputMismatchException  e){
//            System.out.printf("Error");
//        }
//////////////////////// NUMBER 4 //////////////////////////////////
//try{
//        System.out.print("Enter the count of numbers: ");
//        int num = s.nextInt();
//        int sum = 0 ;
//        double avg = 0 ;
//        for (int i = 0; i < num; i++) {
//            System.out.print("Enter an Integer:");
//            int num2 = s.nextInt();
//            sum = num2 + sum;
//            avg = sum/num;
//
//        }
//        System.out.println("The Sum is : " + sum);
//
//        System.out.println("The Average is : " + avg);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//catch(ArithmeticException  e){
//    System.out.printf("Error");
//}
//////////////////////// NUMBER 5 //////////////////////////////////
//
//try{
//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        System.out.println("Please enter Third number:");
//        int num3 = s.nextInt();
//
//        if ((num1+num2)== num3){
//            System.out.println("Th result is : True");
//        }
//        else{
//            System.out.println("Th result is : False");
//        }}
//
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 6 //////////////////////////////////
//try {
//    System.out.println("Input a word:");
//    String str = s.nextLine();
//    checkstring(str);
//    String reverse = "";
//    for (int i = str.length() - 1; i >= 0; i--) {
//        reverse = reverse + str.charAt(i);
//    }
//    System.out.println("Reverse word: " + reverse);
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//catch(Exception e){
//    System.out.println(e.getMessage());
//}
//////////////////////// NUMBER 7 //////////////////////////////////
//try{
//        System.out.println("Enter a number:");
//        int num = s.nextInt();
//        if (num%2==0){
//            System.out.println("The number is Even");
//        }
//        else{
//            System.out.println("The number is Odd");
//        }
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 8 //////////////////////////////////
//try {
//    System.out.println("Enter temperature in Centigrade:");
//    double num = s.nextDouble();
//    double result = (1.8 * num) + 32;
//    System.out.println("Temperature in Fahrenheit is: " + result);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 9 //////////////////////////////////
//try {
//    System.out.println("Input a String: ");
//    String str = s.nextLine();
//        checkstring(str);
//    System.out.println("Input a number:");
//    int num = s.nextInt();
//    System.out.println("Output:" + str.charAt(num));
//}
//     catch(StringIndexOutOfBoundsException e){
//         System.out.println("Error-StringOutofbound");
//     }
//     catch(InputMismatchException e){
//         System.out.println("Error-Inputmismatch");
//     }
//catch(Exception e){
//    System.out.println(e.getMessage());
//}
//////////////////////// NUMBER 10 //////////////////////////////////
//try {
//    System.out.println("Enter Width");
//    double w = s.nextDouble();
//    System.out.println("Enter Height");
//    double h = s.nextDouble();
//    System.out.println("Area is " + w + " x " + h + " = " + (w * h));
//    System.out.println("Perimeter is 2 x " + "(" + w + "+" + h + ") " + " = " + (2 * (w + h)));
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//////////////////////// NUMBER 11//////////////////////////////////
//try {
//    System.out.println("Please enter First number:");
//    int num1 = s.nextInt();
//    System.out.println("Please enter Second number:");
//    int num2 = s.nextInt();
//
//    if (num1 != num2) {
//        System.out.println(num1 + "!=" + num2);
//    } else {
//        System.out.println(num1 + "==" + num2);
//    }
//
//    if (num1 >= num2) {
//        System.out.println(num1 + ">=" + num2);
//    } else {
//        System.out.println(num1 + "<" + num2);
//    }
//
//    if (num1 <= num2) {
//        System.out.println(num1 + "<=" + num2);
//    } else {
//        System.out.println(num1 + ">" + num2);
//    }
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//////////////////////// NUMBER 12//////////////////////////////////
//try {
//        System.out.println("Input seconds");
//        int num = s.nextInt();
//        int hrs= num/60;
//        int min = hrs%60;
//        int sec = num%60;
//        hrs=hrs/60;
//        System.out.println(hrs +":"+ min +":"+sec);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 13//////////////////////////////////
//try{
//        System.out.println("Please enter First number:");
//        int num1 = s.nextInt();
//        System.out.println("Please enter Second number:");
//        int num2 = s.nextInt();
//        System.out.println("Please enter Third number:");
//        int num3 = s.nextInt();
//        System.out.println("Please enter Fourth number:");
//        int num4 = s.nextInt();
//
//        if ( (num1==num2) && (num3==num4)){
//            System.out.println("Numbers are Equal");
//        }
//        else{
//            System.out.println("Numbers are Not Equal");
//        }
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 14//////////////////////////////////
//try{
//        System.out.println("Please enter number:");
//        int num = s.nextInt();
//        if(num>0){
//            System.out.println("Number is Positive");
//        }
//        else if (num==0){
//            System.out.println("Number is Zero");
//        }
//        else{
//            System.out.println("Number is Negative");
//
//        }
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//////////////////////// NUMBER 15//////////////////////////////////
//try {
//    int num;
//    int psum = 0;
//    int nsum = 0;
//    int zsum = 0;
//    do {
//        System.out.println("Please enter number:");
//        num = s.nextInt();
//
//        if (num > 0) {
//            psum++;
//        } else if (num < 0) {
//            nsum++;
//        } else {
//            zsum++;
//        }
//
//    }
//    while (num != -1);
//    System.out.println("Positives: " + psum);
//    System.out.println("Negatives: " + (nsum));
//    System.out.println("Zeros: " + zsum);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}
//finally {
//    System.out.printf("Loop Ended");
//
//}
//////////////////////// NUMBER 16//////////////////////////////////
//try {
//    System.out.println("Please enter number:");
//    int num = s.nextInt();
//
//    int reverse = 0;
//    while (num != 0) {
//        int mod = num % 10;
//        reverse = reverse * 10 + mod;
//        num = num / 10;
//    }
//    System.out.println("The reversed number is: " + reverse);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 17//////////////////////////////////
//try {
//    int num;
//    int largest = Integer.MIN_VALUE;
//    ;
//    int smallest = Integer.MAX_VALUE;
//    int i = 1;
//    do {
//        System.out.println("Please enter number and 0 to end:");
//        num = s.nextInt();
//        if (num > largest)
//            largest = num;
//        else if (num < smallest)
//            smallest = num;
//        ;
//    }
//    while (num != 0);
//    System.out.println("Largest Number is: " + largest);
//    System.out.println("Smallest Number is: " + smallest);
//}
//catch(NumberFormatException  e){
//    System.out.printf("Error");
//}
//catch(InputMismatchException  e){
//    System.out.printf("Error");
//}

//////////////////////// NUMBER 18//////////////////////////////////
try {
    int count = 0;
    System.out.println("Input a String: ");
    String str = s.nextLine();
    checkstring(str);
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a')
            count++;
    }
    System.out.println("Number of A's: " + count);
}
     catch(StringIndexOutOfBoundsException e){
         System.out.println("Error-StringOutofbound");
     }
     catch(InputMismatchException e){
         System.out.println("Error-Inputmismatch");
     }
catch(Exception e){
    System.out.printf(e.getMessage());

}

    }
    public static void checkstring(String s) throws Exception{
        if (s.matches("\\d+")) {
            throw new Exception("Error - Enter String ");
        }
    }
}