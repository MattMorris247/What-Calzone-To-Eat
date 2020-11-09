import java.util.ArrayList;
import java.util.Scanner;

public class Calzone {
    private int numberOfCalzones = 19; 
    private int numberOfFavorites= 5 ;
    private String name ;  //Name of Calzone. 
    private String desc ;  //Description of Calzone.
    private Scanner input = new Scanner(System.in);  //Scanner for User Input 
    private static boolean on  = true; //   ON/OFF switch for command reader. 
    private static ArrayList<Calzone> menu = new ArrayList<Calzone>(19) ;   //ArrayList of Calzones... Full Menu
    private static ArrayList<Calzone> favMenu = new ArrayList<Calzone>(5) ; //ArrayList of Calzones... My favorites
    
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



public void introMsg(){ 
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n") ; 
    System.out.println("Welcome to Matt's Calzone Chooser!") ; 
}


public void runRandomCal() {
    System.out.println("RANDOM CALZONE = "+ "PUT CALZONE HERE") ;
}
public void runQuit() { 
    System.out.println("Quiting..."); 
    on = false; 
}
public void director(){
    System.out.println("Options:\n1.  View Full Menu \n2.  View Matt's Favorites \n3.  Random Calzone \n4.  Quit Program") ; 
    System.out.println("Type 1, 2, 3, 4 respectively...") ; 
    int answer = input.nextInt();
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
public void printMenu(){ 
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ") ; 
    System.out.println(" _____________________________________________________________________________________") ; 
    System.out.println(" |_________________-CALZONE MENU-____________________________________________________|") ; 
    System.out.println(" | # |   -NAME-          |                   -Description-                           |") ; 
    System.out.println(" |‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|") ; 
    for ( int i = 0 ; i < numberOfCalzones ;  i ++) { 
    if (i +1 <10 ) { 
        System.out.println(" |"+ (i+1) + "  |"+ menu.get(i) + "|") ;
    }
    else{ 
       System.out.println(" |"+ (i+1) + " |"+ menu.get(i) + "|") ; 
    }
    
    }
    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾") ;
  
    
}
public void printMatts(){ 
    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ") ; 
    System.out.println(" _____________________________________________________________________________________") ; 
    System.out.println(" |_________________-Matt's Favorite Calzones-________________________________________|") ; 
    System.out.println(" | # |   -NAME-          |                   -Description-                           |") ; 
    System.out.println(" |‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|") ; 
    for ( int i = 0 ; i < numberOfFavorites ;  i ++) { 
    if (i +1 <10 ) { 
        System.out.println(" |"+ (i+1) + "  |"+ menu.get(i) + "|") ;
    }
    else{ 
       System.out.println(" |"+ (i+1) + " |"+ menu.get(i) + "|") ; 
    }
    
    }
    System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾") ;

}
public static void main(String[] args) {  //MAIN 
     

    Calzone c1= new Calzone("BBQ Chicken Zone   " , "  Breaded Chicken, Bacon, Cheddar Cheese, BBQ Sauce        ") ; menu.add(c1) ; favMenu.add(c1) ; 
    Calzone c2= new Calzone("BBQ Steak Zone     " , "  Steak, Mozzarella, American Cheese, BBQ Sauce            ") ; menu.add(c2) ; 
    Calzone c3= new Calzone("Buffer Zone        " , "  Breaded Chicken, Mozzarella , Hot Sauce, Blue Cheese     ") ; menu.add(c3) ; favMenu.add(c3) ; 
    Calzone c4= new Calzone("CheeseBurg Zone    " , "  Hamburger, Bacon, Mozzarella, Cheddar Cheese             ") ; menu.add(c4) ; 
    Calzone c5= new Calzone("Cheese Zone        " , "  Mozzarella, Paremsan, Riccota                            ") ; menu.add(c5) ; 
    Calzone c6= new Calzone("Chick N Bacon Zone " , "  Breaded Chicken, Bacon, Mozzarella                       ") ; menu.add(c6) ; 
    Calzone c7= new Calzone("Chicken ParmaZone  " , "  Breaded Chicken, Mozzarella, Paremsan, Marinara          ") ; menu.add(c7) ; favMenu.add(c7) ; 
    Calzone c8= new Calzone("Combat Zone        " , "  Pepperoni, Sausage, Green Peppers, Mushrooms, Mozzarella ") ; menu.add(c8) ; 
    Calzone c9= new Calzone("Danger Zone        " , "  Hamburger, Cheddar, Onions, Hot Sauce,Taco Seasoning     ") ; menu.add(c9) ; 
   Calzone c10= new Calzone("Drop Zone          " , "  Breaded Chicken, Pepperoni, Mozzarella, Parmesan, Ricotta") ; menu.add(c10) ; 
   Calzone c11= new Calzone("End Zone           " , "  Steak , Green Peppers, Onions, Mozzarella                ") ; menu.add(c11) ; 
   Calzone c12= new Calzone("Falling Rock Zone  " , "  Bacon, Tots, Cheddar, Mozzarella, Sour Cream             ") ; menu.add(c12) ; 
   Calzone c13= new Calzone("Italian Zone       " , "  Salami, Ham, Pepperoni, Mozzarella, Paremsan, Ricotta    ") ; menu.add(c13) ; 
   Calzone c14= new Calzone("Maui Wowi Zone     " , "  Pineapple, Ham, Mozzarella                               ") ; menu.add(c14) ; favMenu.add(c14) ; 
   Calzone c15= new Calzone("Passing Zone       " , "  Breaded Chicken, Bacon, Tomatoes, Ranch, Mozzarella      ") ; menu.add(c15) ; 
   Calzone c16= new Calzone("Pesto Zone         " , "  Pesto, Mozzarella, Tomatoes                              ") ; menu.add(c16) ; 
   Calzone c17= new Calzone("Roni Zoni          " , "  Pepperoni, Mozzarella, Paremsan, Ricotta                 ") ; menu.add(c17) ; 
   Calzone c18= new Calzone("Speed Zone         " , "  Breaded Chicken, Spinach, Garlic, Mozzarella, Ricotta    ") ; menu.add(c18) ; 
   Calzone c19= new Calzone("Spinner Zone       " , "  Sausage, Mozzarella, Italian Spices                      ") ; menu.add(c19) ; favMenu.add(c19) ; 

   
    c1.introMsg();
    while (on) { 
    c1.director(); 
     
    } 


    
    
    
    } 
}//CALZONE 