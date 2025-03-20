package in.oceanbytes.ai_resume_builder_service.config;


import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.ErrorResponse;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                                type = "object",
                                example = """
                                        {
                                            "education": ["Masters in Computer Science"],
                                            "work_experience": ["5 years as Full Stack Developer"],
                                            "skills": ["Java", "Spring Boot", "AI Integration"]
                                        }
                                        """
                        )
                )
        ),
        @ApiResponse(
                responseCode = "500",
                description = "Internal Server Error",
                content = @Content(schema = @Schema(implementation = ErrorResponse.class))
        )
})
public @interface CustomSwaggerResponseAnnotation {
}
