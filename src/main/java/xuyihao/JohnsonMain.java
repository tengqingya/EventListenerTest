package xuyihao;

import xuyihao.event.JohnsonEventListener;
import xuyihao.event.JohnsonEventObject;
import xuyihao.event.JohnsonEventSource;

/**
 * 测试自定义事件入口
 *
 * Created by Xuyh at 2016/08/05 下午 03:26.
 */
public class JohnsonMain {
	public static void main(String args[]) {
		eventTest1();
		System.out.println("\r\n-----------------------------------\r\n");
		eventTest2();
	}

	/**
	 * 匿名方式实现监听
	 */
	public static void eventTest1() {
		System.out.println("匿名方式实现监听");
		// 定义事件源
		JohnsonEventSource source = new JohnsonEventSource();
		// 事件源绑定事件监听1，这里使用匿名方式实现监听器
		source.addEventListener(new JohnsonEventListener() {
			public void onAction(JohnsonEventObject eventObject) {
				JohnsonEventSource source1 = (JohnsonEventSource) eventObject.getSource();
				source1.sourceFunction("事件监听器 1 监听到事件--事件类型: " + String.valueOf(eventObject.getEventType()));
				// 这里也可以直接使用外部的source对象，本质上是一个对象
			}
		});
		// 事件源绑定事件监听2
		source.addEventListener(new JohnsonEventListener() {
			public void onAction(JohnsonEventObject eventObject) {
				JohnsonEventSource source2 = (JohnsonEventSource) eventObject.getSource();
				source2.sourceFunction("事件监听器 2 监听到事件--事件类型: " + String.valueOf(eventObject.getEventType()));
			}
		});
		// 启动事件
		source.event1();
		source.event2();
		source.event3();
	}

	/**
	 * 定义监听器类实现接口方式
	 */
	public static void eventTest2() {
		System.out.println("定义监听器类实现接口方式实现监听");
		JohnsonEventSource source = new JohnsonEventSource();
		// 事件源绑定事件监听1
		source.addEventListener(new ExampleListener(1));
		// 事件源绑定事件监听2
		source.addEventListener(new ExampleListener(2));
		// 启动事件
		source.event1();
		source.event2();
		source.event3();
	}

	public static class ExampleListener implements JohnsonEventListener {
		private int number;

		public ExampleListener(int number) {
			this.number = number;
		}

		public void onAction(JohnsonEventObject eventObject) {
			JohnsonEventSource source = (JohnsonEventSource) eventObject.getSource();
			source.sourceFunction("事件监听器 " + number + " 监听到事件--事件类型: " + String.valueOf(eventObject.getEventType()));
		}
	}
}
