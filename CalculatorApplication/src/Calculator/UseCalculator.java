/*- Class Use Calculator is the Main Class for the Calculator Application
- Provides options to the user: Basic or Scientific Calculator*/
// Adds the class to the Package
package Calculator;
// Imports Required Packages
import java.io.*;
// Class Definition
class UseCalculator
{
public static void main(String[] args) throws java.io.IOException
{
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
// Gets User Input
System.out.println("Select the Calculator: Basic - B or Scientific - S.");
System.out.flush();
String option=buffer.readLine();
if(option.length()==1)
{
if(option.equals("B") || option.equals("b"))
{
// Calls the Basic Calculator Application
Calculator c=new Calculator();
c.Calc();
}
else if(option.equals("S") || option.equals("s"))
{
// Calls the Scientific Calculator Application
ScientificCalculator sc=new ScientificCalculator();
sc.Calc();
}
else
{
System.out.println("*** Please enter option 'B' or 'S'. ****");
}
}
else
{
System.out.println("***Please enter option 'B' or 'S.***");
}
}
}
