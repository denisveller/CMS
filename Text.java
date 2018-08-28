import java.util.*;

import java.lang.reflect.*;

class Text {
	String data;
	String color;
	int size = 0;
	String font;

	public Text(String text, Boolean heading) {
		this.data = text;
		if (heading) {
			this.makeHeading();
		}
		else {
			this.data = "<p>" + this.data + "<p>";
		}
	}

	public void color(String color) {
		this.color = color;
	}

	public void size(int size) {
		this.size = size;
	}

	public void font(String font) {
		this.font = font;
	}

	public void makeBold() {
		this.data = "<b>" + this.data + "</b>";
	}

	public void makeItalics() {
		this.data = "<i>" + this.data + "</i>";
	}

	public void resetBold() {
		this.data = this.data.replace("<b>", "");
		this.data = this.data.replace("</b>", "");
	}
	
	public void resetItalics(){
		this.data = this.data.replace("<i>", "");
		this.data = this.data.replace("</i>", "");
	}

	public void makeHeading() {
		this.data = this.data.replace("<p>", "");
		this.data = this.data.replace("</p>", "");
		this.data = "<h1>" + this.data + "</h1>";
	}
	public void makeLink(String text, String url){
		this.data = this.data.replace(text, "<a href=\""+ url+"\">"+text+"</a>");
	}

	public String compile() {
		String style = "style = \""; 
		if (this.color != null) {
			style = style + "color:" + this.color + ";";
		}
		if (this.size != 0) {
			style = style + "font-size:" + this.size + ";";
		}
		if (this.font != null) {
			style = style + "font-family:" + this.font + ";";
		}
		style = style + "\"";
		this.data = this.data.replace("<p>", "<p " + style + "/>");
		this.data = this.data.replace("<h1>", "<h1 " + style + "/>");
		return (this.data);
	}
}
