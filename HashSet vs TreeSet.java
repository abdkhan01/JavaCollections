import java.util.HashSet; 
class HashSetVsTreeset { 
    public static void main(String[] args) 
    { 
  
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("geeks"); 
        hset.add("for"); 
        hset.add("practice"); 
        hset.add("contribute"); 
  
        // Duplicate removed 
        hset.add("geeks"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 
        
        // Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("geeks"); 
        tset.add("for"); 
        tset.add("practice"); 
        tset.add("contribute"); 
  
        // Duplicate removed 
        tset.add("geeks"); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
    } 
} 