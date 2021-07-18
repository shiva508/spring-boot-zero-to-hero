/*
 * package com.pool;
 * 
 * import static org.junit.Assert.assertTrue; import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import java.util.stream.Stream;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 * import org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.context.SpringBootTest.WebEnvironment; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc;
 * 
 * import com.pool.model.Cat; import com.pool.repository.cat.CatRepository;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest(webEnvironment = WebEnvironment.MOCK)
 * 
 * @AutoConfigureMockMvc public class CatTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @Autowired private CatRepository catRepository;
 * 
 * @Before public void before() { Stream.of("Felix", "Garfield",
 * "Whiskers").forEach(name -> catRepository.save(new Cat(name))); }
 * 
 * @Test public void catsReflectedInRead() throws Exception { MediaType halJson
 * = MediaType.parseMediaType("application/hal+json;charset=UTF-8");
 * this.mockMvc.perform(get("/cats")).andExpect(status().isOk()).andExpect(
 * content().contentType(halJson)) .andExpect(mvcResult -> { String
 * contentAsString = mvcResult.getResponse().getContentAsString(); assertTrue(
 * contentAsString.split("totalElements")[1].split(":")[1].trim().split(",")[0].
 * equals("3")); }); } }
 */