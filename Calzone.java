public class Calzone { 
    
    private String name ;  //Name of Calzone. 
    private String desc ;  //Description of Calzone.


public Calzone()  {  //Default const. Sets all variables to "N/A" . 

    this.setName= "N/A" ; 
    this.setDesc= "N/A" ; 
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
    returns this.desc ; 
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




}//CALZONE 