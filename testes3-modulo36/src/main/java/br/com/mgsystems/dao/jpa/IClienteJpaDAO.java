package br.com.mgsystems.dao.jpa;

import br.com.mgsystems.dao.generic.jpa.IGenericJapDAO;
import br.com.mgsystems.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
