package week3;


/**
 * Write a description of class Tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial3
{
    public static void main (String[] args){
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
         System.out.println(Integer.SIZE);
        
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        
        
        byte b = 15;
        byte c = 17;
        
        byte d= (byte)(b + c ); 
        
        
        float f = 2.33f ;
        
        long l = 233l;
        
        int a = 10;
        float g= 2.333f;
        double k = 2.345;
        
        
        int x= (int)(a+g+k);
        System.out.println (x);
        
        
        int y = 10;
        int u = 4 ;
        
       float result =((float)y/u);
        
        
        
        
        System.out.println(result) ;
        
       
        System.out.print("My name is ") ;
        System.out.print("sonu") ;
        
        System.out.println("My\tname is \n"  + "\" sonu\"") ;
        
        int length = 10 ;
        int breadth = 20;
        
        int area = length * breadth;
        int perimeter = 2*(length + breadth) ;
        
         System.out.println(area ) ;
        System.out.println(perimeter + "cm") ;
        
        int principal =  500;
        int year =  5;
        float rate =  2.3f ;
        
        float simpleintrest =  (principal*year*rate)/100 ;
        System.out.println(simpleintrest) ;
        
    }
        
  
}