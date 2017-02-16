
package phone;

public class Blanco extends Union{

	public Blanco(DispositivoT dispositivo)
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
		
		System.out.println("El color blanco ha sido seleccionado con un costo de 80 usd");
		
	}


	@Override
	public void tPlug() {
		// TODO Auto-generated method stub
		
	}

}