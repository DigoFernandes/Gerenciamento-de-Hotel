package br.com.senai.ds.hotel.dao;
import br.com.senai.ds.hotel.domain.Cliente;

import java.util.List;
import java.util.ArrayList;

public class HotelDAO {

	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void salvarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public static List<Cliente> listarClientes(){
		return clientes;
	}

	public static void removerUsuario(Cliente cliente) {		
		clientes.remove(cliente);
	}
	
}
