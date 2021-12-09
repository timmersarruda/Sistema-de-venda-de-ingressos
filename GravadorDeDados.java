import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GravadorDeDados {

	public static final String ARQUIVO_USUARIOS = "usuarios.txt";
	ObjectInputStream in = null;
	
	public GravadorDeDados() {
		
	}
	
	public Collection<Usuario> recuperarUsuarios() throws IOException{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_USUARIOS))){
			return (Collection<Usuario>)in.readObject();
		}catch(ClassNotFoundException e) {
			throw new IOException(e);
		}
	}
	
	public void gravarUsuarios (Collection<Usuario> usuarios) throws IOException{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_USUARIOS))){
			out.writeObject(usuarios);
		} catch (Exception e){
			throw new IOException(e);
		}
	}
	
}

