package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.function.Predicate;

import edu.grinnell.csc207.util.SearchUtils;

/**
 * Assorted experiments for searching structures.
 *
 * @author Tiffany Tang
 * @author Samuel A. Rebelsky (starter code)
 */
public class SearchExperiments {
  /**
   * Run our experimens.
   *
   * @param args
   *   Command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] tmp =
        new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                       "foxtrot", "golf", "hotel", "india",
                       "juliett", "kilo", "lima", "mike",
                       "november", "oscar", "papa", "quebec",
                       "romeo", "sierra", "tango", "uniform",
                       "victor", "whiskey", "xray", "yankee", "zulu" };
    ArrayList<String> strings = new ArrayList<String>(Arrays.asList(tmp));
    // try {
    //   Predicate<String> lessThanFiveChars = str -> str.length() < 5;
    //   String ex1c = SearchUtils.search(strings, lessThanFiveChars);
    //   pen.println("The first string of fewer than five letters is " + ex1c);
    // } catch (Exception e) {
    //   pen.println("There are no strings of fewer than five letters.");
    // } // try/catch

    try {
      char ch = 'u';
      CharSequence charS = new String(new char[] { ch });
      Predicate<String> lessThanFiveChars = str -> str.contains(charS);
      String ex1c = SearchUtils.search(strings, lessThanFiveChars);
      pen.println("The first string contains 'u' is " + ex1c);
    } catch (Exception e) {
      pen.println("There are no strings containing 'u'.");
    } // try/catch

    pen.close();
  } // main(String[])
} // class SearchUtils
