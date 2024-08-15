package arraysDemo;

import java.util.Scanner;

//Array in java is a group of like-typed variables referred to by a common name. 

//public class ArrayDemo{

//    public static void main(String[] args){
//       int array[] = new int[7];
//       for (int count=0;count<7;count++){
//    	  array[count]=count+1;
//          System.out.println("array["+count+"] = "+array[count]);        
//          
//      }
//       
//       System.out.println("Lenght of array = "  +array.length);

//      for (int count=0;count<7;count++){
//          System.out.println("array["+count+"] = "+array[count]);
//      }
//System.out.println("Length of Array  =  "+array.length);
// array[8] =10;
//     }
// public class CFG{   
//    public static void main(String[] args) {
//    	int array[] = new int[5];
//    	array[0] = 10;
//    	array[1] = 20;
//    	array[2] = 30;
//    	array[3] = 40;
//    	array[4] = 50;
//    	
//    	for (int i= 0; i < array.length; i++)
//    		System.out.println("Element at index " + i  + " : " + array[i]);
//    }
// }   
//public class CFG{
//	public static void main(String[] args){
//	
//	int array[] = new int[3];
//	
//	array[0] = 10;
//	array[1] = 20;
//	array[2] = 30;
//	
//	for(int i = 0; i < array.length; i++)
//
//	System.out.println("El index del array es: " + i + " y su valor es: " + array[i]);
//	
//	}
//}

//    class Student{
//    	public int roll_no;
//    	public String name;
//    	Student(int roll_no, String name)
//    	{
//    		this.roll_no = roll_no;
//    		this.name = name;
//    	}
//    }
//    
//    public class CFG{
//    	public static void main(String[] args)
//    	{
//    	Student[] arr;
//    	arr = new Student[5];
//    	arr[0] = new Student(1, "aman");
//    	arr[1] = new Student(2, "vaibhav");
//    	arr[2] = new Student(3, "shikar");
//        arr[3] = new Student(4, "dharmesh");
//        arr[4] = new Student(5, "mohit");
//    	
//    	for (int i = 0; i < arr.length; i++)
//    		System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
//    	}
//    }

//    public class CFG {
//    	public static void main(String[] args)
//    	{
//    		int[] arr = new int[2];
//    		arr[0] = 10;
//    		arr[1] = 20;
//    		
//    		for (int i = 0; i < arr.length; i++)
//    			System.out.println(arr[i]);
//    	}    	
//    }
//
//public class ArrayDemo{
//	public static void main(String args[])
//	{
//		int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++)
//				
//				System.out.println(arr[i][j] + " " );
//			System.out.println();
//		}
//	}

//	// Fix to reverse a string
//	public class Main {
//	    public static void main(String[] arg) {
//	        System.out.println(reverse("java"));
//	    }
//
//	    public static String reverse(String in){
//	        if (in == null)
//	            throw new IllegalArgumentException("Null is not valid input");
//	        StringBuilder out = new StringBuilder();
//	        char[] chars = in.toCharArray();
//	        for (int i = chars.length - 1; i >= 0; i--)
//	            out.append(chars[i]);
//	        return out.toString();
//	    }
//	}

////Reverse String
//public class Main{
//	public static void main(String[] args){
//    	String originalStr = "Hellow world"; 
//        String reversedStr = "";
//        System.out.println("original string: " + originalStr);
//        
//        for(int i = 0; i < originalStr.length(); i++){
//        reversedStr = originalStr.charAt(i) + reversedStr;
//        }
//        
//        System.out.println("Reversed String: " + reversedStr);
//        
//        
//    }
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int numbers[] = new int[3];
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Escribe el numero: ");
//			numbers[i] = sc.nextInt();
//		}
//
//		System.out.println("El numero es: " + numbers[2]);
//	}
//}

//public class Main{
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int contador[] = new int[5];
//		
//		for(int i = 0; i < contador.length; i++) {
//			System.out.println("Introduce el numero: ");
//			contador[i] = sc.nextInt();	
//			
//			
//		}
//		
//		System.out.println("El numero introducido fue: " + contador[0]);	
//		System.out.println("El numero introducido fue: " + contador[1]);	
//		System.out.println("El numero introducido fue: " + contador[2]);	
//		System.out.println("El numero introducido fue: " + contador[3]);	
//		System.out.println("El numero introducido fue: " + contador[4]);	
//		
//	}
//}

//public class Main {
//
//	public static void main(String[] args) {
//
//		String originalSt = "Hello";
//		String reverseSt = "";
//
//		for (int i = 0; i < originalSt.length(); i++) {
//			reverseSt = originalSt.charAt(i) + reverseSt;
//		}
//		
//		System.out.println("Reverser String: " + reverseSt);
//	}
//
//}

////Numero veces letra en texto
//public class Main {
//
//	public static void main(String[] args) {
//
//		@SuppressWarnings("resource")
//		Scanner lector1 = new Scanner(System.in);
//		@SuppressWarnings("resource")
//		Scanner lector2 = new Scanner(System.in);
//
//		System.out.println("Introduce una frase:");
//		String frase = lector1.nextLine();
//		System.out.println("Introduce una letra:");
//		String letra = lector2.next();
//		int cont = 0;
//
//		for (int i = 0; i < frase.length(); i++) {
//			if (frase.charAt(i) == letra.charAt(0)) {
//				cont++;
//
//			}
//
//		}
//
//		System.out.println("la letra: " + letra.charAt(0) + " aparece " + cont + " veces");
//
//	}
//}

////Notas de estudiantes
//public class Main {
//
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//
//		String nombre[] = new String[3];
//		int calificacion[] = new int[3];
//
//		calificacion[0] = 70;
//		calificacion[1] = 80;
//		calificacion[2] = 90;
//
//		nombre[0] = "Pedro";
//		nombre[1] = "Pablo";
//		nombre[2] = "Juan";
//
//		System.out.println("Introdusca el nombre del alumno: ");
//		String alumno = sc.nextLine();
//
//		for (int i = 0; i < 3; i++) {
//			if (nombre[i].equals(alumno)) {
//				System.out.print("La calificacion del alumno es: " + calificacion[i]);
//			}			
//		}
//		
//	}
//}


//invertir String con methodo Scanner
//public class Main{
//	
//	public static void main(String[] args) {
//		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introdusca la frase a invertir: ");
//		
//		String frase = sc.nextLine();
//		String fi = "";
//		
//		
//		for(int i = 0; i < frase.length(); i++) {
//			fi = frase.charAt(i) + fi;
//								
//		}
//		System.out.println("La frase invertida es: " + fi);
//		
//	}
//}

public class Main{
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[9];
		
		
		for(int i = 0; i < 9; i++) {
		System.out.println("Ingresa el numero: ");
		numeros[i] = sc.nextInt();		
		
		}
		
		System.out.println("Los valores del array son: " + numeros);

		
		
	}
}





