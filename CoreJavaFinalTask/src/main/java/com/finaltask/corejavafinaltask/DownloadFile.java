package com.finaltask.corejavafinaltask;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFile {

	/**
	 * Download file
	 */
	public void downloadFile() {
		// Download file from URL
		try {
			URL url = new URL("http://localhost:8080/Files/Article.json");
			File destination_file = new File("Article.json");
			FileUtils.copyURLToFile(url, destination_file);
		}

		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}
