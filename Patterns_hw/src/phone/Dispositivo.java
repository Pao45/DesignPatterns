package phone;

public abstract class Dispositivo {
	
public VideoCamera videocamera;
public PhotoCamera photocamera;
public ConectorUSB conectorUSB;
public Color  colorPhone;


public String tryingtoconnectphoto()
{
	return photocamera.conectar();
	
}


public String tryingtoconnectvideo()
{
	return videocamera.conectar();
	
}

public String choosingPlug()
{
	return conectorUSB.tPlug();
	
}

}


