package br.org.jext;

import static br.org.jext.StringUtil.arrayToString;
import static br.org.jext.StringUtil.mapToString;
import static br.org.verify.Verify.isArray;
import static br.org.verify.Verify.isMap;

/**
 * <p>Classe utilitária para impressão na saída padrão.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 14/10/2017
 * @since v1.0.0
 */
public class Prints {
    
    public static void println(Object object) {
        if (isArray(object)) {
            System.out.println(arrayToString(object));
        } else if (isMap(object)) {
            System.out.println(mapToString(object));
        } else {
            System.out.println(object);
        }
    }
    
    public static void println(Object... objects) {
        if (objects != null) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }
    }
    
    public static void println(Object object, int amount) {
        if (object != null) {
            println(object, amount, false);
        }
    }
    
    public static void println(java.lang.String format, Object object, int amount) {
        if (object != null) {
            println(format, object, amount, false);
        }
    }
    
    public static void println(Object object, int amount, boolean vertical) {
        if (object != null) {
            java.lang.String out = Strings.repeat(object, amount, vertical);
            println(out);
        }
    }
    
    public static void println(java.lang.String format, Object object, int amount, boolean vertical) {
        if (object != null) {
            java.lang.String out = Strings.repeat(format, object, amount, vertical);
            println(out);
        }
    }
    
    public static void print(Object object) {
        if (isArray(object)) {
            System.out.print(arrayToString(object));
        } else if (isMap(object)) {
            System.out.print(mapToString(object));
        } else {
            System.out.print(object);
        }
    }
    
    public static void print(java.lang.String format, Object... objects) {
        System.out.printf(format, objects);
    }
    
    public static void print(java.lang.String format, int amount, boolean vertical, Object... objects) {
        if (objects != null) {
            java.lang.String[] formats = null;
            if (format != null && !format.isEmpty()) {
                formats = format.split(" ");
            }
            if (formats.length == objects.length) {
                for (int i = 0; i < objects.length; i++) {
                    print(formats[i], objects[i], 1, vertical);
                }
            }
        }
    }
    
    public static void print(Object object, int amount) {
        if (object != null) {
            print(object, amount, false);
        }
    }
    
    public static void print(java.lang.String format, Object object, int amount) {
        if (object != null) {
            print(format, object, amount, false);
        }
    }
    
    public static void print(Object object, int amount, boolean vertical) {
        if (object != null) {
            java.lang.String out = Strings.repeat(object, amount, vertical);
            print(out);
        }
    }
    
    public static void print(java.lang.String format, Object object, int amount, boolean vertical) {
        if (object != null) {
            java.lang.String out = Strings.repeat(format, object, amount, vertical);
            print(out);
        }
    }
    
    public static void printf(String format, Object... object) {
        System.out.printf(format, object);
    }
    
    public static String format(String format, Object... object) {
        return String.format(format, object);
    }
    
    public static void puts(Object object) {
        print(object);
    }
    
    public static void puts(java.lang.String string, int amount) {
        if (string != null) {
            puts(string, amount, false);
        }
    }
    
    public static void puts(java.lang.String string, int amount, boolean vertical) {
        if (string != null) {
            java.lang.String str_out = Strings.repeat(string, amount, vertical);
            System.out.println(str_out);
        }
    }
    
}
