import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {
		// List
		String[] Words = {"right","subdued","trick","crayon","punishment","silk","describe","royal","prevent","slope"};
		System.out.println(bubbleSort(Words));


	}

	public static ArrayList<String> bubbleSort(String [] words) {
		//Array to hold sorted list based on length of the word
		ArrayList<String> list = new ArrayList<>();
		String temp; 
		//loop used to keep swapping/sorting words until it has gone throuh entire list
		for (int i=0; i< words.length; i++){
			for(int j= i; j< words.length-1; j++){
				int first = words[i].charAt(0);
				int sec = words[j +1].charAt(0);
				if (first > sec)  {
					//swapping words in the list
					temp = words[j +1];
					words[j +1] = words[i];
					words[i] = temp;
				}
			}
			list.add(words[i]);
		}
		//returns sorted listed
		return list;
	}

}
