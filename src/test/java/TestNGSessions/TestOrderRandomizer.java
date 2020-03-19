package TestNGSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestOrderRandomizer implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		long seed = System.nanoTime();
		System.out.println(String.format("Randomizing order of tests with seed: %s", seed));
		Collections.shuffle(methods, new Random(224237970696000L));
		return methods;

	}
	
//	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
//		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
//		for (IMethodInstance method : methods) {
//			Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
//			if (testMethod.priority() == 1) {
//				result.add(method);
//			}
//		}
//		return result;
//	}

}
