package CollectionFrameWork.SetInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private final String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return  true;

        if (!(obj instanceof Person))return false;

        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Set<Person>set = new HashSet<>();
        System.out.println(set.add(new Person("Alice"))); // true
        System.out.println(set.add(new Person("Alice"))); // false
        System.out.println(set.size());
    }
}
