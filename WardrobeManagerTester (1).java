
// TODO: file header comment
import java.util.Arrays;
// TODO: class header comment (and ALL non-provided method headers!)
public class WardrobeManagerTester {
//// CONTAINS

  
  
  
  
  
  
  
  public static boolean testContainsEmpty() {
  String[][] emptyWardrobe = new String[10][];
  int size = 0;

  // (2) call the method we are testing
  boolean actual = WardrobeManager.containsClothing("test", "brand", emptyWardrobe, size);

  // (3) verify the expected return value
  boolean expected = false;
  if (expected != actual) 
      return false;
  // (4) verify that the provided array was not modified
  if (!Arrays.deepEquals(emptyWardrobe, new String[10][])) 
      return false;

  // (5) if all checks pass, return true
  return true;
  
}









/**
* PROVIDED: example test method for verifying whether an item is already in the
wardrobe.
* @return false if any of the conditions we are verifying are not what we
expect; true ONLY if
* all of our expectations are correct
*/

public static boolean testContainsTrue() {
// (1) set up the test variables and call the method we are testing - EXACT
//MATCH
String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
"Levi", "never"},
null, null, null};
String[][] wardrobeCopy = Arrays.copyOf(wardrobe, wardrobe.length);
int size = 2;
boolean expected = true;
boolean actual = WardrobeManager.containsClothing("black t-shirt", "Hanes",
wardrobe, size);
// (2) verify that the expected return value and the actual return value match
if (expected != actual) return false;
// (3) another test method call, this time with case difference (that should
//still match!)
actual = WardrobeManager.containsClothing("dark blue jeans", "LEVI", wardrobe,
size);
if (expected != actual) return false;
// (4) since this method should not modify the array, let's check it against
//our copy:
if (!Arrays.deepEquals(wardrobe, wardrobeCopy)) return false;
// (5) if all of those checks pass, NOW we can say we passed the test
return true;
}








public static boolean testContainsFalse() {
  
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
    "Levi", "never"},
    null, null, null};
    String[][] wardrobeCopy = Arrays.copyOf(wardrobe, wardrobe.length);
    int size = 2;
    boolean expected = false;
    boolean actual = WardrobeManager.containsClothing("testFalse", "H",
    wardrobe, size);
    // (2) verify that the expected return value and the actual return value match
    if (expected != actual) return false;
    // (3) another test method call, this time with case difference (that should
    //still match!)
    
    // (4) since this method should not modify the array, let's check it against
    //our copy:
    if (!Arrays.deepEquals(wardrobe, wardrobeCopy)) 
      return false;
    // (5) if all of those checks pass, NOW we can say we passed the test
    return true;
    }





