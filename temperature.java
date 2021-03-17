public class temperature  
{  
	public static void main (String args[])  
    {
		//Declaration statements:
		float Fahrenheit;	//temperature in fahrenheit
		float Celsius;  	//temperature in celsius
		System.out.println("Program by: Ashit");
		System.out.println();
		System.out.println("This program will take Celsius temperature and return the converted");
		System.out.println("temperature in Fahrenheit");
		Celsius = 20;
		//Prompt and read in the temperature in cels
        Fahrenheit =((Celsius*9)/5)+32;  
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }}  