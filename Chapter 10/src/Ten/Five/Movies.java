package Ten.Five;

import Ten.Four.Sorting;

public class Movies
{
	//-----------------------------------------------------------------
	//  Creates a DVDCollection object and adds some DVDs to it. Prints
	//  reports on the status of the collection.
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{
		Movie[] MovieCollection = new Movie[4];

		MovieCollection[0] = new Movie("The Godfather", "Francis Ford Coppala", 1972, true);
		MovieCollection[1] = new Movie("District 9", "Neill Blomkamp", 2009, false);
		MovieCollection[2] = new Movie("Iron Man", "Jon Favreau", 2008, true);
		MovieCollection[3] = new Movie("The Matrix", "Andy & Lana Wachowski", 1999, true);

		// Use selectionSort algorithm.
		Sorting.selectionSort(MovieCollection);
		System.out.println("--------[Selection Sort]--------");
		for (Movie movie : MovieCollection)
		{
			System.out.println(movie);
		}
		
		// Use insertionSort algorithm.
		Sorting.insertionSort(MovieCollection);
		System.out.println("--------[Insertion Sort]--------");
		for (Movie movie : MovieCollection)
		{
			System.out.println(movie);
		}
	}
}