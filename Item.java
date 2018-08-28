import java.util.*;

import java.lang.reflect.*;

class Item {
	String data;
	String color;
	int size;
	String font;
	String align;

	public Item() {
	}

	public void color(String color) {
		this.color = color;
	}
	public void align(String align) {
		this.align = align;
	}

	public void size(int size) {
		this.size = size;
	}

	public void font(String font) {
		this.font = font;
	}

	public void makeBold() {
		this.data = this.data.replace(this.data, "<b>" + this.data + "</b>");
	}

	public void makeItalics() {
		this.data = this.data.replace(this.data, "<i>" + this.data + "</i>");
	}

	public void resetBold() {
		this.data = this.data.replace("<b>", "");
		this.data = this.data.replace("</b>", "");
	}

	public void resetItalics() {
		this.data = this.data.replace("<i>", "");
		this.data = this.data.replace("</i>", "");
	}
	public String compile() {
		String style = "style = \"";
		if (this.color != null) {
			style = style + "color:" + this.color + ";";
		}
		if (this.align != null) {
			style = style + "text-align:" + this.align + ";";
		}
		if (this.size != 0) {
			style = style + "font-size:" + this.size + ";";
		}
		if (this.font != null) {
			style = style + "font-family:" + this.font + ";";
		}
		style = style + "\"";
		this.data = this.data.replace("style =\"\"", style);
		return (this.data);
	}
}