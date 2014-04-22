/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Asisten
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=7;
        int tot=0;
        int a,b;
        //System.out.println("jumlah deret : ");
        //x=s.nextInt();
        a=1;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<x-1;i++){
            tot=a+b;
            System.out.println(tot);
            a=b;
            b=tot;   
        }
        
    }
    
    
}
