public class Double_Arrays {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Miss. "},
            {"John ", "Marry ", "Jolie "},
            {"Mutabazi", "Murekatete", "Mutoni"}
        };

        // a. Mr. John Mutabazi
        System.out.println(names[0][0] + names[1][0] + names[2][0]);

        // b. Mrs. Marry Murekatete
        System.out.println(names[0][1] + names[1][1] + names[2][1]);

        // c. Miss. Jolie Mutoni
        System.out.println(names[0][2] + names[1][2] + names[2][2]);
    }
}