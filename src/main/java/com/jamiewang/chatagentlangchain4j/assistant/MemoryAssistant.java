package com.jamiewang.chatagentlangchain4j.assistant;

import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatMemory = "chatMemory",
        chatModel = "openAiChatModel"
)
public interface MemoryAssistant {
    String chat(String message);
}
