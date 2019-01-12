package br.org.jext;

import java.util.HashMap;

/**
 * @author thiago-amm
 * @version v1.0.0 11/01/2019
 * @since v1.0.0
 */
public class Template {
    
    private String template;
    private HashMap<String, Object> context;
    private String compiledTemplate;
    
    public Template(String template, HashMap<String, Object> context) {
        this.template = template;
        this.context = context;
        this.compiledTemplate = "";
    }
    
    public Template(String template) {
        this(template, new TemplateContext());
    }
    
    public Template() {
        this("");
    }
    
    public static Template of(String template, HashMap<String, Object> context) {
        return new Template(template, context);
    }
    
    public static Template of(String template) {
        return new Template(template);
    }
    
    public static Template of() {
        return new Template();
    }
    
    public Template put(String key, Object value) {
        context.put(key, value);
        return this;
    }
    
    public Object get(String key) {
        return context.get(key);
    }
    
    public String compile(String template, HashMap<String, Object> context) throws IllegalArgumentException {
        Strings.throwIf( IllegalArgumentException.class, "O template não pode ser null!", Strings.isNull(template) );
        Strings.throwIf( IllegalArgumentException.class, "O contexto do template não pode ser null!", Maps.isNull(context) );
        String compiledTemplate = template;
        String templateKey = "";
        String templateValue = "";
        for (java.util.Map.Entry<String, Object> entry : context.entrySet()) {
            templateKey = String.format("\\$%s", entry.getKey());
            templateValue = entry.getValue().toString();
            compiledTemplate = compiledTemplate.replaceAll(templateKey, templateValue);
        }
        return compiledTemplate;
    }
    
    public String compile(String template) throws IllegalArgumentException {
        Strings.throwIf( IllegalArgumentException.class, "O template não pode ser null!", Strings.isNull(template) );
        Strings.throwIf( IllegalArgumentException.class, "O contexto do template não pode ser null!", Maps.isNull(context) );
        String compiledTemplate = template;
        String templateKey = "";
        String templateValue = "";
        for (java.util.Map.Entry<String, Object> entry : context.entrySet()) {
            templateKey = String.format("\\$%s", entry.getKey());
            templateValue = entry.getValue().toString();
            compiledTemplate = compiledTemplate.replaceAll(templateKey, templateValue);
        }
        return compiledTemplate;
    }
    
    public String compile() throws IllegalArgumentException {
        Strings.throwIf( IllegalArgumentException.class, "O template não pode ser null!", Strings.isNull(template) );
        Strings.throwIf( IllegalArgumentException.class, "O contexto do teomplate não pode ser null!", Maps.isNull(context) );
        compiledTemplate = template;
        String templateKey = "";
        String templateValue = "";
        for (java.util.Map.Entry<String, Object> entry : context.entrySet()) {
            templateKey = String.format("\\$%s", entry.getKey());
            templateValue = entry.getValue().toString();
            compiledTemplate = compiledTemplate.replaceAll(templateKey, templateValue);
        }
        return compiledTemplate;
    }
    
}
