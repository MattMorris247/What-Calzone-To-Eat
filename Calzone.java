public class Calzone { 
    private int numberOfCalzones = 2; 
    private String name ;  //Name of Calzone. 
    private String desc ;  //Description of Calzone.


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
    return (this.getName() + "|" + this.getDesc() + "\n" )  ; 

  }


public void printMenu(){ 
for ( int i = 0 ; i < numberOfCalzones ;  i ++) { 

}



}
}//CALZONE 