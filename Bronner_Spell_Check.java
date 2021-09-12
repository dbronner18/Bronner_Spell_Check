package bronner_spell_check;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bronner_Spell_Check {
	public static void main(String [] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		List<String> checkList = new ArrayList<>();
		List<String> dictionaryList = new ArrayList<>();
		
		String file1;
		String file2;
		
		System.out.print("Enter name of first file: ");
		file1 = input.nextLine();
		System.out.print("Enter name of file 2: ");
		file2 = input.nextLine();
		input.close();
		
		File checkFile = new File(file1);
		File dictionaryFile = new File(file2);
		if(!checkFile.exists()) {
			System.out.println("Check file does not exist");
			System.exit(-1);
		}
		if (!dictionaryFile.exists()) {
			System.out.println("Dictionary file does not exist");
			System.exit(-1);
		}
		
		input = new Scanner(checkFile);
		
		
		while(input.hasNext()) {
			checkList.add(input.next());
		}
		input.close();
		
		input = new Scanner(dictionaryFile);
		
		while(input.hasNext()) {
			dictionaryList.add(input.next());
		}
		input.close();
		
		for(String word: checkList) {
			if(!dictionaryList.contains(word)) {
				System.out.println(word + " is an unknown word.");
			}
				
		}
		
		
			
	}

}
