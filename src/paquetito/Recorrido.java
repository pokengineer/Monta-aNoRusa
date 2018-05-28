package paquetito;

public class Recorrido {

	private Posicion[] array;
	
	public static void main(String[] args) {
		Recorrido mnr = new Recorrido();
		mnr.levantarRecorrido();
		Carro car = new Carro( mnr.array[0] );
		for( int i = 1 ; i < mnr.array.length && car.tieneEnergia(); i++ )
		{
			car.viajar( mnr.array[i] );
		}
		System.out.println( (car.getPos()).toString() );
	}

	
	
	private void levantarRecorrido() {
		array = new Posicion[7];
		array[0] = new Posicion(50); 
		array[1] = new Posicion(10);
		array[2] = new Posicion(30);
		array[3] = new Posicion(5);
		array[4] = new Posicion(35);
		array[5] = new Posicion(10);
		array[6] = new Posicion(50);
	}
	

}
