import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    static String[] name = { "Emily","Hannah","Madison","Ashley","Sarah","Alexis","Samantha","Jessica","Elizabeth","Taylor","Lauren","Alyssa","Kayla","Abigail","Brianna","Olivia","Emma","Megan","Grace","Victoria","Rachel","Anna","Sydney","Destiny","Morgan","Jennifer","Jasmine","Haley","Julia","Kaitlyn","Nicole","Amanda","Katherine","Natalie","Hailey","Alexandra","Savannah","Chloe","Rebecca","Stephanie","Mackenzie", "Zoey", "Sarah", "Michelle", "Samantha", "Adam", "Alex", "Aaron", "Ben", "Carl", "Dan", "David", "Edward", "Fred", "Frank", "George", "Hal", "Hank", "Ike", "John", "Jack", "Joe", "Larry", "Monte", "Matthew", "Mark", "Nathan", "Otto", "Paul", "Peter", "Roger", "Roger", "Steve", "Thomas", "Tim", "Ty", "Victor", "Walter"};
    static String[] surname = { "Anderson", "Ashwoon", "Aikin", "Bateman", "Bongard", "Bowers", "Boyd", "Cannon", "Cast", "Deitz", "Dewalt", "Ebner", "Frick", "Hancock", "Haworth", "Hesch", "Hoffman", "Kassing", "Knutson", "Lawless", "Lawicki", "Mccord", "McCormack", "Miller", "Myers", "Nugent", "Ortiz", "Orwig", "Ory", "Paiser", "Pak", "Pettigrew", "Quinn", "Quizoz", "Ramachandran", "Resnick", "Sagar", "Schickowski", "Schiebel", "Sellon", "Severson", "Shaffer", "Solberg", "Soloman", "Sonderling", "Soukup", "Soulis", "Stahl", "Sweeney", "Tandy", "Trebil", "Trusela", "Trussel", "Turco", "Uddin", "Uflan", "Ulrich", "Upson", "Vader", "Vail", "Valente", "Van Zandt", "Vanderpoel", "Ventotla", "Vogal", "Wagle", "Wagner", "Wakefield", "Weinstein", "Weiss", "Woo", "Yang", "Yates", "Yocum", "Zeaser", "Zeller", "Ziegler", "Bauer", "Baxster", "Casal", "Cataldi", "Caswell", "Celedon", "Chambers", "Chapman", "Christensen", "Darnell", "Davidson", "Davis", "DeLorenzo", "Dinkins", "Doran", "Dugelman", "Dugan", "Duffman", "Eastman", "Ferro", "Ferry", "Fletcher", "Fietzer", "Hylan", "Hydinger", "Illingsworth", "Ingram", "Irwin", "Jagtap", "Jenson", "Johnson", "Johnsen", "Jones", "Jurgenson", "Kalleg", "Kaskel", "Keller", "Leisinger", "LePage", "Lewis", "Linde", "Lulloff", "Maki", "Martin", "McGinnis", "Mills", "Moody", "Moore", "Napier", "Nelson", "Norquist", "Nuttle", "Olson", "Ostrander", "Reamer", "Reardon", "Reyes", "Rice", "Ripka", "Roberts", "Rogers", "Root", "Sandstrom", "Sawyer", "Schlicht", "Schmitt", "Schwager", "Schutz", "Schuster", "Tapia", "Thompson", "Tiernan", "Tisler" };

    static ArrayList<Person> persons = new ArrayList<>(100);
    public static void main(String[] args) {

        for(int i = 0; i<100; i++){

            Person person = new Person(
                    name[Tech.getRandom(0, name.length-1)],
                    surname[Tech.getRandom(0, surname.length-1)],
                    Tech.getRandom(6, 130));

            person.setHeight();
            person.setWeight();

            persons.add(person);

        }

        callMenu();

    }

    private static void callMenu() {

        System.out.println("""
                Choose sort method to show Persons:\s
                press 1: sort by name
                press 2: sort by surname
                press 3: sort by age
                press 4: sort by weight
                press 5: sort by height""");

        int i = Tech.GetInputFunction();

        if(i==1){
            persons.stream()
                    .sorted(Comparator.comparing(Person::getName))
                    .toList()
                    .forEach(m -> System.out.println(m.toString()));
            callMenu();
        }else if(i==2){
            persons.stream()
                    .sorted(Comparator.comparing(Person::getSurname))
                    .toList()
                    .forEach(m -> System.out.println(m.toString()));
            callMenu();
        }else if(i==3) {
            persons.stream()
                    .sorted(Comparator.comparingInt(Person::getAge))
                    .toList()
                    .forEach(m -> System.out.println(m.toString()));
            callMenu();
        }else if(i==4) {
            persons.stream()
                    .sorted(Comparator.comparingDouble(Person::getWeight))
                    .toList()
                    .forEach(m -> System.out.println(m.toString()));
            callMenu();
        }else if(i==5) {
            persons.stream()
                    .sorted(Comparator.comparingDouble(Person::getHeight))
                    .toList()
                    .forEach(m -> System.out.println(m.toString()));
            callMenu();
        }

    }

}
