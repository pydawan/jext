package br.org.jext;

import org.junit.Test;

/**
 * @author thiago-amm
 * @version v1.0.0 04/02/2018
 */
public class StringsTest {
   
   @Test
   public void test() {
      System.out.println(Strings.translate("Thiago Alexandre Martins Monteiro", "thiagowtd", "123xyzáúó"));
      String text = "Translation is the communication of the meaning of a source-language text by means of an equivalent target-language text.[1] The English language draws a terminological distinction (not all languages do) between translating (a written text) and interpreting (oral or sign-language communication between users of different languages); under this distinction, translation can begin only after the appearance of writing within a language community.\n";
      System.out.println(Strings.translate(text, List.of("Translation"), Lists.of("tradução")));
      text = "Thiago Alexandre\nMartins Monteiro";
      System.out.println(Strings.lines(text));
      System.out.println(Strings.count("Thiago", "Thiago Alexandre Martins Monteiro da Silva Thiago thiago"));
      System.out.println(Strings.expandTabs("\tNome: Thiago Alexandre Martins Monteiro", 20));
      System.out.println(Strings.join("-", "Thiago", "Alexandre"));
      System.out.println(Strings.title("hello java world!"));
      System.out.println(Strings.isTitle("Hello Java World!!!"));
      System.out.println(Strings.find("xand", "Thiago Alexandre Martins Monteiro", 5, 20));
      System.out.println(Strings.min("Meu nome é Lorenzo!"));
      System.out.println(Strings.max("Meu nome é Lorenzo!"));
      System.out.println(Strings.getOrDefault(null, "vazio"));
      System.out.println(Strings.getOrEmpty(null));
      System.out.println(Strings.compile(Template.of("Nome: $nome").put("nome", "Thiago")));
   }
   
}
