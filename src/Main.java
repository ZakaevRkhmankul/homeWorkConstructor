import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//MyClass деген класс тузунуз
//Ал класста озунуз жонундо маалымат сактаган полелер болсун
// (атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//Параметри эки башка болгон эки конструктор тузунуз
//MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//Эки объектке эки башка конструктор иштесин.
//Объекттердин маанилерин консольго чыгарыныз.
        MyClass myClass = new MyClass("Rahmankul", "Zhakaev", 21);
        System.out.println(
                "Name: "+myClass.name + "\n" +
                        "Last name: "+myClass.lastName + "\n" +
                       "Age: "+ myClass.age);// 1-object
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        String[] lessons = {"Java", "English", "Soft skilst"};
        MyClass myClass1 = new MyClass(lessons,"munty");
        System.out.println("Favority: "+myClass1.favoritуАood);
        for (int i = 0; i<myClass1.lessons.length;i++){
            System.out.print(myClass1.lessons[i]+" ");//2-object
        }


    }
}