package fileinterface;

import java.io.File;
import java.util.List;

import org.json.simple.JSONArray;

public interface IAuthorOperations {
	
	public List<Author> doReadAuthor(File file);
	public void doSaveAuthor(int n, File file, JSONArray jsonList, List<Author> authList);
}
