import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	protected UsuarioTest usuarios;
	
	UsuarioTest usuarios() {
		return null;
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.usuarios = new UsuarioTest();
	}

	@Test
	void testaCpf() {
		Usuario usuario = new Usuario("Timmers","2312","4005001010");
		assertEquals("4005001010", usuario.getCpf());
	}
	
	@Test
	void testaCpfIgual() {
		Usuario usuario1 = new Usuario("Timmers","2312","4005001010");
		Usuario usuario2 = new Usuario("Timmers","2312","4005001010");
		assertEquals(usuario1.getCpf(), usuario2.getCpf());
	}

}
