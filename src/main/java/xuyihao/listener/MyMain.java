package xuyihao.listener;

import java.util.Map;

/**
 * @author tengqingya
 * @create 2017-02-14 14:52
 */
public class MyMain {
    public static void main(String args[]){
        MyEventSource myEventSource = new MyEventSource();
        myEventSource.getMap().put("a",11233);
        myEventSource.addListner(new MyEventListener() {
            @Override
            public void onCreate( Object o ) {
                if(o instanceof MyEventSource){
                    System.out.println(((MyEventSource)o).getMap().get("a"));
                }
                System.out.println("回调oncreate");
            }
        });
        myEventSource.triger();
    }
}
