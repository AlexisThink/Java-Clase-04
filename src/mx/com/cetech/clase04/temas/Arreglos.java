package mx.com.cetech.clase04.temas;

public class Arreglos {

	public static void main(String[] args) 
	{
/*
 * Arreglos o Matrizes
 * 
 * Son variables que separan espacio de memoria de ante mano
 * y podemos acceder a ellos, atravez de posiciones.
 * 
 *  Funcionan con todos los tipos de objetos
 */
		String nombre="Alexis";
		
		nombre = "cetech";
		// Primero pongamos lo corchetes para hacer un arreglo, tenemos que inicializar y definir las posiciones en memoria
		
		String[] nombres=new String[8];
		// Asignando valor a cada posicon
		
		nombres[0]="Brandon";
		nombres[1]="Daniel";
		nombres[2]="Paty";
		nombres[3]="Mario";
		//nombres[4]="Alexis";
		nombres[5]="Alejandro";
		nombres[6]="Hector";
		nombres[7]="Miguel";
		
		System.out.println(nombres[4]);
		
		//*****
		
		int numeros [] =new int[10];
		
		numeros[0]=26;
		numeros[1]=24;
		numeros[2]=21;
		numeros[3]=01;
		numeros[4]=04;
		numeros[5]=042;
		numeros[6]=03;
		numeros[7]=19;
		numeros[8]=123;
		
		numeros[9]=numeros[0]+numeros[2];
		
		System.out.println(numeros[9]);
		
		
		Personas listaPersonas [] = new Personas [3];
		
		Personas personaUno=new Personas();
		personaUno.altura= 1.76f;
		personaUno.edad=21;
		personaUno.nombre="Alexis";
		personaUno.ocupacion="Mercadologo";
		personaUno.peso=96f;
		personaUno.sexo='M';
		
		Personas personaDos=new Personas();
		personaDos.altura= 1.50f;
		personaDos.edad=25;
		personaDos.nombre="Patricia";
		personaDos.ocupacion="Psicologa";
		personaDos.peso=60f;
		personaDos.sexo='F';
		
		Personas personaTres=new Personas();
		personaTres.altura= 1.55f;
		personaTres.edad=22;
		personaTres.nombre="Miriam";
		personaTres.ocupacion="Informatica";
		personaTres.peso=56f;
		personaTres.sexo='F';
		
		listaPersonas[0]=personaUno;
		listaPersonas[1]=personaDos;
		listaPersonas[2]=personaTres;
		
		for(Personas itemVals:listaPersonas){
			System.out.println(itemVals.nombre);
		}
		
			String frutas[]={"Manzanas", "Durazno", "Platanos", "Sandia", "Chabacano"};
			System.out.println(frutas[4]);
	}

}
