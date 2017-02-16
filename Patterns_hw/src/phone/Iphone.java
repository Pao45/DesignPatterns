package phone;

public class Iphone extends Dispositivo implements DispositivoT {


    public Iphone()
    {
    	photocamera = new _10mgpxcamera();
    	conectorUSB = new USAPlug();
    }
    
    @Override
	public void seleccionar()
	{
		
	}
	
	@Override
	public void tPlug() {
		
		
	}
}
