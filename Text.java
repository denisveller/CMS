import java.util.*;

import java.lang.reflect.*;

class Text extends Item {
	public Text(String text) {
		this.data = "<p style =\"\">" + text + "<p>";
	}

	public void makeLink(String text, String url) {
		this.data = this.data.replace(text, "<a href=\"" + url + "\"</a>");
	}
}
