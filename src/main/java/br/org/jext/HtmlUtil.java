package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 09/05/2019
 * @since v1.0.0
 */
public class HtmlUtil {
    
    public static String getUl(Object... items) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n<ul>");
        if (Arrays.isNotNullOrEmpty(items)) {
            for (Object item : items) {
                sb.append("\n\t<li>" + item + "</li>");
            }
        }
        sb.append("\n</ul>");
        return sb.toString();
    }
    
    public static String ul(Object... items) {
        return Html.getUl(items);
    }
    
    public static String getOl(Object... items) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n<ol>");
        if (Arrays.isNotNullOrEmpty(items)) {
            for (Object item : items) {
                sb.append("\n\t<li>" + item + "</li>");
            }
        }
        sb.append("\n</ol>");
        return sb.toString();
    }
    
    public static String ol(Object... items) {
        return Html.getOl(items);
    }
    
}
