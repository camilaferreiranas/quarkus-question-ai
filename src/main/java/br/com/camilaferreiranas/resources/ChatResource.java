package br.com.camilaferreiranas.resources;


import br.com.camilaferreiranas.interfaces.ChatAssistant;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class ChatResource {

    @Inject
    private ChatAssistant chatAssistant;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String chat(String pergunta) {
        return chatAssistant.responder(pergunta);
    }
}
