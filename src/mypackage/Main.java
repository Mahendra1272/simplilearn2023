package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperations.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("Java Project", "Mahendra Kumar Singh");
		HandleOptions.handleWelcomeScreenInput();

	}

}
