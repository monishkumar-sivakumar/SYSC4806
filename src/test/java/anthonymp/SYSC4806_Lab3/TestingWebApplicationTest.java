package anthonymp.SYSC4806_Lab3;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;


//On Hold.
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultJSONMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("{\r\n" +
                        "" +
                        "  \"_links\" : {\r\n" +
                        "" +
                        "    \"addressBooks\" : {\r\n" +
                        "" +
                        "      \"href\" : \"http://localhost"+""+"/addressBooks\"\r\n" +
                        "" +
                        "    },\r\n" +
                        "" +
                        "    \"buddyInfoes\" : {\r\n" +
                        "" +
                        "      \"href\" : \"http://localhost"+"/buddyInfoes\"\r\n" +
                        "" +
                        "    },\r\n" +
                        "" +
                        "    \"profile\" : {\r\n" +
                        "" +
                        "      \"href\" : \"http://localhost"+"/profile\"\r\n" +
                        "" +
                        "    }\r\n" +
                        "" +
                        "  }\r\n" +
                        "" +
                        "}"));
	}
}