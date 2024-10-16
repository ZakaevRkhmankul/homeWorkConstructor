public class MyClass {
//MyClass деген класс тузунуз
//Ал класста озунуз жонундо маалымат сактаган полелер болсун
// (атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//Параметри эки башка болгон эки конструктор тузунуз
//MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//Эки объектке эки башка конструктор иштесин.
//Объекттердин маанилерин консольго чыгарыныз.

    String name;
    String lastName;
    int age;
    String[] lessons;
    String favoritуАood;

    public MyClass(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public MyClass(String[] lessons, String favoritуАood) {
        this.lessons = lessons;
        this.favoritуАood=favoritуАood;
    }
}
