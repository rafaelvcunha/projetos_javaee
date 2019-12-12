package br.com.rafaelvcunha.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.rafaelvcunha.dao.AgendamentoEmailDao;
import br.com.rafaelvcunha.entity.AgendamentoEmail;

@Stateless
public class AgendamentoEmailBusiness {
	
	@Inject
	private AgendamentoEmailDao agendamentoEmailDao;
	
	public List<AgendamentoEmail> listarAgendamentosEmail(){
		
		/*List<String> emails = new ArrayList<>();
		emails.add("teste1@email.com");
		emails.add("teste2@email.com");*/
		
		return agendamentoEmailDao.listarAgendamentosEmail();
	}
	
	public void salvarAgendamentoEmail( AgendamentoEmail agendamentoEmail) {
		agendamentoEmail.setEnviado(Boolean.FALSE);
		agendamentoEmailDao.salvarAgendamentoEmail(agendamentoEmail);
	}

}
