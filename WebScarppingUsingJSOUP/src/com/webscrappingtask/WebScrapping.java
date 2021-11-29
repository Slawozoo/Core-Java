package com.webscrappingtask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrapping {
//	private static final String URL = "https://www.fiercebiotech.com/biotech/acorda-cmo-hits-exit-landing-pharnext-job-oversight-phase-3-neurological-disorder-trial";

	public static void main(String[] args) {
		WebScrappingUtils webScrap = new WebScrappingUtils();
		
		//Setting in articleList
		List<Article> articleList = webScrap.setArticleList();
		
		//extract from articleList
		webScrap.articleDisplay(articleList);
	}
}
