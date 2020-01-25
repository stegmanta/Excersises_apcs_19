 public class Dog{
     public boolean sitting;
     public int health;
     public String name;

     //constructors
     public Dog(boolean sitting, int health, String name){
         this.sitting = sitting;
         this.health = health;
         this.name = name;
     }


     //functions

     public String Bark(){
         if(sitting){
             return "Bark";
         }
         return "Woof";
     }

 }