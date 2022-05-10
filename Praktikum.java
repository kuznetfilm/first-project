public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        
        System.out.println("Первого хомякка зовут " + bite.name);
        System.out.println("Второго хомякка зовут " + ninja.name);
        System.out.println("Третьего хомякка зовут " + kuzya.name);
        System.out.println("Четвертого хомякка зовут " + paskal.name);
    }
} 

public class Hamster {
    // Объявили поля, но не присвоили им значения
  String name;  // Имя
  int age;      // Возраст
  int weight;   // Вес в граммах
  String color; // Цвет
    
  // Конструктор принимает 5 параметров но записано 4 общем пишу чушь
    Hamster(String hamsterName, int hamsterAge, int hamsterWeight, String hamsterColor) {
        name = hamsterName;
    age = hamsterAge;
    weight = hamsterWeight;
    color = hamsterColor;
    
    }
}
