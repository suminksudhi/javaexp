package com.example.jsex;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptDemo {

	public static void main(String[] args) {
		new JavaScriptDemo();
	}
	
	public JavaScriptDemo() {
		demoTwo();
		demoOne();
	}

	
	private void demoTwo(){
			
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		int i = 100;
		int j = 10;
		
		ScriptContext context = engine.getContext();
		context.setAttribute("A", i, ScriptContext.GLOBAL_SCOPE);
		context.setAttribute("B", j, ScriptContext.GLOBAL_SCOPE);

		try {
			
			engine.eval(new FileReader("C:\\banglore-workspace\\java\\src\\com\\example\\jsex\\cal.js"));
			Invocable invocable = (Invocable) engine;
			Object result = invocable.invokeFunction("sum", 12,45);
			System.out.println(result);

		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}
	
	private void demoOne(){
			
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		int i = 100;
		int j = 10;
		
		ScriptContext context = engine.getContext();
		context.setAttribute("A", i, ScriptContext.GLOBAL_SCOPE);
		context.setAttribute("B", j, ScriptContext.GLOBAL_SCOPE);

		
		try {
			
			
			engine.eval("print(A+B)");
			engine.eval("print(10+2)");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}