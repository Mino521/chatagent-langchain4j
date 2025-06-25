package com.jamiewang.chatagentlangchain4j.assistant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemoryAssistantTests {
    @Autowired
    private MemoryAssistant memoryAssistant;

    @Test
    public void testChatMemory4() {
        String answer1 = memoryAssistant.chat("I am Jamie");
        System.out.println(answer1);
        String answer2 = memoryAssistant.chat("Who am I?");
        System.out.println(answer2);
    }

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSeparateChatAssistant() {
        String answer1 = separateChatAssistant.chat(1, "I am Jamie");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat(2, "Who am I?");
        System.out.println(answer2);
        String answer3 = separateChatAssistant.chat(1, "Who am I?");
        System.out.println(answer3);
    }
}
