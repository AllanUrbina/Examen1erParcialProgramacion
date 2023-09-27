import java.util.Scanner;

public class LibroCalificaciones{
  public static void main(String[] args) {
  Scanner lector = new Scanner(System.in);
   byte intentos;

   for (intentos = 0; intentos < 3; intentos++) {
           
    System.out.print("Ingrese la cantidad de estudiantes que desea evaluar: ");
    int Estudiantes = lector.nextInt();

    if (Estudiantes <= 0) {
    System.out.println("La cantidad de estudiantes no puede ser 0 ni negativa");
            
    } else {

    int[] Notas_Estudiantes = new int[Estudiantes];

    for (int i = 0; i < Estudiantes; i++) {
                   
    System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
    int nota = lector.nextInt();
                    
    if (nota < 0 || nota > 100 ) {
    
    System.out.println("La nota no puede ser negativa ni mayor 100 ");
                        
    i--;
    
    } else {
                        
    Notas_Estudiantes[i] = nota;
                    
    }
  }

  int[] Tipo_Categoria = new int[5];
                
  for (int nota : Notas_Estudiantes) {
                    
   if (nota >= 0 && nota <= 59) {
                        
  Tipo_Categoria[0]++; 
                    
                    
    } else if (nota >= 60 && nota <= 69) {

 Tipo_Categoria[1]++; 
                   
    } else if (nota >= 70 && nota <= 79) {
                        
 Tipo_Categoria[2]++; 
                   
                    
    } else if (nota >= 80 && nota <= 89) {
                        
 Tipo_Categoria[3]++; 
                   
                    
    } else {
                       
 Tipo_Categoria[4]++; 
                    
    }
                
  }

                
  String categorias [] = {"Reprobado", "Regular", "Bueno", "Muy Bueno", "Excelente"};
                
  System.out.println("\n CATEGORÍA  : Cantidad De Estudiantes Asteriscos");
                
  for (int i = 0; i < 5; i++) {
                    
    System.out.print(categorias[i] + " (" +Tipo_Categoria[i] + ") : ");
                    
   for (int j = 0; j < Tipo_Categoria[i]; j++) {
                        
   System.out.print("*");
                   
    }
    
   System.out.println();
               
   }

                
System.out.println("\nTotal De Estudiantes Evaluados en el Grupo : " + Estudiantes );

                
   lector.close();

                
   break;

 }
  }

   if (intentos == 3) {
            
  System.out.println("Maximo de intentos");
 }  
 
 }
  }
