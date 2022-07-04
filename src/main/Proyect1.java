package main;


import java.util.Scanner;

public class Proyect1 {
    public static void main(String[] args) {
    	
    	
    	Scanner in = new Scanner(System.in);
    	String palabra,palabraNueva="";
    	System.out.println("Ingrese una palabra");
    	palabra = in.nextLine();
    	//palabraNueva=palabra.substring(1,palabra.length())+palabra.substring(0,1)+"ay";
    	String [] palabras=palabra.split(" ");
    	for(int i=0; i<palabras.length;i++)
    	{
    		palabraNueva=palabraNueva+palabras[i].substring(1,palabras[i].length())+palabras[i].substring(0,1)+"ay ";
    	}
    	System.out.println("La palabra nueva es: "+palabraNueva);
    } 
}
