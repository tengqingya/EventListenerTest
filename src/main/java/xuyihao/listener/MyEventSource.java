package xuyihao.listener;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author tengqingya
 * @create 2017-02-14 14:49
 */
public class MyEventSource {
    private Set<MyEventListener> eventListeners = new HashSet<MyEventListener>();

    private Map<String,Integer> map=new HashMap<>();

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap( Map<String, Integer> map ) {
        this.map = map;
    }

    public void addListner( MyEventListener myEventListener){
        if(myEventListener!=null){
            eventListeners.add(myEventListener);
        }
    }

    public void removeListner(MyEventListener myEventListener){
        if(myEventListener!=null){
            eventListeners.remove(myEventListener);
        }
    }

    public void triger(){
        for(MyEventListener e:eventListeners ){
            e.onCreate(this);
        }
    }

}
