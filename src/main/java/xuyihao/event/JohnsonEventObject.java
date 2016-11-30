package xuyihao.event;

import java.util.EventObject;

/**
 * Created by Xuyh at 2016/11/30 下午 04:00.
 *
 * <pre>
 *     自己理解事件对象的作用：
 *     （1）事件对象储存了事件源对象，
 *     当事件监听器方法进行处理程序的时候，
 *     如果需要改变事件源的属性值等等操作时候，
 *     就可以通过事件对象获取到事件源对象，
 *     从而对事件事件源的属性进行修改或者调用事件源的方法。
 *     （2）继承了java.util.EventObject之后的自定义事件对象，
 *     可以添加其他属性，比如说事件类型等等，
 *     添加一些必要的业务属性等。
 *
 * </pre>
 */
public class JohnsonEventObject extends EventObject {
	public static int EVENT_TYPE_ONE = 1;
	public static int EVENT_TYPE_TWO = 2;
	public static int EVENT_TYPE_THREE = 3;
	private int eventType;

	/**
	 * source是事件源
	 *
	 * @param source
	 */
	public JohnsonEventObject(Object source) {
		super(source);
	}

	public JohnsonEventObject(Object source, int eventType) {
		super(source);
		this.eventType = eventType;
	}

	@Override
	public Object getSource() {
		return super.getSource();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
}
