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

public class Hamster {
    // Объявили поля, но не присвоили им значения
  String name;  // Имя
  int age;      // Возраст
  int weight;   // Вес в граммах
  String color; // Цвет
    
  // Конструктор принимает 4 параметра
    Hamster(String hamsterName, int hamsterAge, int hamsterWeight, String hamsterColor) {
        name = hamsterName;
    age = hamsterAge;
    weight = hamsterWeight;
    color = hamsterColor;
    }
}
