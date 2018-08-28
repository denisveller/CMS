import java.util.*;
import java.lang.reflect.*;

public class BTN extends Item {
	String url;
	String type = "class=\"btn btn-primary\"";

	public BTN(String text, String url) {
		this.data = "<a class=\"btn btn-primary\" href=\"" + url + "\" role=\"button\" style =\"\">" + text + "</a>";
		this.url = url;
	}

	public void color(String color) {
		this.color = color;
	}

	public void size(int size) {
		this.size = size;
	}

	public void type(String type) {
		this.data = this.data.replace("class=\"" + this.type + "\"", "class=\"" + type + "\"");
		this.type = type;
	}
		
}