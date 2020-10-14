import java.lang.Thread;

class Terre {
    private static Terre myTerre;
    private int age;
    private int population;
 
    private Terre() {
    }
  
    public static synchronized Terre getInstance() {
        if (myTerre==null){
            myTerre= new Terre();
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