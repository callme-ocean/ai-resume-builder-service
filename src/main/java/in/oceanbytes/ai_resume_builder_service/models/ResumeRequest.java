package in.oceanbytes.ai_resume_builder_service.models;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Payload containing user input for resume generation")
public record ResumeRequest(@Schema(description = "Free-text description of user's professional experience and skills",
        example = "Full stack developer with 5 years experience in Java and React", requiredMode = Schema.RequiredMode.REQUIRED) String userDescription) {
}
