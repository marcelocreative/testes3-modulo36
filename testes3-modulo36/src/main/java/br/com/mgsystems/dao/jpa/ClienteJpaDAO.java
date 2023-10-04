package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.mgsystems.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
