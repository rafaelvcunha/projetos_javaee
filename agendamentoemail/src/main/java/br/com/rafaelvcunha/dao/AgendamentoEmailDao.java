package br.com.rafaelvcunha.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelvcunha.entity.AgendamentoEmail;

@Stateless
public class AgendamentoEmailDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<AgendamentoEmail> listarAgendamentosEmail(){
		return entityManager
				.createQuery("select a from AgendamentoEmail", AgendamentoEmail.class)
				.getResultList();
	}
	
	public void salvarAgendamentoEmail( AgendamentoEmail agendamentoEmail) {
		entityManager.persist(agendamentoEmail);
	}
}
