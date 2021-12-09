/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comitpush;
import java.util.Scanner;
/**
 *
 * @author hugmar
 */
public class Comitpush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Introduzca el numero de temperaturas que vas a introducir:");
        num=input.nextInt();
        double temp;
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        System.out.print("Introduce la/s temperaturas:");
        for (int i = 1; i <= num; i++) {
            temp = input.nextDouble();
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max=temp;
            }
        }   
        System.out.println("La menor es "+min+" y la mayor es "+max+".");
    }
}
