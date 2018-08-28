import java.util.*;
import java.lang.reflect.*;
import java.io.*;

public class Main {
	static List<Div> divs = new ArrayList<>();

	public static void main(String[] args) {
		divs.add(new Div());
		divs.get(0).addText("First CMS Webpage", true);
		divs.get(0).addText("	This is the first site made with ShittyCMS (tm).", false);
		divs.get(0).contents.get(1).color("blue");
		divs.get(0).contents.get(1).font("Arial");
		divs.add(new Div());
		divs.get(1).addText("Its honestly more complex that writing by hand", false);
		compile();
	}

	static void compile() {
		String product = "<html><body>";
		for (int i = 0; i < divs.size(); i++) {
			product = product + divs.get(i).compile();
		}
		product = product + "</body></html>";
		String filePath = "index.html";

		try (Writer writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(product);
		} catch (IOException e) {
			System.out.println("Problem occurs when creating file " + filePath);
			e.printStackTrace();

		}
	}

}