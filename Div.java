import java.util.*;
import java.lang.reflect.*;

class Div {
	List<Text> contents = new ArrayList<>();

	void addText(String text, Boolean data) {
		contents.add(new Text(text, data));
	}

	void reorderText(int initPos, int finalPos) {
		Text hold = contents.get(initPos);
		contents.remove(initPos);
		contents.add(finalPos, hold);
	}

	String compile() {
		String product = "<div>";
		for (int i = 0; i < contents.size(); i++) {
			product = product + contents.get(i).compile();
		}
		product = product + "</div>";
		return (product);
	}
}