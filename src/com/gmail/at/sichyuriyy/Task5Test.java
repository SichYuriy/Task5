package com.gmail.at.sichyuriyy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)
public class Task5Test {

	String inputText;
	String outputText;
	
	public Task5Test(String inputText, String outputText) {
		this.inputText = inputText;
		this.outputText = outputText;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object [][]data = new Object[][]{
				{"/*jljklljlkjk*/", ""},
				{"// hjkklkllkl\n", ""},
				{"// jkljkjkk\nooo", "ooo"},
				{"/*lkjklk*/ttt/*kjhjh*/", "ttt"}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		assertEquals(Task5.deleteComments(inputText), outputText);
	}

}
