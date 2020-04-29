package by.htp.basicOOP.task1.logic;

import by.htp.basicOOP.task1.bean.Directory;
import by.htp.basicOOP.task1.bean.TextFile;

public class LogicTask1 {

	public TextFile creatTextFile(String name, String type) {
		TextFile textFile = new TextFile(name, type);
		return textFile;
	}

	public Directory renameDirectory(Directory directory, String name) {
		directory.setName(name);
		return directory;
	}

	public Directory deleteFile(Directory directory, String name) {
		for (int i = 0; i < directory.getFiles().size(); i++) {
			if (directory.getFiles().get(i).getName().equalsIgnoreCase(name)) {
				directory.getFiles().remove(i);
			}
		}

		return directory;
	}

}
