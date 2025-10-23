package br.com.camilaferreiranas.interfaces;

import io.quarkiverse.langchain4j.RegisterAiService;


@RegisterAiService
public interface ChatAssistant {

    String responder(String pergunta);
}
