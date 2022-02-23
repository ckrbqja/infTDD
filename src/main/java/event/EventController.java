package event;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;

@Controller
public class EventController {


	@PostMapping("/api/events") ResponseEntity createEvent() {
		return ResponseEntity.created(URI.create("aa")).build();
	}

}

