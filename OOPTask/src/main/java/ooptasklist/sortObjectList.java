package ooptasklist;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortObjectList{
	public void sortObject(int size, List<Article> articleList) {
		//Article article;
//		for (int i = 0; i < size; i++) { // size : size of article list
//			List<Author> authorList = articleList.get(i).getAuthorList();
//			Collections.sort(authorList, new nameCompare());
//			//Collections.sort(article.getAuthors());
//
//		}
		for(Article article: articleList) {
		Collections.sort(article.getAuthorList(), new nameCompare());
		
		}
		for(Article article: articleList) {
			System.out.println("Title: "+article.getTitle()+"\tPublished Date:"+article.getPublishedDate()+"\tAuthoList: "+article.getAuthorList());
			}
		
	}

	
	public class nameCompare implements Comparator<Author>{
		public int compare(Author auth, Author auth2) {
			// TODO Auto-generated method stub
			return auth.getName().compareTo(auth2.getName());
		}
	}
	

	
}
