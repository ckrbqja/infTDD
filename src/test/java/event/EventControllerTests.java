package event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
public class EventControllerTests {
	@Autowired MockMvc mockMvc;

	@Test void createEvent() throws Exception {
		mockMvc.perform(post("/api/events/")
					   .contentType(MediaType.APPLICATION_JSON_UTF8)
			   )
				.andExpect(status().isCreated());
	}
}
