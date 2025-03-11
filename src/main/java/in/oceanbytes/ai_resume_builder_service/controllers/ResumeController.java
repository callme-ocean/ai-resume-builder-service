package in.oceanbytes.ai_resume_builder_service.controllers;

import in.oceanbytes.ai_resume_builder_service.models.ResumeRequest;
import in.oceanbytes.ai_resume_builder_service.services.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class ResumeController {
private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/generate")
    public ResponseEntity<Map<String, Object>> getResumeData(@RequestBody ResumeRequest resumeRequest) throws IOException {
        Map<String, Object> stringObjectMap = resumeService.generateResumeResponse(resumeRequest.userDescription());

        return new ResponseEntity<>(stringObjectMap, HttpStatus.OK);
    }
}
