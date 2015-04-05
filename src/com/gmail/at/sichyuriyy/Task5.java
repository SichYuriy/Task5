package com.gmail.at.sichyuriyy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
	
	public static void main(String[]args) throws IOException {
		String text = "";
		String inputFile;
		String outputFile;
		PrintWriter out;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter path to the input file");
		inputFile = in.next();
		System.out.println("Enter path to the output file");
		outputFile = in.next();
		in.close();
		in = new Scanner(new FileReader(inputFile));
		out = new PrintWriter(new FileWriter(outputFile));
		while(in.hasNextLine()) {
			text +=in.nextLine() + "\n";
		}
		
		
		text = deleteComments(text);
		out.println(text);
		out.println(text);
		in.close();
		out.close();
		
	}
	
	
	public static String deleteComments(String text) {
		
		Pattern commentType1 = Pattern.compile("//.*?\n", Pattern.DOTALL + Pattern.MULTILINE);
		Pattern commentType2 = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL + Pattern.MULTILINE);
		Matcher m = commentType1.matcher(text);
		String textWithoutComments = m.replaceAll("");
		m = commentType2.matcher(textWithoutComments);
		textWithoutComments = m.replaceAll("");
		return textWithoutComments;
	
	}

}
