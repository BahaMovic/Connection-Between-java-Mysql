/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Moaaz Magdy
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
            
        
     ArrayList<Integer> x = new ArrayList<>();
     ArrayList<Integer> y = new ArrayList<>();
     int size ;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter The Size : ");
     size = input.nextInt();
     for(int i=0;i<size;i++){
         System.out.println("Enter X Number "+(i+1));
         int xx = input.nextInt();
         x.add(xx);
         System.out.println("Enter Y Number "+(i+1));
         int yy = input.nextInt();
         y.add(yy);
         
     }
     
     int x_y = 0;
     int sumx = 0;
     int sumy = 0;
     int sumx2 = 0;
     int sumy2 = 0;
     for(int a=0;a<size ;a++ ){
         x_y += x.get(a) * y.get(a);
         sumx += x.get(a);
         sumy += y.get(a);
         sumx2 += Math.pow(x.get(a),2);
         sumy2 += Math.pow(y.get(a),2);
     }
     double x2 = Math.pow(sumx, 2);    int y2 = (int) Math.pow(sumy,2);
     int nxy = size*x_y;
     int xy = sumx * sumy;
         int thebast;
    thebast=nxy-xy;
    int thelast;
    thelast = (int) ((size*(sumx2))-(x2));
    
    double a= thebast / thelast;
    System.out.println("A : "+a);
    double b = ((sumy*x2)-(sumx*x_y))/((size*(x2))-sumx2);
    System.out.println("B = "+b);
    
    }

    
}
