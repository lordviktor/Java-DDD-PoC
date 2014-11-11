package br.com.victor.JavaDddExample;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.victor.JavaDddExample.domain.Pedido;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/application-context.xml", "classpath:/spring/persistence-context.xml",
        "classpath:/spring/apiv1-servlet.xml"})
@WebAppConfiguration
public class MedicamentoControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void tryToRetrieveAllMedicaments() throws Exception {
    	Pedido pedido = new Pedido();
    	Assert.assertNotNull(pedido.getItemEstoqueRepository());
        mockMvc.perform(MockMvcRequestBuilders.get("/healthCheck")).andExpect(status().isOk());
    }
}
