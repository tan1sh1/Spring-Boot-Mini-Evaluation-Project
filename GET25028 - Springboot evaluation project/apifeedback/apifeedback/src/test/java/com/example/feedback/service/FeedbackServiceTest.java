package com.example.apifeedback.service;

import com.example.apifeedback.model.Feedback;
import com.example.apifeedback.repository.FeedbackRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FeedbackServiceTest {

    FeedbackRepository repository = mock(FeedbackRepository.class);

    FeedbackService service = new FeedbackService(repository);

    @Test
    void testSaveFeedback() {
        Feedback feedback = new Feedback();
        feedback.setName("Alice");
        feedback.setEmail("alice@example.com");
        feedback.setMessage("Great service!");

        when(repository.save(any())).thenReturn(feedback);

        Feedback saved = service.saveFeedback(feedback);

        assertEquals("Alice", saved.getName());
        verify(repository, times(1)).save(any());
    }

    @Test
    void testGetAllFeedback() {
        Feedback fb1 = new Feedback();
        Feedback fb2 = new Feedback();

        when(repository.findAll()).thenReturn(Arrays.asList(fb1, fb2));

        List<Feedback> result = service.getAllFeedback();

        assertEquals(2, result.size());
        verify(repository, times(1)).findAll();
    }
}
