package phone;

public class Negro extends Union{
	
	public Negro(DispositivoT dispositivo)
	{
		super(dispositivo);
	}
	

	@Override
	public void seleccionar(){
		dispositivo.seleccionar();
		setColor(dispositivo);
	}
	
	public void setColor(DispositivoT dispositivo)
	{
		System.out.println("El color negro ha sido seleccionado con un costo de 70 usd");		
	}

	@Override
	public void tPlug() {
	}
}
