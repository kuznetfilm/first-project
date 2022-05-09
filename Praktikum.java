public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        
        System.out.println("Первого хомяка зовут " + bite.name);
        System.out.println("Второго хомяка зовут " + ninja.name);
        System.out.println("Третьего хомяка зовут " + kuzya.name);
        System.out.println("Четвертого хомяка зовут " + paskal.name);
    }
} 
