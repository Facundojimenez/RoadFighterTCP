package auto;

import mapa.Mapa;

public class AutoJugador extends ModoAuto {

	private static final int VELOCIDAD_INICIAL = 0;

	@Override
	public void acelerar() {
		this.velocidad += VELOCIDAD_INICIAL + 180;
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desplazarse(Mapa ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public void colisiona() {
		// TODO Auto-generated method stub
		
	}

}
