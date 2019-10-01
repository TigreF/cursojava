package co.edu.usbcali.demo.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.edu.usbcali.demo.domain.Cliente;

@Repository
@Scope("singleton")
public class ClienteDAOImpl implements ClienteDAO {

  @Override
  public Cliente guardar(Cliente cliente) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Cliente actualizar(Cliente cliente) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void eliminar(Cliente cliente) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Cliente buscarPorIdentificador(Integer identificador) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Cliente> listarClientes() {
    // TODO Auto-generated method stub
    return null;
  }

}
