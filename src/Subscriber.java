
import java.util.List;

public class Subscriber implements Observer, Collection {
    private String name;
    private String[] skills;

    Subscriber(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public void update(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies\n" + vacancies +
                "\n======================================\n");
    }

    String getName() {
        return name;
    }
    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }


    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            System.out.println("____________________");
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
