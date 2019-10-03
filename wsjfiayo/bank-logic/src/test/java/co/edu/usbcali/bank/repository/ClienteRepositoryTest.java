package co.edu.usbcali.bank.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/applicationContext.xml")
@Rollback(false)
class ClienteRepositoryTest {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	TipoDocumentoRepository documentoRepository;

	private final static Long clieId = 4560L;
	private final static Logger log = LoggerFactory.getLogger(ClienteRepositoryTest.class);

	@Test
	@DisplayName("save")
	void test() {
		assertNotNull(clienteRepository);
		assertNotNull(documentoRepository);
	}

}
