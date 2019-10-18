package co.edu.usbcali.bank.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.usbcali.bank.domain.TipoDocumento;
import co.edu.usbcali.bank.dto.TipoDocumentoDTO;

@Mapper
public interface TipoDocumentoMapper {

	TipoDocumentoDTO tipoDocumentoToDocumentoDTO(TipoDocumento tipoDocumento);

	TipoDocumento tipoDocumentoDTOToDocumento(TipoDocumentoDTO tipodocumentoDTO);

	List<TipoDocumentoDTO> toTipoDocumentoDTO(List<TipoDocumento> listTipoDocumento);

	List<TipoDocumento> toTipoDocumento(List<TipoDocumentoDTO> listTipoDocumentoDTO);
}
