package in.oceanbytes.ai_resume_builder_service;

import in.oceanbytes.ai_resume_builder_service.services.ResumeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class AiResumeBuilderServiceApplicationTests {

	@Autowired
	private ResumeService resumeService;

	@Test
	void contextLoads() throws IOException {
		resumeService.generateResumeContent("I'm Sagar Bhadouria with 4 years of java experience.");
	}

}
