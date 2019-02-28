package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 28/02/2019
 * since v1.0.0
 */
@SuppressWarnings("unchecked")
public class Function<T> implements Runnable {
    
    public int index;
    public T value;
    public Object[] objects = null;
    public Object object = null;
    
    public Function() {
        
    }
    
    public <E> Function(E... objects) {
        this.objects = objects;
    }
    
    public <E> Function(E object) {
        this.object = object;
    }
    
    public void run() {
        
    }
    
}
