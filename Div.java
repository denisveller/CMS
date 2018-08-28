import java.util.*;
import java.lang.reflect.*;

class Div {
	List<Item> contents = new ArrayList<>();
	boolean fluid;

	public Div(boolean fluid) {
		this.fluid = fluid;
	}

	void addText(String text) {
		contents.add(new Text(text));
	}

	void addHeading(String text, int level) {
		contents.add(new Heading(text, level));
	}

	void addBTN(String text, String url) {
		contents.add(new BTN(text, url));
	}

	void reorderItems(int initPos, int finalPos) {
		Item hold = contents.get(initPos);
		contents.remove(initPos);
		contents.add(finalPos, hold);
	}

	String compile() {
		String product;
		if (this.fluid) {
			product = "<div class=\"jumbotron jumbotron-fluid\"><div class=\"container\">";
		} else {
			product = "<div class=\"jumbotron\">";
		}
		for (int i = 0; i < contents.size(); i++) {
			product = product + contents.get(i).compile();
		}
		if (this.fluid) {
			product = product + "</div>";
		}
		product = product + "</div>";
		return (product);
	}
}
