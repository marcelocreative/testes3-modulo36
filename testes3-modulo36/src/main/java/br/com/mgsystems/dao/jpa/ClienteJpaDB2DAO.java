package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.mgsystems.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
