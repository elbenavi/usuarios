package usuarios;

import java.util.Scanner;

public class UsuarioMain {

	// una sola linea
	
	/*
	 * multiples
	 * lineas 
	 * de codigo
	 * 
	 * */
	static Scanner sc = new Scanner(System.in); 
	
	
	public static void main(String[] args) {				
		
		System.out.println("Por favor Ingrese el usuario: ");
		String usuario = sc.nextLine();
		
		System.out.println("Por favor Ingrese la contraseña: ");
		String contrasena = sc.nextLine();
		
		System.out.println("Por favor Ingrese el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Por favor Ingrese la edad: ");
		//int edad = Integer.parseInt( sc.nextLine() );
		int edad = validarEdad();
		
		System.out.println("El usuario: '" + usuario + "' \ncontraseña: '" + contrasena + "' \nnombre: '" + nombre + "' \nedad: " + edad);
		//System.out.println(  String.format("El usuario: '%s' \nconstraseña: '%s' \nnombre: %s \nedad: '%s'", usuario, contrasena, nombre, edad)   );
		
	}
	
	
	public static int validarEdad() {
		try {
			int edad = Integer.parseInt( sc.nextLine() );
			
			while(edad < 0) {
				System.out.println("La edad no puede ser negativa, vuelve a ingresar la edad");
				edad = Integer.parseInt( sc.nextLine() );
			}
			
			return edad;
//			if(edad >= 0) {
//				return edad;
//			}else {
//				System.out.println("Ingresaste un valor negativo, por lo que se seteo la edad en 0");
//				return 0;
//			}
			//return Integer.parseInt( sc.nextLine() );
			
		}catch(java.lang.NumberFormatException e) {
			System.out.println("El valor que ingresaste no es númerico o esta vacío");			
		}catch (Exception e) {
			System.out.println("ocurrio un error");			
		}
		System.exit(0);
		return 0;
	}
}
