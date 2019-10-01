package co.edu.usbcali.demo.dao;

import java.util.List;

import co.edu.usbcali.demo.domain.Cliente;

public interface ClienteDAO {
  
  public Cliente guardar(Cliente cliente);
  public Cliente actualizar(Cliente cliente);
  public void eliminar(Cliente cliente);
  public Cliente buscarPorIdentificador(Integer identificador);
  public List<Cliente> listarClientes();

}
