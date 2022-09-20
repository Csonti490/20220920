/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wd.pkg20220920.nd;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author nagy.david
 */
public class Wd20220920Nd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Feladat">
        /*Scanner be = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Írja be az első szót: "); //1.szó:
        String a = be.next();
        System.out.print("Írja be a második szót: "); //2.szó:
        String b = be.next();
        System.out.print("Írja be a harmadik szót: "); //3.szó:
        String c = be.next();
        
        int d = a.length();
        int e = b.length();
        int f = c.length();
        
        //első féle megoldás
        int max = Math.max(Math.max(d, e),f);
        System.out.println("A leghosszabb szó "+max+" betűből áll.");
        
        if(max == a.length()){
        System.out.println("Leghosszabb szó: "+a); //pl.: alma
        }
        else if(max == b.length()){
        System.out.println("Leghosszabb szó: "+b); //pl.: narancs
        }
        else{
        System.out.println("Leghosszabb szó: "+c); //pl.: citrom
        }
        
        //második féle megoldás
        if(d >= e && d >= f){
        System.out.println("A leghosszab szó: "+a+"\nKarakterszám: "+d);
        }
        else if(e >= d && e >= f){
        System.out.println("A leghosszab szó: "+b+"\nKarakterszám: "+e);
        }
        else{
        System.out.println("A leghosszab szó: "+c+"\nKarakterszám: "+f);
        }
        */
//</editor-fold>
        
        //Gyakorlás
        Scanner be = new Scanner(System.in).useDelimiter("\n");
        
        //<editor-fold defaultstate="collapsed" desc="Másodfok">
        /*// Másodfok
        System.out.print("Kérem 'a' értékét: ");
        double a = be.nextDouble();
        if(a == 0){
        System.out.print("Ez nem egy másodfokú egyenlet.");
        }
        else{
        System.out.print("Kérem 'b' értékét: ");
        double b = be.nextDouble();
        System.out.print("Kérem 'c' értékét: ");
        double c = be.nextDouble();
        
        double diszkr = Math.pow(b, 2)-4*a*c;
        
        if(diszkr > 0){ //Példa: 1,9,8
        double x1 = (-b+Math.sqrt(diszkr))/(2*a);
        double x2 = (-b-Math.sqrt(diszkr))/(2*a); // Ctrl + Shift + le
        System.out.println("x1: "+x1+"\nx2: "+x2);
        }
        else if(diszkr == 0){ // 1,2,1
        double x = -b/(2*a);
        System.out.println("X: "+x);
        }
        else{ // 1,0,1
        System.out.println("Nincs valós megoldás.");
        }
        }*/
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Háromszög">
        /*//Háromszög
        System.out.print("'a' oldal: " );
        double ha = be.nextDouble();
        System.out.print("'b' oldal: " );
        double hb = be.nextDouble();
        System.out.print("'c' oldal: " );
        double hc = be.nextDouble();
        
        if(ha+hb>hc && ha+hc>hb && hb+hc>ha){ // 3,6,4
        double ker = ha+hb+hc;
        double s = ker/2;
        double ter = Math.sqrt(s*(s-ha)*(s-hb)*(s-hc));
        System.out.println("Kerület: "+ker+"\nTerület: "+ter);
        }
        else{
        System.out.println("Nincs ilyen háromszög.");
        }*/
//</editor-fold>
        
        //Kör
        System.out.print("Kérem a sugarat: ");
        double r = be.nextDouble();
        
        if(r == 0){ // 0
            System.out.println("Hibás adat!");
        }
        else{ // 3
            double k_ker = 2*r*Math.PI;
            double k_ter = Math.pow(r, 2)*Math.PI;
            System.out.println("Kerület: "+k_ker+"\nTerület: "+k_ter);
        }
    }
    
}
