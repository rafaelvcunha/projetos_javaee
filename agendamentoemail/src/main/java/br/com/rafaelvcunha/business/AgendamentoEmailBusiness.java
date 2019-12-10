package br.com.rafaelvcunha.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class AgendamentoEmailBusiness {
	
	public List<String> listarAgendamentosEmail(){
		
		List<String> emails = new ArrayList<>();
		emails.add("teste1@email.com");
		emails.add("teste2@email.com");
		
		return emails;
	}

}
