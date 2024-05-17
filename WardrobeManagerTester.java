// TODO: file header comment

import java.util.Arrays;

// TODO: class header comment (and ALL non-provided method headers!)
public class WardrobeManagerTester {
  
  //// CONTAINS
  
  public static boolean testContainsEmpty() {
    return false; // TODO
  }
  
  /**
   * PROVIDED: example test method for verifying whether an item is already in the wardrobe.
   * @return false if any of the conditions we are verifying are not what we expect; true ONLY if
   *         all of our expectations are correct
   */
  public static boolean testContainsTrue() {
    // (1) set up the test variables and call the method we are testing - EXACT MATCH
    String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans", "Levi", "never"},
        null, null, null};
    String[][] wardrobeCopy = Arrays.copyOf(wardrobe, wardrobe.length);
    int size = 2;
    boolean expected = true;
    boolean actual = WardrobeManager.containsClothing("black t-shirt", "Hanes", wardrobe, size);
    
    // (2) verify that the expected return value and the actual return value match
    if (expected != actual) return false;
    
    // (3) another test method call, this time with case difference (that should still match!)
    actual = WardrobeManager.containsClothing("dark blue jeans", "LEVI", wardrobe, size);
    if (expected != actual) return false;
    
    // (4) since this method should not modify the array, let's check it against our copy:
    if (!Arrays.deepEquals(wardrobe, wardrobeCopy)) return false;
    
