package Ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuArreglos {
	
	public static void main(String[] args){ 
	
	Scanner teclado = new Scanner(System.in);
	
	int i=0;
	int usuariosRegistrar = 0;
	String usuarios[] = null;
	String passwords[] = null;
			
	while (i !=5){
		System.out.println("Eliga una opcion utilizando un numero");
		
		System.out.println("1) REGISTRAR USUARIOS");
		System.out.println("2) ACTUALIZAR USUARIOS");
		System.out.println("3) LOGIN");
		System.out.println("4) VER USUARIOS");
		System.out.println("5) SALIR");
		
	
	i = teclado.nextInt();
	

	//Comienza Switch
	
	switch(i){
	//Registro de Usuarios
	case 1:
		System.out.println("Cuantos usuarios desea registrar?");
		usuariosRegistrar=teclado.nextInt();
		 usuarios= new String[usuariosRegistrar];
		 passwords= new String[usuariosRegistrar];
		
		for(i=0; i<usuariosRegistrar; i++){
			System.out.println("Introduzca el nombre del usuario");
			usuarios[i]= teclado.next();
			System.out.println("Introduzca la contraseña del usuario");
			passwords[i]= teclado.next();
			
		}
		
		
		System.out.println("Caso 1");
		break;
	case 2:
		System.out.println("Caso 2");
		break;
	case 3:
		System.out.println("Ingrese su Usuario");
		String introUsuario = teclado.next();
		
		System.out.println("Ingrese su Contraseña");
		String introPass = teclado.next();
		
		for(i=0; i<usuariosRegistrar;i++){
			
			if(introUsuario.equals(usuarios[i])){
				
				if(introPass.equals(passwords[i])){
					System.out.println("¡¡¡Login Correcto!!!");
				}
			}
		}
			
			
		break;
	case 4:
		System.out.println("Caso 4");
		break;
	case 5:
		System.out.println("Caso 5");
		break;
	}
	
	}
	}

}