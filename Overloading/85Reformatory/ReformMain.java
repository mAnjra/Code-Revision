public class ReformMain {
    public static void main(String[] args) {
        Reformatory reform = new Reformatory();

        Person brian = new Person("Brian", 1, 7, 110);
        Person pekka = new Person("Pekka", 33, 85, 176);
        /*
         * System.out.println(brian.getName()+" weight: " + reform.weight(brian) +
         * " kilos"); System.out.println(pekka.getName()+" weight: " +
         * reform.weight(pekka) + " kilos");
         * 
         * reform.feed(brian); reform.feed(brian); reform.feed(brian);
         * 
         * System.out.println(brian.getName()+" weight: " + reform.weight(brian) +
         * " kilos"); System.out.println(pekka.getName()+" weight: " +
         * reform.weight(pekka) + " kilos");
         */

        System.out.println("total weights measured " + reform.totalWeightsMeasured());

        reform.weight(brian);
        reform.weight(pekka);

        System.out.println("total weights measured " + reform.totalWeightsMeasured());

        reform.weight(brian);
        reform.weight(brian);
        reform.weight(brian);
        reform.weight(brian);

        System.out.println("total weights measured " + reform.totalWeightsMeasured());

    }
}