abstract class Hollywood {
    String name, genre;
    String[] cast;
    int releaseYr;
    float IMDBrating;
    int length;

    Hollywood(String name, String[] cast, int releaseYr, float IMDBrating, int length) {
        this.name = name;
        this.cast = cast;
        this.releaseYr = releaseYr;
        this.IMDBrating = IMDBrating;
        this.length = length;
    }

    abstract void showInfo();
}

class TheNun2 extends Hollywood {
    TheNun2(String name, String[] cast, int releaseYr, float IMDBrating, int length) {
        super(name, cast, releaseYr, IMDBrating, length);
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Cast: ");
        for (String actor : cast) {
            System.out.println(actor);
        }
        System.out.println("Released: " + releaseYr);
        System.out.println("IMDB rating (out of 10): " + IMDBrating);
        System.out.println("length (min): " + length);
    }
}

class Wish extends Hollywood {
    Wish(String name, String[] cast, int releaseYr, float IMDBrating, int length) {
        super(name, cast, releaseYr, IMDBrating, length);
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Cast: ");
        for (String actor : cast) {
            System.out.println(actor);
        }
        System.out.println("Released: " + releaseYr);
        System.out.println("IMDB rating (out of 10): " + IMDBrating);
        System.out.println("length (min): " + length);
    }
}

class TheCreator extends Hollywood {
    TheCreator(String name, String[] cast, int releaseYr, float IMDBrating, int length) {
        super(name, cast, releaseYr, IMDBrating, length);
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Cast: ");
        for (String actor : cast) {
            System.out.println(actor);
        }
        System.out.println("Released: " + releaseYr);
        System.out.println("IMDB rating (out of 10): " + IMDBrating);
        System.out.println("length (min): " + length);
    }
}


public class MovieApp {
    public static void main(String[] args) {
        String[] cast1 = {	
            "Taissa Farmiga",
            "Jonas Bloquet",
            "Storm Reid",
            "Anna Popplewell",
            "Bonnie Aarons",
        };
        Hollywood mov1 = new TheNun2("The Nun II", cast1 ,2023, 8f, 110);

        String[] cast2 = {
            "Ariana DeBose",
            "Chris Pine",
            "Alan Tudyk",
            "Angelique Cabral",
            "Victor Garber",
            "Natasha Rothwell",
            "Jennifer Kumiyama",
            "Evan Peters",
            "Harvey Guillén",
            "Ramy Youssef",
            "Niko Vargas",
            "Della Saba",
            "Jon Rudnitsky"
        };
        Hollywood mov2 = new Wish("Wish", cast2, 2023, 8.5f, 140);

        String[] cast3 = {
            "John David Washington",
            "Gemma Chan",
            "Ken Watanabe",
            "Sturgill Simpson",
            "Allison Janney"
        };
        Hollywood mov3 = new TheCreator("The Creator", cast3 ,2023, 8, 135);

        mov1.showInfo();
        mov2.showInfo();
        mov3.showInfo();
    }
}
