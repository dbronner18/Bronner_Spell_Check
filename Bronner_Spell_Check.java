package bronner_spell_check;

//Author Name: Devon Bronner
//Date: 9/12/2021
//Program Name: Bronner_Spell_Check
//Purpose: Basic spell checker to check if the words in one file are spelled correctly based on a dictionary file.

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
		
		//Get file to be checked
		System.out.print("Enter name of first file: ");
		file1 = input.nextLine();
		
		//Get dictionary file
		System.out.print("Enter name of second file: ");
		file2 = input.nextLine();
		input.close();
		
		//Create files
		File checkFile = new File(file1);
		File dictionaryFile = new File(file2);
		
		//IF(file doesnt exist)
		if(!checkFile.exists()) {
			//Print out message and exit program
			System.out.println("Check file does not exist");
			System.exit(-1);
		}
		
		//IF(file doesnt exist)
		if (!dictionaryFile.exists()) {
			//Print out message and exit program
			System.out.println("Dictionary file does not exist");
			System.exit(-1);
		}
		
		input = new Scanner(checkFile);
		
		//WHILE(there is another element in the file)
		while(input.hasNext()) {
			//Add element to the list
			checkList.add(input.next());
		}
		input.close();
		
		input = new Scanner(dictionaryFile);
		
		//WHILE(there is another element in the file)
		while(input.hasNext()) {
			//Add element to the list
			dictionaryList.add(input.next());
		}
		input.close();
		
		//FOR(all strings in the list of words to be checked)
		for(String word: checkList) {
			//IF(word is not in the dictionary list)
			if(!dictionaryList.contains(word)) {
				//Print out word is not in the list
				System.out.println(word + " is an unknown word.");
			}
		}
	}

}
