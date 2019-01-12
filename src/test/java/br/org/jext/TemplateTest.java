package br.org.jext;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author thiago-amm
 * @version v1.0.0 11/01/2019
 * @since v1.0.0 bnhbk ll
 */
public class TemplateTest {
    
    @Test
    public void testTemplateCompilation() {
        String expected = "Meu nome é Thiago Alexandre Martins Monteiro!";
        Template template = Template.of().put("nome", "Thiago Alexandre").put("sobrenome", "Martins Monteiro");
        String actual = template.compile("Meu nome é $nome $sobrenome!");
        Assert.assertEquals(expected, actual);
    }
    
}
