import java.util.*;

public class Thanos {

    public static void main(String[] args) {

    
    	 Hero blackWidow = new Hero ("Black Widow", 34);
         Hero captainAmercia = new Hero ("Captain Amercia", 100);
    	 Hero vision = new Hero ("Vision", 3);
    	 Hero ironMan = new Hero ("Iron Man", 48);
    	 Hero scarletWitch = new Hero ("Scarlet Witch", 29);
    	 Hero thor = new Hero ("Thor", 1500);
    	 Hero spiderMan = new Hero ("Spider-Man", 18);
    	 Hero hulk = new Hero ("Hulk", 49);
    	 Hero doctorStrange = new Hero ("Doctor Strange", 42);

    	 ArrayList<Hero> heroes = new ArrayList<>();

    	 heroes.add(blackWidow); // index 0
    	 heroes.add(captainAmercia); 
    	 heroes.add(vision); 
    	 heroes.add(ironMan);
    	 heroes.add(scarletWitch); 
    	 heroes.add(thor); 
    	 heroes.add(spiderMan); 
    	 heroes.add(hulk); 
    	 heroes.add(doctorStrange); // index 8
    	 
       

         
    	// TODO 3: C'est l'anniversaire de Thor, maintenant il a 1501 ans
    	 thor.setAge(1501);
    	 System.out.println("C'est l'anniversaire de Thor, il a maintenant" + thor.getAge());
    	 
    	// TODO 4: Mélangez la liste des héros
    	 
    	 Collections.shuffle(heroes); 
         System.out.println("Après le claquement de doigts de Thanos"); 

    	List<Hero> heroesRemaning = heroes.subList(0, (int) (heroes.size()/2));
         
         
         for(int i = 0; i < heroesRemaning.size(); i++)
         {
           System.out.println(heroesRemaning.get(i).getName());
         }

      // TODO 6: Faites une boucle dans la liste et affichez le nom des héros restants
    	    }
    }
