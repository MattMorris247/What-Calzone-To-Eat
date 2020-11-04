import java.util.ArrayList;

public class CalzoneDriver {

    public static void print (String n ) { 
        System.out.println(n) ; 
    }

    

    public static void main(String[] args) {  //MAIN 
     

    Calzone c1= new Calzone("BBQ Chicken Zone   " , "All-time most Popular Calzone. Super Delish and an instant satisfier.") ; 
    Calzone c2= new Calzone("BBQ Steak Zone     " , "Steak, Mozzarella,American, BBQ Sauce") ; 
    
    
    ArrayList<Calzone> menu = new ArrayList<Calzone>(10) ;
    menu.add(c1) ; 
    menu.add(c2) ; 
    
    print("TESTING TOSTTRING DOG") ; 

    

    System.out.println(menu.toString())  ; 



    
    
    
    } 



    
}