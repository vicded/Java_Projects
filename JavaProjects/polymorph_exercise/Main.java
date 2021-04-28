package polymorph_exercise;

import java.util.Random;



class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String plot(){
        return "No plot here";
    }
    
    public String getTitle() {
        return title;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to conquer the Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Teens try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Follow the story of the Skywalkers";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //No plot method

}

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getTitle() + "\n" +
            "Movie plot: " + movie.plot() + "\n"); 
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Number generated: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
           
            case 2:
                return new IndependenceDay();
            
            case 3:
                return new MazeRunner();   
        
            case 4:
                return new StarWars();
    
            case 5:
                return new Forgetable();
        }
        
        return null;
    }
}


