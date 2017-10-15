package br.org.jext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <p>Classe utilitária para manipulação de arquivos de propriedades.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 14/10/2017
 * @since v1.0.0
 */
public final class Properties {
   
   private static final File CURRENT_DIR = new File(".");
   
   public static final String PROJECT_DIR = CURRENT_DIR.getAbsolutePath().replace(".", "");
   
   public static final String SRC_DIR = (PROJECT_DIR + "src/").replaceAll("/", File.separator);
   public static final String SRC_MAIN_DIR = (SRC_DIR + "main/").replaceAll("/", File.separator);
   public static final String SRC_MAIN_JAVA_DIR = (SRC_MAIN_DIR + "java/").replaceAll("/", File.separator);
   public static final String SRC_MAIN_RESOURCES_DIR = (SRC_MAIN_DIR + "resources/").replaceAll("/", File.separator);
   
   public static final String SRC_TEST_DIR = (SRC_DIR + "test/").replaceAll("/", File.separator);
   public static final String SRC_TEST_JAVA_DIR = (SRC_TEST_DIR + "java/").replaceAll("/", File.separator);
   public static final String SRC_TEST_RESOURCES_DIR = (SRC_TEST_DIR + "resources/").replaceAll("/", File.separator);
   
   public static final String BUILD_DIR = (PROJECT_DIR + "build/").replaceAll("/", File.separator);
   public static final String BIN_DIR = (PROJECT_DIR + "bin/").replaceAll("/", File.separator);
   
   private static File file;
   private static java.util.Properties properties;
   private static InputStream inputStream;
   private static OutputStream outputStream;
   private static boolean loaded = false;
   
   public static void load(String path) {
      path = path == null ? "" : path;
      if (!path.isEmpty()) {
         properties = new java.util.Properties();
         try {
            // define em qual ambiente se deve procurar o arquivo de propriedades.
            if (path.startsWith("classpath:")) {
               path = path.replace("classpath:", "");
               file = new File(PropertiesUtil.class.getClassLoader().getResource(path).getFile());
            } else if (path.startsWith("main:")) {
               path = path.replace("main:", SRC_MAIN_RESOURCES_DIR);
               file = new File(path);
            } else if (path.startsWith("test:")) {
               path = path.replace("test:", SRC_TEST_RESOURCES_DIR);
               file = new File(path);
            } else {
               file = new File(path);
            }
            if (file.exists()) {
               // cria fluxo de entrada.
               inputStream = new FileInputStream(file);
               outputStream = null;
               properties.load(inputStream);
               loaded = true;
            } else {
               throw new IOException(String.format("O caminho: %s não foi encontrado no sistema de arquivos!", path));
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void load(File file) {
      if (file != null && file.exists()) {
         properties = new java.util.Properties();
         try {
            Properties.file = file;
            inputStream = new FileInputStream(file);
            properties.load(inputStream);
            loaded = true;
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void load(InputStream inputStream) {
      if (inputStream != null) {
         properties = new java.util.Properties();
         try {
            properties.load(inputStream);
            Properties.inputStream = inputStream;
            loaded = true;
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   private static void openInputStream() {
      try {
         inputStream = new FileInputStream(file);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   private static void openOutputStream() {
      try {
         outputStream = new FileOutputStream(file);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   private static void closeInputStream() {
      if (inputStream != null && loaded) {
         try {
            inputStream.close();
            loaded = false;
            inputStream = null;
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   private static void closeOutputStream() {
      if (outputStream != null) {
         try {
            outputStream.close();
            outputStream = null;
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void close() {
      closeInputStream();
      closeOutputStream();
      file = null;
      properties = null;
   }
   
   public static void unload() {
      close();
   }
   
   public static Object get(String key) {
      String value = null;
      key = key == null ? "" : key;
      if (properties != null && loaded && !key.isEmpty()) {
         value = properties.getProperty(key);
      }
      return value;
   }
   
   public static Object getProperty(String key) {
      return get(key);
   }
   
   public static Object property(String key) {
      return get(key);
   }
   
   public static Object read(String key) {
      return get(key);
   }
   
   public static void store(String key, Object value) {
      key = key == null ? "" : key;
      if (loaded() && !key.isEmpty() && value != null) {
         properties.put(key, value);
      }
   }
   
   public static void setProperty(String key, Object value) {
      store(key, value);
   }
   
   public static void property(String property, Object value) {
      store(property, value);
   }
   
   public static void save() {
      try {
         if (loaded()) {
            inputStream.close();
            openOutputStream(); // cria fluxo de saída.
            properties.store(outputStream, ""); // armazena os dados.
            closeOutputStream();
            openInputStream();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   public static void save(OutputStream outputStream) {
      Properties.outputStream = outputStream;
      save();
   }
   
   public static boolean isLoaded() {
      return properties != null && loaded;
   }
   
   public static boolean loaded() {
      return isLoaded();
   }
   
}
