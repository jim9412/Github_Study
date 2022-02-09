package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String agrs[]) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("쓰프링");
		System.out.println(msg);
		ctx.close();
	}
}
