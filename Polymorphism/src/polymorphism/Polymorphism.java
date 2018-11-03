package polymorphism;

/**
 *
 * @author bruno
 */
class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats lots of people.";
    }

}

class AnotherMovie extends Movie {

    public AnotherMovie() {
        super("AnotherMovie");
    }

    @Override
    public String plot() {
        return "Just another movie.";
    }

}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "A movie about a strange book.";
    }

}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Space movie";
    }
}

class ForgetableMovie extends Movie {

    public ForgetableMovie() {
        super("Forgetable movie");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            
            System.out.println("#Movie: " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
            //Polymorphism is when an instance of the parent class points to child classes through objects
            //So Movie gets access to all overriden child classes
            //When there is none (overriden methods) it executes the method on own parent class (ForgetableMovie)
            
            //Overriden methods are used with child classes and then instances of the child class can use the overriden method
            //Polymorphism gets in action when the Parent class can access the overriden methods of the child classes
            
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new AnotherMovie();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();
        }
        return null;
    }

}
