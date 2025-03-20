package in.oceanbytes.ai_resume_builder_service.services;

import java.io.IOException;
import java.util.Map;

public interface ResumeService {

    Map<String, Object> generateResumeContent(String userResumeDescription) throws IOException;
}
