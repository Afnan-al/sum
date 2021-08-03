/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=(int)( Math.random()*10);
        int num2=(int)(Math.random()*10);
        Scanner input=new Scanner (System.in);
        System.out.print("what is "+num1+"+"+num2+"?");
        int answer = input.nextInt();
        while (num1+num2!=answer){
            System.out.print("wrong answer. Try again.what is"+num1+"+"+num2+"?");
            answer = input.nextInt();
        }
        System.out.print("you got it");
            
        }
        // TODO code application logic here
    }
