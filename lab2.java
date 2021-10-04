import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

//Francisco Esgardo Escobar Munguia
//A00223609
//Mobile App Development
//Lab 2


// Caesar Cipher

public class lab2 {
// this code assigns a number to each letter of the alphabet
public static String encrypt(String plainText, int shift){
if(shift>26){
  shift = shift%26;
}
else if(shift<0){
  shift = (shift%26)+26;
}
//  code to check if the charac ter is contained and also if it is lower case or upper case
String cipherText = "";
int lenght = plainText.length();
for(int i=0; i<lenght; i++){
  char ch = plainText.charAt(i);
  if(Character.isLetter(ch)){
    if(Character.isLowerCase(ch)){
      char c = (char)(ch+shift);
      if(c>'z'){
        cipherText += (char)(ch - (26-shift));
      }
      else{
        cipherText+= c;
      }
    }
    else if(Character.isUpperCase(ch)){
      char c = (char)(ch+shift);
      if(c>'Z'){
        cipherText += (char)(ch - (26-shift));
      }
      else{
        cipherText+= c;
      }
    }
}
else{
  cipherText += ch;
}
}
return cipherText;
}

public static void main(String[] args) {
Scanner text = new Scanner(System.in);
String input;
System.out.println("Enter your Text: ");
input = text.nextLine();

System.out.println("Enter a Value to encrypt with: ");
Scanner value = new Scanner(System.in);
int enc = value.nextInt();

String cipher = encrypt(input, enc);
System.out.println(cipher);

// Average of an array
Scanner size = new Scanner(System.in);

System.out.println("How long will your array be? ");

int n =size.nextInt();

int numbers[] =new int[n];

System.out.println("enter elements for array: ");

for(int i=0;i<n;i++){//for reading array
    numbers[i]=size.nextInt();

}

int sum = 0;
for(int i=0; i < numbers.length ; i++)
 sum = sum + numbers[i]; //variable to add numbers of the array

 float average = sum / numbers.length; // variabble to get average
 System.out.println("Average value of the array elements is : " + average);


// Get the value to be searched
System.out.println("Enter a value to search for:  ");
Scanner check = new Scanner(System.in);
int toCheckValue = value.nextInt();


// Print the array
System.out.println("Array: "
                   + Arrays.toString(numbers));

check(numbers, toCheckValue);
}

// Function return true if given element is found in array or false if not
private static void check(int[] numbers, int toCheckValue)
{
  boolean test = false;
  for (int element : numbers) {
      if (element == toCheckValue) {
          test = true;
          break;
      }
  }

  // Print the result
  System.out.println("Is " + toCheckValue
                     + " present in the array? : " + test);


  //Print Reverse Array

  //print original array
  System.out.println("Original Array:");
  for(int i=0;i<numbers.length;i++)
       System.out.print(numbers[i] + "  ");

  System.out.println();

  //print array backward
  System.out.println("Original Array printed in reverse order:");
       for(int i=numbers.length-1;i>=0;i--) //i-- makes the array to print backward
       System.out.print(numbers[i] + "  ");

}
}
