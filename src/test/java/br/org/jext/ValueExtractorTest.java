package br.org.jext;

import java.util.List;
import java.util.Map;

import org.junit.Test;


class Pessoa {

    private Integer id;
    private String nome;
    private String email;

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return String.format("Pessoa(id = %s, nome = %s, email = %s)", id, nome, email);
    }

}

public class ValueExtractorTest {

    @Test
    public void test() {
        
        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setNome("Thiago");
        p1.setEmail("thicmp@gmail.com");
        
        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setNome("Polyany");
        p2.setEmail("polyany.rl@gmail.com");
        
        Pessoa p3 = new Pessoa();
        p3.setId(3);
        p3.setNome("Lorenzo");
        p3.setEmail("lorenzo.rlm@gmail.com");
        
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        
        Integer[] ids = ValueExtractor.extract("id").from(pessoas).toArray(Integer.class);
        
        System.out.print("ids: ");
        for (Integer id : ids) {
            System.out.printf("%s ", id);
        }
        System.out.println();
        
        String[] nomes = ValueExtractor.extract("nome").from(pessoas).toArray(String.class);
        System.out.print("nomes: ");
        for (String nome : nomes) {
            System.out.printf("%s ", nome);
        }
        System.out.println();
        
        Object[] values = ValueExtractor.extract("id", "nome").from(pessoas).toArray().getArray();
        System.out.println("Valores: ");
        for (Object value : values) {
            System.out.printf("[id = %s, nome = %s]\n", ValueExtractor.on(value).field("id"), ValueExtractor.field("nome", value));
        }
        
        ValueExtractor.extract("id", "nome").from(pessoas).toArray().print("<id = ${id}, nome = ${nome}>\n");
        List<Map<String, Object>> mapas = ValueExtractor.extract("id", "nome").from(pessoas).toMap().getMap();
        for (Map<String, Object> mapa : mapas) {
            System.out.println(mapa);
        }
        ValueExtractor.extract("id", "nome").from(pessoas).toMap().getArray();
    }

}
