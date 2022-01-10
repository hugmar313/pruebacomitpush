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
        int minmuni,maxmuni;
        maxmuni=0;
        minmuni=0;
        int num;
        System.out.println("Introduzca el numero de temperaturas que vas a introducir:");
        num=input.nextInt();
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE;
        System.out.println("Introduce la/s temperaturas y de que municio/s son:");
        int temp[]=new int[num];
        String muni[]=new String[num];
        for (int i=0;i<temp.length;i++){
            System.out.println("Introduce la temperatura:");
            temp[i]=input.nextInt();
            if (temp[i] < 0) {
                System.out.println("Es negativa.");
            } else if (temp[i] > 0) {
                System.out.println("Es positiva.");
            } else {
                System.out.println("Es 0.");
            }
            System.out.println("Y ahora de que municipio es:");
            input.nextLine();
            muni[i]= input.nextLine();    
        }
        
        for (int i=0;i<temp.length;i++) {

            if (temp[i] < min) {
                min = temp[i];
                minmuni=i;
            }
            if (temp[i] > max) {
                max=temp[i];
                maxmuni=i;
            }
        }   
        System.out.println("Las temperaturas introducidas son:");
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println("La temperatura mayor es "+max+" de "+muni[maxmuni]+" y la menor es "+min+" de "+muni[minmuni]+".");
    }
}
