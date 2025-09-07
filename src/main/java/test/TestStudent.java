package src.main.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import src.main.java.base.Book;
import src.main.java.base.Student;

public class TestStudent {
        public static void main(String[] args) {


            Random rand = new Random();
            List<Student> sList = new ArrayList<>();
            for (int i=0,j=rand.nextInt(20)+20;i<j;i++){
                sList.add(new Student());
            }

            //Начало стрима

            sList.stream()
            .peek(student -> System.out.println(student))                                          //выведим имя студента и количество книг у данного студента(пока что 0)
            .peek(Student::add_books)                                                              //выдадим каждому студенту список книг
            //.peek(student -> System.out.println(student))                                        //убедимся что книги получены
            .flatMap(student -> student.getBooklist().stream())                                    //берем все книги у всех студентов
            .distinct()                                                                            //оставляем только уникальные книги
            .sorted(Comparator.comparing(Book::getPages))                                          //сортируем книги по страницам
            .toList()                                                                              //складываем все книги в один List
            .stream()                                                                              //делаем стрим с новым классом Book
            .filter(book -> book.getYear()>2000)                                                   //ограничиваем показ книг только для тех у кого год выпуска меньше 2000
            .limit(3)                                                                      //ограничиваем показ книг до трех
            //.peek(book -> System.out.println(book))                                              //можно посмотреть информацию о найденной книге
            .map(Book::getYear)                                                                    //насколько я понял, это метод короткого замыкания
            .findFirst()                                                                           //у первой найденной книги берем getYear
            .map(year -> "Год выпуска: " + year)                                                   //воспринимаем результат getYear как year
            .ifPresentOrElse(System.out::println,() -> System.out.println("Книга отсутствует")); //не знаю как проверить, но код рабочий
                                                                                                   
            
                                                                                                   //Пример вывода

                                                                                                   //Student A books:0
                                                                                                   //Student I books:0
                                                                                                   //Student G books:0
                                                                                                   //Student D books:0
                                                                                                   //Student H books:0
                                                                                                   //Student D books:0
                                                                                                   //Student F books:0
                                                                                                   //Student G books:0
                                                                                                   //Student G books:0
                                                                                                   //Student I books:0
                                                                                                   //Student J books:0
                                                                                                   //Student B books:0
                                                                                                   //Student A books:0
                                                                                                   //book3 Author: H.G Year: 2005 Pages: 20 Optional: Made in Russia Federation (строчка закоментирована, показывать не будет) //Optional добавил до того как прочитать про короткое замыкание
                                                                                                   //Год выпуска: 2005





    }
}
