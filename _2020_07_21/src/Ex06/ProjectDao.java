package Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProjectDao {
	ArrayList<Project> list = new ArrayList<>();
	
	public ProjectDao() {
		File file = new File("project.dat");
		if(!(file.exists()&&file.isFile())) {
			return;
		}
		try (
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream in2 = new ObjectInputStream(in);)
		{
			Project project = null;
			while(true) {
				project = (Project)in2.readObject();
				list.add(project);
			}
		}catch(Exception e) {
			
		}
	}
	void insert(Project project) {
		list.add(project);
		saveToFile();
	}
	List<Project>selectList(){
		return list;
	}
	Project selectOne(int no) {
		if(no>=0&&no<list.size()) {
			return list.get(no);
		}
		return null;
	}
	int update(Project project) {
		if(project.no>=0 &&project.no<list.size()) {
			list.set(project.no, project);
			saveToFile();
			return 1;
		}
		return 0;
	}
	int delete(int no) {
		if(no>=0 && no<list.size()) {
			list.remove(no);
			saveToFile();
			return 1;
		}
		return 0;
	}
	void saveToFile() {
		File file = new File("project.dat");
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream out2 = new ObjectOutputStream(out);)
		{for(Project project: list) {
			out2.writeObject(project);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
  }
}

