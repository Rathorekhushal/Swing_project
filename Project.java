package Javaproject;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int  operator;
        Float  n1; 
        float  n2;
        System.out.println("1-Addition \n 2-Substrction \n 3-Multiply \n 4-Division");
        System.out.println("Enter two nunber ");
        System.out.println("chose an operator ");
        Scanner sc =new Scanner(System.in);
        operator =sc.nextInt();
        System.out.println("enter first number ");
        n1=sc.nextFloat();
        System.out.println("enter second number ");
        n2=sc.nextInt();
        float result = 0.001f;

        switch (operator) {
            case 1:
                result =n1+n2;
    
            break;
            case 2:
            result =n1-n2;
            break;
            case 3:
            result = n1*n2;
            break;
            case 4:
            result =n1/n2;
            break;
        
            default:
                break;
        }
        
       System.out.println("the result is "+result);
    }
    
}