    // (5) if all of those checks pass, NOW we can say we passed the test
    return true;
  }
  
  public static boolean testContainsFalse() {
    return false; // TODO
  }
  
  //// ADD
  
  /**
   * PROVIDED: example test method for adding a new clothing item to an EMPTY oversize array.
   * @return false if any of the conditions we are verifying are not what we expect; true ONLY if
   *         all of our expectations are correct
   */
  public static boolean testAddToEmpty() {
    // (1) set up the test variables and call the method we are testing
    String[][] empty = new String[10][];
    int size = 0;
    int expected = 1;
    int actual = WardrobeManager.addClothing("green crop top", "H&M", empty, size);
    
    // (2) verify the expected return value
    if (expected != actual) return false;

    // (3) verify that the provided array was updated correctly
    if (empty[0] == null) return false;
    if (!empty[0][0].equalsIgnoreCase("green crop top") || !empty[0][1].equalsIgnoreCase("H&M") ||
        !empty[0][2].equals("never")) return false;
    
    // (4) verify that NOTHING ELSE was changed unexpectedly
    for (int i=1; i<empty.length; i++) {
      if (empty[i] != null) return false;
    }
    
    // (5) if all of those checks pass, NOW we can say that we passed the test
    return true;
  }
  
  public static boolean testAddNonEmpty() {
    return false; // TODO
  }
  
  public static boolean testAddDuplicate() {
    return false; // TODO
  }
  
  public static boolean testAddToFull() {
    return false; // TODO
  }
  
  //// INDEX OF
  
  public static boolean testIndexOfEmpty() {
    return false; // TODO
  }
  
  public static boolean testIndexOfFirstLast() {
    return false; // TODO
  }
  
  public static boolean testIndexOfMiddle() {
    return false; // TODO
  }
  
  public static boolean testIndexOfNoMatch() {
    return false; // TODO
  }
  
  //// WEAR
  
  public static boolean testWearClothingTrue() {
    return false; // TODO
  }
  
  public static boolean testWearClothingNoMatch() {
    return false; // TODO
  }
  
  //// BRAND COUNT
  
  public static boolean testBrandCountAllMatch() {
    return false; // TODO
  }
  
  public static boolean testBrandCountSomeMatch() {
    return false; // TODO
  }
  
  public static boolean testBrandCountNoMatch() {
    return false; // TODO
  }
  
  //// COUNT UNWORN
  
  public static boolean testUnwornCountAllMatch() {
    return false; // TODO
  }
  
  public static boolean testUnwornCountSomeMatch() {
    return false; // TODO
  }
  
  public static boolean testUnwornCountNoMatch() {
    return false; // TODO
  }
  
  //// MOST RECENTLY WORN
  
  /**
   * PROVIDED: example test method for verifying that the most recently worn item is found correctly.
   * Note that this tester is not comprehensive; if you wish to verify additional behavior you are
   * welcome to add additional tester methods (please specify such methods to be PRIVATE).
   * 
   * @return false if any of the conditions we are verifying are not what we expect; true ONLY if
   *         all of our expectations are correct
   */
  public static boolean testMostRecentlyWorn() {
    // (1) set up the test variables and call the method we are testing - EXACT MATCH
    String[][] wardrobe = {{"black t-shirt", "Hanes", "2023-12-19"}, 
        {"grey UW hoodie", "gildan", "2020-03-16"},
        {"dark blue jeans", "Levi", "2024-01-25"},
        {"green cabled sweater", "handmade", "never"}, null};
    String[][] wardrobeCopy = Arrays.copyOf(wardrobe, wardrobe.length);
    int size = 4;
    int expected = 2;
    int actual = WardrobeManager.getMostRecentlyWorn(wardrobe, size);
    
    // (2) verify that the expected return value and the actual return value match
    if (expected != actual) return false;
    
    // (3) since this method should not modify the array, let's check it against our copy:
    if (!Arrays.deepEquals(wardrobe, wardrobeCopy)) return false;
    
    // (4) if all of those checks pass, NOW we can say we passed the test
    return true;
  }
  
  //// REMOVE BY INDEX
  
  public static boolean testRemoveLastItem() {
    return false; // TODO
  }
  
  public static boolean testRemoveFirstItem() {
    return false; // TODO
  }
  
  public static boolean testRemoveBadIndex() {
    return false; // TODO
  }
  
  //// REMOVE ALL UNWORN
  
  public static boolean testRemoveUnwornNoMatch() {
    return false; // TODO
  }
  
  public static boolean testRemoveUnwornSomeMatch() {
    return false; // TODO
  }
  
  public static boolean testRemoveUnwornAllMatch() {
    return false; // TODO
  }

  /**
   * PROVIDED: calls all tester methods and displays the results of the tests.
   * 
   * All tests are called in the order they were provided in this file. The output of this method
   * will NOT be graded so you may modify it however you wish.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    System.out.println("CONTAINS:\n  "+(testContainsEmpty()?"pass":"FAIL")+", "+
        (testContainsTrue()?"pass":"FAIL")+", "+(testContainsFalse()?"pass":"FAIL"));
    System.out.println("ADD:\n  "+(testAddToEmpty()?"pass":"FAIL")+", "+(testAddNonEmpty()?"pass":"FAIL")+
        ", "+(testAddDuplicate()?"pass":"FAIL")+", "+(testAddToFull()?"pass":"FAIL"));
    System.out.println("INDEX OF:\n  "+(testIndexOfEmpty()?"pass":"FAIL")+", "+(testIndexOfFirstLast()?"pass":"FAIL")+
        ", "+(testIndexOfMiddle()?"pass":"FAIL")+", "+(testIndexOfNoMatch()?"pass":"FAIL"));
    System.out.println("WEAR:\n  "+(testWearClothingTrue()?"pass":"FAIL")+", "+(testWearClothingNoMatch()?"pass":"FAIL"));
    System.out.println("BRAND COUNT:\n  "+(testBrandCountAllMatch()?"pass":"FAIL")+", "+
        (testBrandCountSomeMatch()?"pass":"FAIL")+", "+(testBrandCountNoMatch()?"pass":"FAIL"));
    System.out.println("UNWORN COUNT:\n  "+(testUnwornCountAllMatch()?"pass":"FAIL")+", "+
        (testUnwornCountSomeMatch()?"pass":"FAIL")+", "+(testUnwornCountNoMatch()?"pass":"FAIL"));
    System.out.println("MOST RECENTLY WORN:\n  "+(testMostRecentlyWorn()?"pass":"FAIL"));
    System.out.println("REMOVE BY INDEX:\n  "+(testRemoveLastItem()?"pass":"FAIL")+", "+
        (testRemoveFirstItem()?"pass":"FAIL")+", "+(testRemoveBadIndex()?"pass":"FAIL"));
    System.out.println("REMOVE UNWORN:\n  "+(testRemoveUnwornNoMatch()?"pass":"FAIL")+", "+
        (testRemoveUnwornSomeMatch()?"pass":"FAIL")+", "+(testRemoveUnwornAllMatch()?"pass":"FAIL"));
  }

}
