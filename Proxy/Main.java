package Proxy;

public class Main 
{
	
    public static void main(String[] args) 
    {
       IImage image = new ProxyImage("test_10mb.jpg");
 
       //image will be loaded from disk
       image.display(); 
       System.out.println("");
       
       //image will not be loaded from disk
       image.display(); 	
    }
 }
