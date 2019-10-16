package co.edu.usbcali.bank.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import co.edu.usbcali.bank.domain.Cliente;
import co.edu.usbcali.bank.repository.TipoDocumentoRepository;
import co.edu.usbcali.bank.service.ClienteService;

@SpringBootTest
@Rollback(false)
class ClienteServiceTest {
	
	private final static Logger log = LoggerFactory.getLogger(ClienteServiceTest.class);

	private final static Long clieId = 4560L;

	@Autowired
	ClienteService clienteService;

	@Autowired
	TipoDocumentoRepository documentoRepository;

	@Test
	@DisplayName("save")
	void aTest() {

		assertNotNull(clienteService);
		assertNotNull(documentoRepository);

		Cliente cliente = new Cliente();
		cliente.setActivo("S");
		cliente.setClieId(clieId);
		cliente.setEmail("j@gmail.com");
		cliente.setDireccion("uni san buenaventura");
		cliente.setNombre("Fiayi�o");
		cliente.setTelefono("321255552");
		assertTrue(documentoRepository.findById(1L).isPresent(), "el tipo de documento no existe");
		cliente.setTipoDocumento(documentoRepository.findById(1L).get());

		try {
			clienteService.save(cliente);

		} catch (Exception e) {
			assertNull(e, e.getMessage());
		}

	}

	@Test
	@DisplayName("update")
	void cTest() {

		assertNotNull(clienteService, "El clienteService es nulo");
		assertTrue(clienteService.findById(clieId).isPresent());

		Cliente cliente = clienteService.findById(clieId).get();
		cliente.setActivo("N");

		try {
			clienteService.update(cliente);

		} catch (Exception e) {
			assertNull(e, e.getMessage());
		}

	}

	@Test
	@DisplayName("delete")
	void dTest() {

		assertNotNull(clienteService, "El clienteService es nulo");
		assertTrue(clienteService.findById(clieId).isPresent());

		Cliente cliente = clienteService.findById(clieId).get();

		try {
			clienteService.delete(cliente);

		} catch (Exception e) {
			assertNull(e, e.getMessage());
		}

	}

	@Test
	@DisplayName("findByName")
	void findByName() {

		assertNotNull(clienteService, "El clienteService es nulo");
		
		String nombre="Jerrie Cannell";
		List<Cliente> clientes=clienteService.findByNombre(nombre);
		
		for (Cliente cliente : clientes) {
			
			log.info("Id: "+cliente.getClieId());
			log.info("Id: "+cliente.getNombre());
			
		}
		
	}
	
	@Test
	@DisplayName("findByNameLike")
	void findByNameLike() {

		assertNotNull(clienteService, "El clienteService es nulo");
		
		String nombre="%Jerrie%";
		List<Cliente> clientes=clienteService.findByNombreLike(nombre);
		
		for (Cliente cliente : clientes) {
			
			log.info("Id: "+cliente.getClieId());
			log.info("Id: "+cliente.getNombre());
			
		}
		
	}

}
