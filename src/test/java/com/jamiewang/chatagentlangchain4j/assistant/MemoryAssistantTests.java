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
}
