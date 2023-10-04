package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.mgsystems.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