//// ADD
/**
* PROVIDED: example test method for adding a new clothing item to an EMPTY
oversize array.
* @return false if any of the conditions we are verifying are not what we
expect; true ONLY if
* all of our expectations are correct
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
if (!empty[0][0].equalsIgnoreCase("green crop top") || !empty[0]
[1].equalsIgnoreCase("H&M") ||
!empty[0][2].equals("never")) return false;
// (4) verify that NOTHING ELSE was changed unexpectedly
for (int i=1; i<empty.length; i++) {
if (empty[i] != null) return false;
}
// (5) if all of those checks pass, NOW we can say that we passed the test
return true;
}






public static boolean testAddNonEmpty() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
    "Levi", "never"},
    null, null, null};
    int size = 2;
  int expected = 3;
  int actual = WardrobeManager.addClothing("green crop top", "H&M", wardrobe, size);
  // (2) verify the expected return value
  if (expected != actual) return false;
  // (3) verify that the provided array was updated correctly
  if (wardrobe[2] == null) return false;
  if (!wardrobe[2][0].equalsIgnoreCase("green crop top") || !wardrobe[2]
  [1].equalsIgnoreCase("H&M") ||
  !wardrobe[2][2].equals("never")) return false;
  // (4) verify that NOTHING ELSE was changed unexpectedly
  for (int i=3; i<wardrobe.length; i++) {
  if (wardrobe[i] != null) return false;
  }
  // (5) if all of those checks pass, NOW we can say that we passed the test
  return true;
}



public static boolean testAddDuplicate() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
    "Levi", "never"},
    null, null, null};
    int size = 2;
  int expected = 2;
  int actual = WardrobeManager.addClothing("black t-shirt", "Hanes", wardrobe, size);
  // (2) verify the expected return value
  if (expected != actual) return false;
 
  // (4) verify that NOTHING ELSE was changed unexpectedly
  for (int i=2; i<wardrobe.length; i++) {
  if (wardrobe[i] != null) return false;
  }
  // (5) if all of those checks pass, NOW we can say that we passed the test
  return true;

}

public static boolean testAddToFull() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
    "Levi", "never"},
  };
    int size = 2;
  int expected = 2;
  int actual = WardrobeManager.addClothing("green crop top", "H&M", wardrobe, size);
  // (2) verify the expected return value
  if (expected != actual) return false;
  if (!wardrobe[1][0].equalsIgnoreCase("dark blue jeans") || !wardrobe[1]
      [1].equalsIgnoreCase("Levi") ||
      !wardrobe[1][2].equals("never")) return false;

  return true;

}


//// INDEX OF
public static boolean testIndexOfEmpty() {
  
  String[][] empty = new String[10][];
  int size = 0;
 int actual = WardrobeManager.indexOfClothing("test","test1", empty, size);
 int expected = -1;
 if (actual==expected) {
   return true;
 }
return false;

}


public static boolean testIndexOfFirstLast() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "H&M","never"}
  };
  int size = 3;
  boolean result1 = false;
  boolean result2= false;
  int expected1 = 2;
  int expected2 = 0;

  int actual1 = WardrobeManager.indexOfClothing("green crop top", "H&M", wardrobe, size);
  // (2) verify the expected return value
  if (expected1 == actual1) result1=true;
  int actual2 = WardrobeManager.indexOfClothing("black t-shirt", "Hanes", wardrobe, size);
  // (2) verify the expected return value
  if (expected2 == actual2) result2=true;
  return result1 && result2;
}
public static boolean testIndexOfMiddle() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "H&M","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 1;

  int actual1 = WardrobeManager.indexOfClothing("dark blue jeans", "Levi", wardrobe, size);
  // (2) verify the expected return value
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testIndexOfNoMatch() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "H&M","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = -1;

  int actual1 = WardrobeManager.indexOfClothing(" test ", "er", wardrobe, size);
  // (2) verify the expected return value
  if (expected1 == actual1) result1=true;
  return result1 ;

}
//// WEAR
public static boolean testWearClothingTrue() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "H&M","never"}
  };
  int size = 3;
  boolean result1 = false;
  boolean expected1 = true;
  boolean actual1 = WardrobeManager.wearClothing("black t-shirt", "Hanes","2022-06-22",wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testWearClothingNoMatch() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "H&M","never"}
  };
  int size = 3;
  boolean result1 = false;
  boolean expected1 = false;
  boolean actual1 = WardrobeManager.wearClothing("birt", "Hes","2022-06-22",wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
//// BRAND COUNT
public static boolean testBrandCountAllMatch() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Hanes", "never"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 3;
  int actual1 = WardrobeManager.getBrandCount("Hanes",wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testBrandCountSomeMatch() {

  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 2;
  int actual1 = WardrobeManager.getBrandCount("Hanes",wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testBrandCountNoMatch() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 0;
  int actual1 = WardrobeManager.getBrandCount("Ben",wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
//// COUNT UNWORN
public static boolean testUnwornCountAllMatch() {

  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 3;
  int actual1 = WardrobeManager.getNumUnwornClothes(wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testUnwornCountSomeMatch() {

  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "2022-06-22"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 2;
  int actual1 = WardrobeManager.getNumUnwornClothes(wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
public static boolean testUnwornCountNoMatch() {
  String[][] wardrobe = {{"black t-shirt", "Hanes", "2022-06-22"}, {"dark blue jeans",
          "Levi", "2022-06-22"},{"green crop top", "Hanes","2022-06-22"}
  };
  int size = 3;
  boolean result1 = false;
  int expected1 = 0;
  int actual1 = WardrobeManager.getNumUnwornClothes(wardrobe,size);
  if (expected1 == actual1) result1=true;
  return result1 ;
}
//// MOST RECENTLY WORN
/**
* PROVIDED: example test method for verifying that the most recently worn item
is found correctly.
* Note that this tester is not comprehensive; if you wish to verify additional
behavior you are
* welcome to add additional tester methods (please specify such methods to be
PRIVATE).
*
* @return false if any of the conditions we are verifying are not what we
expect; true ONLY if
* all of our expectations are correct
*/
public static boolean testMostRecentlyWorn() {
// (1) set up the test variables and call the method we are testing - EXACT
//MATCH
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
// (3) since this method should not modify the array, let's check it against
//our copy:
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
  String[][] wardrobe = {{"black t-shirt", "Hanes", "2020-03-16"}, {"dark blue ",
          "Levi", "2020-03-16"},{"green crop top", "Hanes","2020-03-16"}
  };
  int size = 3;
  boolean result1 = false;
  boolean result2 = true;
  int expected1 = 3;
  int actual1 = WardrobeManager.removeAllUnworn(wardrobe,size);
  if (expected1 == actual1) result1=true;
  for (int i =0;i<size;i++){
    if(wardrobe[i]==null){
      result2=false;
    }
  }
  return result1 && result2;
}
public static boolean testRemoveUnwornSomeMatch() {
return false; // TODO
}
public static boolean testRemoveUnwornAllMatch() {

  String[][] wardrobe = {{"black t-shirt", "Hanes", "never"}, {"dark blue jeans",
          "Levi", "never"},{"green crop top", "Hanes","never"}
  };
  int size = 3;
  boolean result1 = false;
  boolean result2 = true;
  int expected1 = 0;
  int actual1 = WardrobeManager.removeAllUnworn(wardrobe,size);
  if (expected1 == actual1) result1=true;
  for (int i =0;i<size;i++){
    if(wardrobe[i]!=null){
      result2=false;
    }
  }
  return result1 && result2;
}
/**
* PROVIDED: calls all tester methods and displays the results of the tests.
*
* All tests are called in the order they were provided in this file. The output
of this method
* will NOT be graded so you may modify it however you wish.
*
* @param args unused
*/
public static void main(String[] args) {


  
  System.out.println("CONTAINS:\n "+(testContainsEmpty()?"pass":"FAIL")+", "+
(testContainsTrue()?"pass":"FAIL")+", "+
(testContainsFalse()?"pass":"FAIL"));
System.out.println("ADD:\n "+(testAddToEmpty()?"pass":"FAIL")+", "+
(testAddNonEmpty()?"pass":"FAIL")+
", "+(testAddDuplicate()?"pass":"FAIL")+", "+
(testAddToFull()?"pass":"FAIL"));
System.out.println("INDEX OF:\n "+(testIndexOfEmpty()?"pass":"FAIL")+", "+
(testIndexOfFirstLast()?"pass":"FAIL")+
", "+(testIndexOfMiddle()?"pass":"FAIL")+", "+
(testIndexOfNoMatch()?"pass":"FAIL"));
System.out.println("WEAR:\n "+(testWearClothingTrue()?"pass":"FAIL")+", "+
(testWearClothingNoMatch()?"pass":"FAIL"));
System.out.println("BRAND COUNT:\n "+(testBrandCountAllMatch()?"pass":"FAIL")
+", "+
(testBrandCountSomeMatch()?"pass":"FAIL")+", "+
(testBrandCountNoMatch()?"pass":"FAIL"));
System.out.println("UNWORN COUNT:\n "+
(testUnwornCountAllMatch()?"pass":"FAIL")+", "+
(testUnwornCountSomeMatch()?"pass":"FAIL")+", "+
(testUnwornCountNoMatch()?"pass":"FAIL"));
System.out.println("MOST RECENTLY WORN:\n "+
(testMostRecentlyWorn()?"pass":"FAIL"));
System.out.println("REMOVE BY INDEX:\n "+(testRemoveLastItem()?"pass":"FAIL")
+", "+
(testRemoveFirstItem()?"pass":"FAIL")+", "+
(testRemoveBadIndex()?"pass":"FAIL"));
System.out.println("REMOVE UNWORN:\n "+
(testRemoveUnwornNoMatch()?"pass":"FAIL")+", "+
(testRemoveUnwornSomeMatch()?"pass":"FAIL")+", "+
(testRemoveUnwornAllMatch()?"pass":"FAIL"));



}
}
