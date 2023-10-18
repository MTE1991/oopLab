class Animals {
    Animals() {
        System.out.println("Animal is created.");
    }
}

class Dogs extends Animals {
    Dogs() {
        System.out.println("Dog is created");
    }
}

public class TestSup {
    public static void main(String[] args) {
        Dogs d = new Dogs();
    }    
}
