package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Елена","Ольга","Роман","Алексей","Павел","Александр","Евгений","Владислав","Илья","Леонид","Ирина","Кристина","Антон","Михаил","Алексей","Сергей","Вадим","Александр","Анна","Николай","Анастасия","Сергей","Екатерина","Кирилл","Павел","Сергей","Алексей","Валерий","Никита","Павел","Иван","Ирина","Андрей","Юлия","Екатерина","Софья","Сергей","Александр","Алексей","Алиса","Александр","Мария","Светлана","Данил","Далер","Марат","Денис","Андрей","Светлана","Сергей","Алина");


        // Сколько у нас name в коллекции
        System.out.println(
                names.stream()
                .filter("Алексей"::equals)
                .count()
        );


        // Вернуть первое имя или null
        System.out.println(
                names.stream()
                .findFirst()
                .orElse(null)
        );


        // Вернуть два элемента начиная со второго
        System.out.println(
                Arrays.toString(names.stream()
                        .skip(1)
                        .limit(2)
                        .toArray())
        );


        // Выбрать все элементы по шаблону
        System.out.println(
                names.stream()
                .filter((s) -> s.contains("М"))
                .collect(Collectors.toList())
        );

    }

}
