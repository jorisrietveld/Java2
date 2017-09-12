# Assignment index 
Assignments for this week:
 - 5.1 to 5.38
 - 5.40 to 4.43
 - 5.46 to 5.70
 - 5.72
 - 5.73
  
# Assignment solutions
 - **5.1 look around**
   - Done 
 
 - **5.2 Investigate the String documentation. Then look at the documentation for some other classes.**
   - **What is the structure of class documentation?**
     - The name of the class
     - An general explanation about the class.
   - **Which sections are common to all class descriptions?**
     An general description about the class, throws info, return types and arguments.
   - **What is their purpose?**
     - Explaining the Java API
   - **The common structure of all class documentation is:**
     - Documentation about the classes attributes: An description and type.
     - Documentation about the classes methods: overloads, return types and what arguments they take.
     - Documentation about the classes Constructors and destructors: an Description, overloads, and what arguments they take.
     
 - **5.3 Look up the startsWith method in the documentation for String. There are two versions. Describe in your own words what they do and the differences between them.**
   - Both take an string as first argument, the optional integer argument shifts the index from witch the 
   sequence gets matched.
   
 - **5.4 Is there a method in the String class that tests whether a string ends with a given suffix? 
       If so, what is it called and what are its parameters and return type?**
   - Jep, 
   ```java 
   String.endsWith( surfix ) 
   ```
   
 - **5.5 Is there a method in the String class that returns the number of characters in the string? 
       If so, what is it called and what are its parameters?**
   - Jep, 
     ```java 
     String.length() 
     ```
   
 - **5.6 If  you  found  methods  for  the  two  tasks  above,  how  did  you  find  them?  Is  it  easy or hard to find methods you are looking for? Why?**
    - Intellij auto complete and crtl+Q
 - **5.7 Find the trim method in the String class’s documentation. Write down the signature of that method. Write down an example call to that method on a String variable called text.**
   - The signature of the trim method: public String trim()
     ```java
     String text = "  Some Text!  ";
     System.out.println( text.trim() );
     ```
 - **5.8 Implement this improvement in your version of the tech-support1 project. Test it to confirm that it is tolerant of extra space around the word ‘bye’.** 
   - Done see file [see file](main/SupportSystem.java), line 43
 
 - **5.9 Improve the code of the SupportSystem class in the tech-support1 project so that case in the input is ignored. Use the String class’s toLowerCase method to do this. Remember that this method will not actually change the String it is called on, but result in the creation of a new one being created with slightly different contents.** 
   - Done see file [see file](main/SupportSystem.java), line 43
 
 - **5.10 Find the equals method in the documentation for class String . What is the return type of this method?**
   - ```java
     boolean
     ```
 
 - **5.11 Change your implementation to use the equals method instead of startsWith .**
   - Done see file [see file](main/SupportSystem.java), line 45
 
 - **5.12 Find the class Random in the Java class library documentation. Which pack- age is it in? What does it do? How do you construct an instance? How do you generate a random number? Note that you will probably not understand everything that is stated in the documentation. Just try to find out what you need to know.**
   - Random is in package: `java.util.Random`
   - It gets pseudo-random bytes.
   
 - **5.13 Write a small code fragment (on paper) that generates a random integer number using this class.**
   - Getting an random integer: 
    ```java 
    (new Random()).nextInt();
    // Or
    Random qbit = new Random();
    random.nextLong();
    ```
    
 - **5.14 Write some code (in BlueJ) to test the generation of random numbers. To do this, create a new class called RandomTester . You can create this class in the tech-support1 project, or you can create a new project for it—it doesn’t matter. In class RandomTester , implement two methods: printOneRandom (which prints out one random number) and printMultiRandom(int howMany) (which has a parameter to specify how many num- bers you want, and then prints out the appropriate number of random numbers).**  
   ```java
   public class nsa
   {
      Random onwillekeurig = new java.util.Random();
   
      public void printRand()
      {
           System.out.printf( "Pseudo-random number generated: %d", onwillekeurig.nextInt() );
      }
   }
   ```
   
 - 5.15 Anny numbers between 0 up to and including 99
 - 5.16
    ```java
    public void randomTester()
    {
        return (new Random()).nextInt(6)+1;
    }
    ```
 - 5.17
     ```java
    public void getResponse()
    {
        int rNum = (new Random()).nextInt(3);
        string response = (rNum == 2) ? "maybe" : rNum ? "no" : "yes";
     
    }
     ```
 - 5.18
```java
public void getResponse()
{
    ArrayList rSeq = new ArrayList
 int rNum = (new Random()).nextInt(3);
 string response = (rNum == 2) ? "maybe" : rNum ? "no" : "yes";

}
```
 - 5.19
 - 5.20
 - 5.21
 - 5.22
 - 5.23
 - 5.24
 - 5.25
 - 5.26
 - 5.27
 - 5.28
 - 5.29
 - 5.30
 - 5.31
 - 5.32
 - 5.33
 - 5.34
 - 5.35
 - 5.36
 - 5.37
 - 5.38
 - 5.39
 - 5.41
 - 5.42
 - 5.43
 - 5.46
 - 5.47
 - 5.48
 - 5.49
 - 5.50
 - 5.51
 - 5.52
 - 5.53
 - 5.54
 - 5.55
 - 5.56
 - 5.57
 - 5.58
 - 5.59
 - 5.60
 - 5.61
 - 5.62
 - 5.63
 - 5.64
 - 5.65
 - 5.66
 - 5.67
 - 5.68
 - 5.69
 - 5.70
 - 5.72
 - 5.73