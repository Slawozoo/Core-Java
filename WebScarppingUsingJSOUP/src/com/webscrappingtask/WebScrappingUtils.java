package com.webscrappingtask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrappingUtils {

	// Urls in the list
	public List<String> getUrl() {
		List<String> urlList = new ArrayList<String>();

		urlList.add(
				"https://www.fiercebiotech.com/biotech/acorda-cmo-hits-exit-landing-pharnext-job-oversight-phase-3-neurological-disorder-trial");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/merck-buzzes-dragonfly-for-second-immunotherapy-candidate-700m-pact-month-after-bristol");
		urlList.add(
				"https://www.fiercebiotech.com/sponsored/cross-functional-strategies-for-development-and-launch-new-products");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/data-manipulation-scientist-elizabeth-bik-cassava-athira-alzheimer-s-data-manipulation");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/rafael-resets-after-phase-3-flop-parting-ways-5-execs-and-reinstating-telecom-tycoon-as-ceo");
		urlList.add("https://www.fiercebiotech.com/sponsored/tips-building-a-resilient-cgmp-chemical-supply-chain");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/vaccibody-now-nykode-celebrates-new-name-a-new-regeneron-deal-worth-900m-plus");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/founder-led-biotech-making-space-for-ideas-and-diverse-leaders-where-it-didn-t-exist-before");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/astrazeneca-after-years-delays-and-spiraling-costs-opens-cambridge-r-d-site-will-bet-pay");
		urlList.add(
				"https://www.fiercebiotech.com/biotech/gsk-takes-a-1b-dive-into-nash-penning-rnai-pact-target-arrowhead-pharmaceuticals");

		return urlList;

	}

	// Setting article into List
	public List<Article> setArticleList() {
		List<Article> articleList = new ArrayList<>();

		Document doc;
		try {

			List<String> urlList = getUrl();
			for (int i = 0; i < urlList.size(); i++) {
				Article article = new Article();
				doc = Jsoup.connect(urlList.get(i)).get();
				// System.out.println(doc.select("span"));
				Elements articleTitle = doc.getElementsByClass("page-title");
				for (Element title : articleTitle) {
					// System.out.println((title).text());
					article.setTitle((title).text());

				}
				Elements getAuthor = doc.getElementsByClass("node__submitted");
				for (Element name : getAuthor) {
					// System.out.println(getAuthor.select("a").text());
					article.setAuthorName(getAuthor.select("a").text());
//	            	System.out.println(getAuthor.select("a[href]"));

					// For link in the authorName
					Elements linksOnPage = getAuthor.select("a[href]");
					for (Element page : linksOnPage) {
						article.setAuthorLink(page.attr("abs:href"));
						// System.out.println(page.attr("abs:href"));
						Document document = Jsoup.connect(page.attr("abs:href")).get();
						Elements element = document.getElementsByClass("node__content");
						for (Element description : element) {
//	    					System.out.println(email.select("span").select("a"));
							article.setAuthorDescription(description.text());
							// System.out.println(description.text());
						}

					}

					// System.out.println(getAuthor.select("time").text());
					article.setPublishedDate(getAuthor.select("time").text());

					articleList.add(article);

				}
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return articleList;
	}
	

	//Getting articles from articleList
	public void articleDisplay(List<Article> articleList) {
		Iterator itr = articleList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
