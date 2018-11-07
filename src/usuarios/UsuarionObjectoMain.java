package usuarios;

public class UsuarionObjectoMain {

	public static void main(String[] args) {
		
		Usuario usuario1 = Usuario.init();
		Usuario usuario2 = Usuario.init("elbenavi", "432");
		Usuario usuario3 = Usuario.init("sblinar", "9873", "juan");
		Usuario usuario4 = Usuario.init("lperez", "87492", "Luis", 28);
		
		System.out.println(usuario1 + "\n");
		System.out.println(usuario2 + "\n");
		System.out.println(usuario3 + "\n");
		System.out.println(usuario4 + "\n");
	}

}
