package co.edu.usbcali.bank.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.edu.usbcali.bank.domain.TipoDocumento;
@ExtendWith(SpringExtension.class)
@ContextConfiguration("/applicationContext.xml")
@Rollback(false)
class TipoDocumentoRepositoryTest {


	
	@Autowired
	TipoDocumentoRepository documentoRepository;

	private final static Long tdocId = 4L;
	private final static Logger log = LoggerFactory.getLogger(TipoDocumentoRepositoryTest.class);

	@Test
	@DisplayName("insert")
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	void aTest() {
		
		assertNotNull(documentoRepository);
		assertFalse(documentoRepository.findById(tdocId).isPresent(),"el tipo de documento ya existe");

		
		TipoDocumento tipoDocumento =new TipoDocumento();
		tipoDocumento.setActivo("S");
		tipoDocumento.setNombre("C.C");
		tipoDocumento.setTdocId(tdocId);		

		documentoRepository.save(tipoDocumento);

	}

	@Test
	@DisplayName("finById")
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	void bTest() {

	
		assertNotNull(documentoRepository);
		// Optional<Cliente> clienteOptional =clienteRepository.findById(clieId);
		assertTrue(documentoRepository.findById(tdocId).isPresent(),"no existe");

	}

	@Test
	@DisplayName("update")
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	void cTest() {

	
		assertNotNull(documentoRepository);
		assertTrue(documentoRepository.findById(tdocId).isPresent());

		TipoDocumento tipoDocumento = documentoRepository.findById(tdocId).get();
		
		tipoDocumento.setNombre("T.I");;
		documentoRepository.save(tipoDocumento);

	}

	@Test
	@DisplayName("delete")
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	void dTest() {

		
		assertNotNull(documentoRepository);
		assertTrue(documentoRepository.findById(tdocId).isPresent());
	TipoDocumento tipoDocumento = documentoRepository.findById(tdocId).get();
	documentoRepository.delete(tipoDocumento);

	}

	@Test
	@DisplayName("listAll")
	@Transactional(readOnly = true)
	void eTest() {

		
		assertNotNull(documentoRepository);

		List<TipoDocumento> losTipoDoc = documentoRepository.findAll();

		assertNotNull(losTipoDoc);
		assertFalse(losTipoDoc.isEmpty());

		for (TipoDocumento tipoDocumento : losTipoDoc) {
			log.info(tipoDocumento.getNombre());

		}

		losTipoDoc.forEach(t -> {
			log.info(t.getTdocId().toString());
		});
	}

}
