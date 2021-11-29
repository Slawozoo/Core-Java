package com.jsouptutorial;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class WebScrappingExample {

	public static void main(String[] args) throws IOException {
		
//		Document doc = Jsoup.connect("http://example.com").get();
//		//doc.select("body").forEach(System.out::println);
//		doc.select("p").forEach(System.out::println);
		
		String blogUrl = "https://spring.io/blog";
		Document doc = Jsoup.connect(blogUrl).get();
		
//		Connection connection = Jsoup.connect(blogUrl);
//		connection.userAgent("Microsoft Edge");
//		connection.timeout(5000);
//		connection.cookie("cookiename", "val234");
//		connection.cookie("cookiename", "val234");
//		connection.referrer("http://google.com");
//		connection.header("headersecurity", "xyz123");
//		Document docCustomConn = connection.get();
		
		//OR
		
//		Document docCustomConn = Jsoup.connect(blogUrl)
//				  .userAgent("Microsoft Edge")
//				  .timeout(5000)
//				  .cookie("cookiename", "val234")
//				  .cookie("anothercookie", "ilovejsoup")
//				  .referrer("http://google.com")
//				  .header("headersecurity", "xyz123")
//				  .get();
		
		//System.out.println(docCustomConn);	//shows every content of webpage in document
		
		//Selecting
		Elements links = doc.select("a");
		Elements sections = doc.select("section");
		Elements logo = doc.select(".spring-logo--container");
		Elements pagination = doc.select("#pagination_control");
		Elements divsDescendant = doc.select("header div");
		Elements divsDirect = doc.select("header > div");
		
		Element pag = doc.getElementById("pagination_control");
		Elements desktopOnly = doc.getElementsByClass("desktop-only");
		
//		System.out.println(pag);
		
		//Traversing
		Element firstSection = sections.first();
		Element lastSection = sections.last();
		Element secondSection = sections.get(2);
		Elements allParents = firstSection.parents();
		Element parent = firstSection.parent();
		Elements children = firstSection.children();
		Elements siblings = firstSection.siblingElements();
		
//		System.out.println(desktopOnly);
		Elements sectionParagraphs = firstSection.select(".paragraph");
		//System.out.println(sectionParagraphs);
		//sections.forEach(el -> System.out.println("section: " + el));
		
		//Extracting from document
		Element firstArticle = doc.select("article").first();
		Element timeElement = firstArticle.select("time").first();
		String dateTimeOfFirstArticle = timeElement.attr("datetime");
		Element sectionDiv = firstArticle.select("section div").first();
		String sectionDivText = sectionDiv.text();
		String articleHtml = firstArticle.html();
		String outerHtml = firstArticle.outerHtml();
		
		System.out.println(firstArticle);
		System.out.println("Time element: "+timeElement);
//		System.out.println("DateTime of first Article: "+dateTimeOfFirstArticle);
//		System.out.println("First section division: \n"+sectionDiv);
//		System.out.println("Only text from section division: "+sectionDivText);
//		System.out.println("Only HTML tags from first article: \n"+outerHtml);
		
		//MODIFYING
		//Setting Attributes and Inner Text/HTML
		System.out.println(timeElement.attr("datetime", "2016-12-16 15:19:54.3"));
		System.out.println(sectionDiv.text("foo bar"));  	//search for the string in the document and print it with the tag
		System.out.println(firstArticle.select("h2").html("<div><span></span></div>"));
		
		//Creating and Appending Elements
		Element link = new Element(Tag.valueOf("a"), "")
				  .text("Checkout this amazing website!")
				  .attr("href", "http://baeldung.com")
				  .attr("target", "_blank");
				firstArticle.appendChild(link);	//append two elements
				
		//Removing Elements
		doc.select("li.navbar-link").remove();
		firstArticle.select("img").remove();
		
		//Converting the Modified Document to HTML
		String docHtml = doc.html();
	}

}
