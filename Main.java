import java.util.*;
import java.lang.reflect.*;
import java.io.*;

public class Main {
	static List<Div> divs = new ArrayList<>();

	public static void main(String[] args) {
		divs.add(new Div(true));
		divs.get(0).addHeading("First CMS Webpage", 1);
		divs.get(0).addText("	This is the first site made with ShittyCMS (tm).");
		divs.get(0).contents.get(1).align("center");
		divs.get(0).addBTN("Learn More", "#");
		compile();
	}

	static void compile() {
		String product = "<html lang=\"en\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"><title></title></head>";
		for (int i = 0; i < divs.size(); i++) {
			product = product + divs.get(i).compile();
		}
		product = product + "<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script><script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script><script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script></body></html>";
		String filePath = "index.html";

		try (Writer writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(product);
		} catch (IOException e) {
			System.out.println("Problem occurs when creating file " + filePath);
			e.printStackTrace();

		}
	}

}