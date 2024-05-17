
public class WardrobeManager {
  
  
  
  
  
  
  
  
  
  
  public static int addClothing(String description, String brand, String[][] wardrobe, int wardrobeSize) {
    if ( containsClothing(description, brand, wardrobe, wardrobeSize) || wardrobeSize >= wardrobe.length ) {
      // If Duplicate is found or wardrobe is full, then this does not add the item to the 2D array
        return wardrobeSize;
    }

    String lastWorn = "never"; // sets last worn as never
    String []Ward= new String[3];
    
    Ward[0] = description;
    Ward[1] = brand;
    Ward[2] = lastWorn;
    wardrobe[wardrobeSize]= Ward;
    wardrobeSize++;

    // Appends (adds at the end) a new clothing item to the given wardrobe
     // oversize array defined by the provided two-dimensional array of strings and its size
    return wardrobeSize ;
}
  
  
  
 

  
  public static boolean containsClothing(String description, String brand, String[][] wardrobe, int wardrobeSize) {
    for (int i = 0; i < wardrobeSize; i++) {
        if (description.equalsIgnoreCase(wardrobe[i][0]) && brand.equalsIgnoreCase(wardrobe[i][1])) {
            // Matching description and brand found,keeping in mind that it is case insensitive.
            return true;
        }
    }

    // No matching description and brand found
    return false;
}
  
  
  
  
  
  
  
 
  
  public static int getBrandCount(String brand, String[][] wardrobe, int wardrobeSize) {
    int brandCount=0;
    for(int i=0;i<wardrobeSize;i++) {
      if(wardrobe[i][1].equalsIgnoreCase(brand)) {
        brandCount++;
      }
 
      }
    return brandCount;//should i keep it here or put it after the loop 
    }
    
  
  
  
  
 
  
  
  
  
  
  public static int getMostRecentlyWorn(String[][] wardrobe, int wardrobeSize) {
    int recentlyWorn = 0; // Start with the first item
    String recentDate = wardrobe[0][2];//starting point for the search

    for (int i = 1; i < wardrobeSize; i++) {
        String currentDate = wardrobe[i][2];
        if (currentDate.compareTo(recentDate) > 0) {
            recentDate = currentDate;
            recentlyWorn = i;
        }
    }
    if( wardrobeSize==0 ) {
      
      return wardrobeSize=-1;
    }
    if(recentDate == "never"){
        return 0;

    }    return recentlyWorn;
  }
  
 
  
  
  
  
  
  
  
  
  
  
  public static int getNumUnwornClothes(String[][] wardrobe, int wardrobeSize) {
      int unwornClothes= 0;

      for (int i = 0; i < wardrobeSize; i++) {
          if (wardrobe[i][2].equals("never")) {
            unwornClothes++;
          }
      }

      return unwornClothes;
   }
  
  
  
 
  
  
  
  
  
  
  
  public static int indexOfClothing(String description, String brand, String[][] wardrobe, int wardrobeSize) {
      for (int i = 0; i < wardrobeSize; i++) {
          if (wardrobe[i][0].equalsIgnoreCase(description) && wardrobe[i][1].equalsIgnoreCase(brand)) {
              return i; // Found a match, return its index
          }
      }

      // No match found, return -1
      return -1;
   }
  
  
  
  
  
  
  
  
  
  
  
  public static int removeAllUnworn(String[][] wardrobe, int wardrobeSize) {
      int size = wardrobeSize;
          // Iterate through the existing wardrobe
          for (int i = 0; i < size; i++) {

              if (wardrobe[i][2].equals("never")) {
                  wardrobe[i]=null;
                  wardrobeSize--;
              }


          }
          return wardrobeSize;

  }



    public static int removeClothingAtIndex(int index, String[][] wardrobe, int wardrobeSize) {
        //Removes the single clothing item entry at the provided index of the oversize array defined by the provided two-dimensional array of strings and size, updates the array to uphold the oversize array requirements, and returns the new size of the array.



        for(int i=0;i<wardrobeSize;i++) {
            if(index==i) {
                wardrobe[i]=null;
                wardrobeSize--;
            }
        }


        return wardrobeSize;
    }
  
  
  
  
  public static boolean wearClothing(String description, String brand, String date, String[][] wardrobe, int wardrobeSize) {
    for (int i = 0; i < wardrobeSize; i++) {
        if (description.equalsIgnoreCase(wardrobe[i][0]) && brand.equalsIgnoreCase(wardrobe[i][1])) {

            wardrobe[i][2] = date;//and updates the last-worn date to the provided date value (assumed to be formatted as "YYYY-MM-DD").
            
            return true;
        }
    }

    // No matching description and brand found
    return false;
}
  
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
