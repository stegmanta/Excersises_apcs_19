##Abstract
//Either has to be inside of an abstract class or an interface
public class abstract Animal{
    public void pet(); // abstract function (w/o using keyword abstract because the whole class is already abstract)
}


public static void main(String []args){


}
#Commonly used functions

.toString()
.equals(Object O)

int compareTo(Object O)
-1(means out of order)
0 (means same number can't compare )
1 (means in order)



--Example of .compareTo()

Cat c = new Cat();
Cat b = new Cat();

c.compareTo(b);


##Interface 
def. the system you use to communicate with something else

#Example(s)
coding ---- Xbox(the controller is the interface);

#java interface
public toString()
walk()
--the public keyword is the interface in java

#another use of java interface

Animal-> cat extends animal// all use function greet(If you want it to be greetable)
-> dog extends animal//all use function greet (if you want it to be greetable)

pet owner

Greeter
sayHi(__Greetable__ thing){
    thing.greet
}
#The purpose of java interface
set of functions should be on different classes


#Proper use of java interface(Greetable)
-make new file
Greetable.java
---------------
2 things aloud to put inside of an interface
 #1 constant decleration (EX. public static final int GRAVITY_EARTH = -90;)
 #2 create function signature(EX. public void greet();) / never aloud to put implementation

public interface Greetable{
    public void greet();

}

-Use greetable outside of class
                                                    // can implement multiple interfaces
public class Dog extends Animal implements Greetable, Agreeable, Likeable{

    public void greet(){ // use this function or 
    }
    public void greet(); // or this
}
-actual uses

//determines if something is greetable with the interface and then greets them

Greetable gr = new Animal();
Greetable gr2 = new Dog();
Greetable[] greets = new Greetable[2];
greets[0] = gr;
greets[1] = gr2;

for(Greetable g; greet){
    g.greet();
}

#A website like window (with a window image buttons list)

java uses 

JFrame
JPanel -> JImagePanel
JButton

mouse listener

mousePressed()
mouseReleased()

public class MyButton extends Button implements MouseListen