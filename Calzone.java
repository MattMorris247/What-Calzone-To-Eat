import java.util.ArrayList;
import java.util.Scanner;

public class Calzone {
    private int numberOfCalzones = 2; 
    private String name ;  //Name of Calzone. 
    private String desc ;  //Description of Calzone.
    private static ArrayList<Calzone> menu = new ArrayList<Calzone>(10) ;
    private Scanner keyboard = new Scanner(System.in);
    private static boolean on  = true; //   ON/OFF switch for command reader. 
public Calzone()  {  //Default const. Sets all variables to "N/A" . 

    name = "N/A" ; 
    desc = "N/A" ; 
}

public Calzone(String n , String d) { //n, desired name. d, desired description . 

    { 
    name  = n ; 
    desc  = d ; 
    } 
} 

public String getName ()  {  //Returns Name of Calzone .  
    return this.name ;
}

public String getDesc() {   //Returns Description (desc) of Calzone 
    return this.desc ; 
}

public int getTotalCalzone() { 
    return numberOfCalzones;  
}

public void setName(String n) {  //Sets name of Calzone 
    this.name = n; 
} 

public void setDesc(String d) {  //Sets description of Calzone 
    this.desc = d ; 
}
 
public void printCal() { //prints the Calzones Name and Description 
    System.out.println("Name: "+ name ) ; 
    System.out.println(desc) ; 
} 
@Override
public String toString(){ 
    return (this.getName() + "|" + this.getDesc())  ; 

  }


public void printMenu(){ 
    System.out.println("\n \n \n \n \n \n ") ; 
    System.out.println(" ______________________________________________________________________________") ; 
    System.out.println(" |_________________-CALZONE MENU-_____________________________________________|") ; 
    System.out.println(" | # |   -NAME-          |        -Description-                               |") ; 
    System.out.println(" |‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|") ; 
    for ( int i = 0 ; i < numberOfCalzones ;  i ++) { 
    System.out.println(" |"+ (i+1) + "  |"+ menu.get(i) + "|") ;
    }
    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾") ;
    System.out.println(" \n \n \n") ;  
}
public void introMsg(){ 
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n") ; 
    System.out.println("Welcome to Matt's Calzone Chooser!") ; 
}

public void printMatts(){ 
    System.out.println("---MATTS MENU---- ");
}
public void runRandomCal() {
    System.out.println("RANDOM CALZONE = "+ "PUT CALZONE HERE") ;
}
public void runQuit() { 
    System.out.println("Quiting..."); 
    on = false; 
}
public void director(){
    System.out.println("Options:\n1.  View Full Menu \n2.  View Matt's Favorites \n3.  Random Calzone") ; 
    System.out.println("Type 1, 2, 3 respectively...") ; 
    int answer = keyboard.nextInt();
    if (  answer==1 ){ 
        this.printMenu(); 
    }
    if ( answer==2 ){ 
        this.printMatts(); 
    }
    if ( answer==3){
        this.runRandomCal(); 
    }
    if ( answer==4) { 
        this.runQuit();  
    }
}

public static void main(String[] args) {  //MAIN 
     

    Calzone c1= new Calzone("BBQ Chicken Zone   " , "  Breaded Chicken, Bacon, Cheddar Cheese, BBQ Sauce ") ; 
    Calzone c2= new Calzone("BBQ Steak Zone     " , "  Steak, Mozzarella, American Cheese, BBQ Sauce     ") ; 
    
    
   
    menu.add(c1) ; 
    menu.add(c2) ; 
    
    //====================================================
    c1.introMsg();

    while (on) { 
    c1.director(); 
     
    } 


    
    
    
    } 
}//CALZONE 