### File Structure

Main Class: SimuDuckApp.java  

There are 4 types of Duck: IndianHomeDuck, AmericanFlyingDuck, RubberDuck, WoodenDuck

Duck.java (superclass)   
    |--> IndianHomeDuck.java  
    |--> AmericanFlyingDuck.java  
    |--> RubberDuck.java  
    |--> WoodenDuck.java  
    |--> ModelDuck.java  
    
QuackBehavior.java (Interface)  
    |--> Quack.java  
    |--> Squeak.java  
    |--> MuteQuack.java  
    
FlyBehavior.java (Interface)  
    |--> FlyNoWay.java   
    |--> FlyWithWings.java  
    |--> FlyWithRocket.java  


### This was Strategy Pattern  
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it. 

### Design Principles  
1. Encapsulate what varies   
2. Favor composition over inheritence   
3. Program to interfaces, not implementation   