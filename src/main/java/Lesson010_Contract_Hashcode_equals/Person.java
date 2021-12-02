package Lesson010_Contract_Hashcode_equals;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
// {object} --> {int}
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
    Контракт hashcode() equals()
1)  У двух проверяемых объектов вызываем метод hashcode()
если хэши разные --> два объекта точно разные

P.s.: коллизия --- хэши одинаковые, а объекты разные
Хэш --- быстрый, но не точный

2) если хэши одинаковые --> equals()

Иквелс --- медленный и точный

3) equals() -->  выдаёт ответ
     */
}
