Question 1. Can you invoke a static method within a non-static method? How about 
the other way around? Explain in detail. 

Yes, you can invoke non-static methods within static methods. Even though non-static methods are tied to objects, they still know what class they belong to. Because static methods know what class they belong to, a non-static/instance method can call them. On the other hand, you cannot directly call the static method from within a nonstatic method. A static method has no object reference, and instance variables require a object. You would need an object already for it to work.


Question 2. Can you reference an instance variable within a static method? Why or why not? Explain in detail

In the code shown, you will not be able to because there needs to be an object refernece. "InstanceVar" lives inside an object of "Example". With no object, the JVM has no idea which object's InstanceVar to work with.


Question 3. Assume  that n is of type int and m is of type long. What is the type of the value 
returned by Math.min(n, m) ? 

The type of value returned is "long", because the int argument is promoted to long, so then it matches the win(long, long) overload


Question 4. What is the type of the constant null? And if you wanted to check if a variable 
of class type contains null, would you use == or equals?

The constant "null" is actually compatible with all reference types. To check if a variable contains null, I would use:
if (name == null) { ... }


What is the output of the following code? This is the Date class from Java.

First Part: Returns Dec 10, 2013
Seconf Part: Returns Oct 10, 2013
