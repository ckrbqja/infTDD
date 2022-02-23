package event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest(
		properties = {
				"testId=goddaehee2",
				"testName=갓대희"
		} //classes = {TestJpaRestController.class, MemberService.class},
		,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class EventControllerTests {
	MockMvc mockMvc;

	@Test void createEvent() throws Exception {
		mockMvc.perform(post("/api/events/").contentType(MediaType.APPLICATION_JSON_UTF8)).andDo(print())
			   .andExpect(status().isCreated());
	}
}
