package event;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class EventTest {

	@Test void builder() {
		final String name = "레스트 에이피아이";
		final Event event = Event.builder().name(name).description("rest api").build();

		assertThat(event).isNotNull();
		assertThat(event.getName()).isEqualTo(name);
	}

}