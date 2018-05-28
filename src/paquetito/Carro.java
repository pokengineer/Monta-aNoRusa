package paquetito;

public class Carro {
	private Posicion pos;
	private double energia;

	public Carro( Posicion n) {
		this.pos = n;
		this.energia = 0;
	}
	
	public void viajar(Posicion obj) {
		if (pos.getY() > obj.getY()) { 	
			//baja
			this.pos.setX(pos.getX() + ( pos.getY() - obj.getY() ) );
			this.energia += ( pos.getY() - obj.getY());
			this.pos.setY(obj.getY());
			
		} else { 						
			//sube
			if ( --this.energia >= obj.getY() - pos.getY()) {
				//puede subir
				this.pos.setX( pos.getX() + ( obj.getY() - pos.getY() ) );
				this.energia -= (double)( obj.getY() - pos.getY());
				this.pos.setY( obj.getY() );
			
			} else {
				//no puede subir
				this.pos.setX( pos.getX() + this.energia );	
				this.pos.setY( pos.getY() + this.energia );			
				this.energia = 0;
			
			}
		}
	}
	
	public Posicion getPos() { return pos; }
	public boolean tieneEnergia() { 
		return ((this.energia != 0)||(this.pos.getX()==0)); 
	}
}
