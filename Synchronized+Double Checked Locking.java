import java.lang.Thread;

class Terre {
    private volatile  Terre myTerre; // Nous avons déclaré myTerre volatile qui garantit que plusieurs threads offrent correctement la variable myTerre lors de son initialisation sur l'instance Terre.
    private int age;
    private int population;
 
    private Terre() {
    }
  
    public static Terre getInstance() {
        if (myTerre == null) {
            synchronized (Terre.class) {
                if (myTerre==null)
                    myTerre= new Terre();
            }
        }
        return myTerre;
    }
 
	public void myage(age) {
       this.age = age;
    }
    public void mypopulation(population) {
       this.population = population;
    }
}



class Client extends Thread{
    public static void main(String[] args) {
        Terre singleton = Terre.getInstance();
    }
}