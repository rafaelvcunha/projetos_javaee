package br.com.rafaelvcunha.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.rafaelvcunha.business.AgendamentoEmailBusiness;

@Path("/agendamentoemail")
public class AgendamentoEmailResource {

	@Inject
	private AgendamentoEmailBusiness agendamentoEmailBusiness;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAgendamentoEmail() {
	
		List<String> emails = agendamentoEmailBusiness.listarAgendamentosEmail(); 
		
	return Response.ok(emails).build();	
	}
	
}
