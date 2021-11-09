package oopfiletask;

import java.io.File;
import java.text.ParseException;
import java.util.List;

import org.json.simple.JSONArray;

public interface IArticleOperations {

	
	//public void addArticle(int n, List<Article> articleList);
	public JSONArray generateArticleJson(List<Article> articleList, File file);
	public void readFile(File file) throws ParseException, org.json.simple.parser.ParseException;
	
	
}
