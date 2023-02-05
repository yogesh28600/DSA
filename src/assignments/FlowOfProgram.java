package assignments;

import java.io.*;
import java.util.ArrayList;

public class FlowOfProgram {
    public static void main(String[] args) throws IOException {
        //1
        //sLeap(1900);
        //2
        //sum(3,4);
        //3
        //mulTalble(5);
        //4
        //HCFandLCM(24,60);
        //5
        sumOfInputs();
    }




    // 1.Input a year and find whether it is a leap year or not.
    static void IsLeap(int year){
        boolean isLeapYear = false;
        //A leap year is a year that is divisible by 4, except for years that are both divisible by 100 and not divisible by 400.
        if(year % 4 ==0){
            if(year % 400 ==0){
                isLeapYear=true;
            }
        }

        System.out.println(isLeapYear);
    }



   //2.Take two numbers and print the sum of both.
    static void sum(int a, int b){
        System.out.println(a+b);
    }



    //3.Take a number as input and print the multiplication table for it.
    static  void mulTalble(int n){
        for(int i=1;i<13;i++){
            int prod= n*i;
            System.out.println(n + "*" + i + "=" + prod);
        }
    }

    //4.Take 2 numbers as inputs and find their HCF and LCM.
    static void HCFandLCM(int a, int b){
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                li1.add(i);
            }
        }
        System.out.println("LCM is"+" "+li1.get(0));
        int len= li1.size();
        System.out.println("HCF is"+" "+li1.get(len-1));
    }

    //5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    static void sumOfInputs() throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true){
            System.out.println("enter a number or enter x");
            String input=br.readLine();

            if(input.equals("x")){
                break;
            }else{

                sum += Integer.parseInt(input);
            }


        }
        System.out.println("sum is "+sum);

    }
}
