package in.oceanbytes.ai_resume_builder_service.controllers;

import in.oceanbytes.ai_resume_builder_service.models.ResumeRequest;
import in.oceanbytes.ai_resume_builder_service.services.ResumeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
@Tag(name = "Resume Generation", description = "APIs for generating resume content")
public class ResumeController {
    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/generate")
    @Operation(summary = "Generate resume data", description = "Generates structured resume content based on the user's description")
    public ResponseEntity<Map<String, Object>> getResumeData(@RequestBody ResumeRequest resumeRequest) throws IOException {
        Map<String, Object> resumeData = resumeService.generateResumeContent(resumeRequest.userDescription());

        return new ResponseEntity<>(resumeData, HttpStatus.OK);
    }
}
