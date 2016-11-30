package xuyihao.event;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xuyh at 2016/11/30 下午 04:00.
 *
 * <pre>
 *     事件源是事件发生的地方，
 *     是事件触发的源头，
 *     事件监听器注册的地方。
 * </pre>
 */
public class JohnsonEventSource {
	/**
	 * 事件监听器的集合
	 * 
	 * <pre>
	 *     事件源中存储一个监听器集合，
	 *     当事件发生之后，事件源会依次调用
	 *     每个监听器的响应方法。
	 * </pre>
	 */
	private Set<JohnsonEventListener> eventListeners = new HashSet<JohnsonEventListener>();

	/**
	 * 注册监听器
	 * 
	 * <pre>
	 *     理解：
	 *     添加监听器
	 * </pre>
	 *
	 * @param eventListener
	 */
	public void addEventListener(JohnsonEventListener eventListener) {
		if (eventListener != null) {
			eventListeners.add(eventListener);
		}
	}

	/**
	 * 注销监听器
	 * 
	 * <pre>
	 *     理解：
	 *     把这个监听器去掉
	 * </pre>
	 *
	 * @param eventListener
	 * @return
	 */
	public boolean removeEventListener(JohnsonEventListener eventListener) {
		return eventListeners.remove(eventListener);
	}

	/**
	 * 发生事件1
	 * 
	 * <pre>
	 * 发生事件方法需要外部调用
	 * </pre>
	 */
	public void event1() {
		JohnsonEventObject object = new JohnsonEventObject(this, JohnsonEventObject.EVENT_TYPE_ONE);
		doOnAction(object);
	}

	/**
	 * 发生事件2
	 * 
	 * <pre>
	 * 发生事件方法需要外部调用
	 * </pre>
	 */
	public void event2() {
		JohnsonEventObject object = new JohnsonEventObject(this, JohnsonEventObject.EVENT_TYPE_TWO);
		doOnAction(object);
	}

	/**
	 * 发生事件3
	 * 
	 * <pre>
	 * 发生事件方法需要外部调用
	 * </pre>
	 */
	public void event3() {
		JohnsonEventObject object = new JohnsonEventObject(this, JohnsonEventObject.EVENT_TYPE_THREE);
		doOnAction(object);
	}

	/**
	 * 遍历监听器执行响应方法
	 * 
	 * @param eventObject
	 */
	private void doOnAction(JohnsonEventObject eventObject) {
		for (JohnsonEventListener listener : eventListeners) {
			listener.onAction(eventObject);
		}
	}

	/**
	 * <pre>
	 * 定义一个事件源方法，
	 * 给事件监听器调用，
	 * 用来体现事件对象保存事件源的作用。
	 * </pre>
	 * 
	 * @param message
	 */
	public void sourceFunction(String message) {
		System.out.println(message);
	}
}
