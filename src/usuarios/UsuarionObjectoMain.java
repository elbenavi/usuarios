package usuarios;

public class UsuarionObjectoMain {

	public static void main(String[] args) {				
		
		
		Usuario usuario2 = Usuario.init("elbenavi", "432");	
		
		System.out.println(usuario2);
		System.out.println(usuario2.getUsuario());
		System.out.println(usuario2.getEdad());
		
	}

}
