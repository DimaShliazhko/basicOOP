package by.htp.basicOOP.task1.main;

import by.htp.basicOOP.task1.bean.Directory;
import by.htp.basicOOP.task1.logic.LogicTask1;
import by.htp.basicOOP.task1.view.ViewTask1;

public class MainTask1 {
	public static void main(String[] args) {
		LogicTask1 logic = new LogicTask1();
		ViewTask1 view = new ViewTask1();
		Directory directory = new Directory("папка");
		
		directory.setFiles(logic.creatTextFile("Код", "txt"));
		directory.setFiles(logic.creatTextFile("Код2", "txt2"));
		directory.setFiles(logic.creatTextFile("Код3", "txt3"));
		directory.setFiles(logic.creatTextFile("Код4", "txt4"));
		directory.setFiles(logic.creatTextFile("Код3", "txt5"));
		
		view.printDirectoryFile(directory);
		view.printDirectoryFile(logic.renameDirectory(directory, "новая папка"));
		view.printDirectoryFile(logic.deleteFile(directory, "код3"));
	}

}
