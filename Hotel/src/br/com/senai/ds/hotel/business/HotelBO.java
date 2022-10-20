package br.com.senai.ds.hotel.business;

import java.util.List;

import br.com.senai.ds.hotel.dao.HotelDAO;
import br.com.senai.ds.hotel.domain.Cliente;

public class HotelBO {

	private static boolean usuarioExiste(Cliente cliente) {
		List<Cliente> clientes = HotelDAO.listarClientes();

		if (clientes.contains(cliente)) {
			return true;
		}

		return false;

	}

	public static void salvarUsuario(Cliente cliente) {

		if (usuarioExiste(cliente) == false) {
			HotelDAO.salvarCliente(cliente);
			System.out.println("Usuario adicionado com sucesso!");
		} else {
			System.out.println("O usuario já existe!");
		}
	}

	public static List<Cliente> Listar() {
		return HotelDAO.listarClientes();
	}
	
	public static void removerUsuario(Cliente cliente) {
		HotelDAO.removerUsuario(cliente);
	}
}
