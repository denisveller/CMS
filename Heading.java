import java.util.*;

import java.lang.reflect.*;

class Heading extends Item {
	public Heading(String text, int headingLevel) {
		this.data = "<h"+headingLevel+" style =\"\">" + text + "</h"+headingLevel+">";
	}

	public void makeLink(String text, String url) {
		this.data = this.data.replace(text, "<a href=\"" + url + "\"</a>");
	}
}