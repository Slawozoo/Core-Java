package com.finaltask.corejavafinaltask.dao;

import java.io.File;

import java.text.ParseException;
import java.util.List;

import com.finaltask.corejavafinaltask.domain.*;

public interface IArticleOperations {

	/**
	 * Read downloaded file
	 */
	public List<Article> readFile(File file) throws ParseException, org.json.simple.parser.ParseException;
}
