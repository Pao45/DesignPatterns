package phone;

public abstract class Union implements DispositivoT {
	
	protected DispositivoT dispositivo;
	
	public Union(DispositivoT dispositivo)
	{
		this.dispositivo = dispositivo;
	}

	
	public void seleccionar() {
		   dispositivo.seleccionar();
		}
}