package fileinterface;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

public interface FileWriteInterface {

	
	public void doSaveAuthor(int n, File file, JSONArray jsonList, List<Author> authList);
}
