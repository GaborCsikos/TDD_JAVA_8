/**
 * 
 */
package com.weebly.gaborcsikos.tdd_java8_jbehave.apple;

import java.util.List;

/**
 * @author Gábor Csikós
 *
 */
public class AppleController {

	private AppleModel model = new AppleModel();

	public void exit() {
		System.exit(0);
	}

	public List<Apple> list() {
		return model.getApples();
	}

	public void add(Apple apple) {
		model.getApples().add(apple);

	}

}