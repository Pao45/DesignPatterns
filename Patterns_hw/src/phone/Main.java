package phone;

public class Main {

	public static void main(String[] args) {
		
		Dispositivo samsung = new Samsung();
	    Dispositivo iphone = new Iphone();
       
		
		System.out.println("Samsung: " +samsung.tryingtoconnectvideo());
		System.out.println("Samsung: " +samsung.choosingPlug()+"\n\n");
		System.out.println("Iphone: " +iphone.tryingtoconnectphoto());
		System.out.println("Iphone: " +iphone.choosingPlug()+"\n\n");
		
		DispositivoT IphoneNegro = new Negro(new Iphone());
		DispositivoT SamnsungBlanco = new Blanco(new Samsung());
		DispositivoT IphoneBlanco = new Blanco(new Iphone());
		
		IphoneNegro.seleccionar();
		SamnsungBlanco.seleccionar();
		IphoneBlanco.seleccionar();
	}

}
