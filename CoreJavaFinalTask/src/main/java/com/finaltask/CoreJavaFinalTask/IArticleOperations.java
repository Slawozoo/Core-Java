package com.finaltask.CoreJavaFinalTask;

import java.io.File;
import java.text.ParseException;
import java.util.List;

public interface IArticleOperations {

	public List<Article> readFile(File file) throws ParseException, org.json.simple.parser.ParseException;
}
