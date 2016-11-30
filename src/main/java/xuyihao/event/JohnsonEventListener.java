package xuyihao.event;

import java.util.EventListener;

/**
 * Created by Xuyh at 2016/11/30 下午 04:00.
 *
 * <pre>
 *     事件监听器定义了一个接口，
 *     用来规范事件发生之后事件源调用的处理方法
 * </pre>
 */
public interface JohnsonEventListener extends EventListener {
	/**
	 * 事件产生需要调用的方法
	 */
	public void onAction(JohnsonEventObject eventObject);
}
