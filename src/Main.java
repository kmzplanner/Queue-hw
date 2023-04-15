import java.util.*;

public class Main {

    static List<Person> generateClients() {
        List<Person> newList = new LinkedList<>();
        newList.add(new Person("Petya", "Petrov", 1));
        newList.add(new Person("Olya", "Olgova", 2));
        newList.add(new Person("Tanya", "Tatyanova", 1));
        newList.add(new Person("Vika", "Viktorova", 2));
        newList.add(new Person("Lena", "Lenova", 1));
        return newList;
    }

    public static void main(String[] args) {

        Deque<Person> queue = new ArrayDeque<>();

        for (int i = 0; i < generateClients().size(); i ++){
            queue.offer(generateClients().get(i));
        }

        while (!queue.isEmpty()){
            Person a = queue.pollFirst();
            System.out.println(a.getName() + " " + a.getSurName() + " Прокатился на атракционе");
            int i = a.getNumberOfTickets();
            if( i != 1){
                i-=1;
                a.setNumberOfTickets(i);
                queue.addLast(a);
            } else {
                queue.remove(a);
            }
        }
    }
}
