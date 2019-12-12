package br.com.rafaelvcunha.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.rafaelvcunha.business.AgendamentoEmailBusiness;
import br.com.rafaelvcunha.entity.AgendamentoEmail;

@Path("/agendamentoemail")
public class AgendamentoEmailResource {

	@Inject
	private AgendamentoEmailBusiness agendamentoEmailBusiness;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAgendamentoEmail() {
	
		List<AgendamentoEmail> emails = agendamentoEmailBusiness.listarAgendamentosEmail(); 
		
	return Response.ok(emails).build();	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarAgendamentoEmail( AgendamentoEmail agendamentoEmail ) {
		agendamentoEmailBusiness.salvarAgendamentoEmail(agendamentoEmail);
		return Response
				.status(201)
				.build();
	}
	
}
