package com.example.apifeedback.controller;



import com.example.apifeedback.model.Feedback;
import com.example.apifeedback.service.FeedbackService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping
    public Feedback submitFeedback(@Valid @RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    @GetMapping
    public List<Feedback> viewAllFeedback() {
        return service.getAllFeedback();
    }
}
