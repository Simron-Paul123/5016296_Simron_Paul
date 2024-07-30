/*
 * 
 * Exercise 3: Implementing the Builder Pattern
Scenario: 
You are developing a system to create complex objects such as a Computer with multiple optional parts. Use the Builder Pattern to manage the construction process.
Steps:
1.	Create a New Java Project:
o	Create a new Java project named BuilderPatternExample.
2.	Define a Product Class:
o	Create a class Computer with attributes like CPU, RAM, Storage, etc.
3.	Implement the Builder Class:
o	Create a static nested Builder class inside Computer with methods to set each attribute.
o	Provide a build() method in the Builder class that returns an instance of Computer.
4.	Implement the Builder Pattern:
o	Ensure that the Computer class has a private constructor that takes the Builder as a parameter.
5.	Test the Builder Implementation:
o	Create a test class to demonstrate the creation of different configurations of Computer using the Builder pattern.

 * 
 */
import java.util.*;
public class Test {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int cpu,ram,storage;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cpu capacity: ");
        cpu=sc.nextInt();
        System.out.print("enter ram capacity: ");
        ram=sc.nextInt();
        System.out.print("enter storage capacity: ");
        storage=sc.nextInt();
        Computer.Builder builder=new Computer.Builder();
        Computer c=builder.setCPU(cpu).setRAM(ram).setStorage(storage).Build();
        System.out.println("the capacity of cpu process: "+c.getCPU()+"bit");
        System.out.println("the capacity of ram process: "+c.getRAM()+"GB");
        System.out.println("the capacity of storage process: "+c.getStorage()+"TB");
        sc.close();

    }
}
