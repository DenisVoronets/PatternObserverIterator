import java.util.List;

public interface Observer {
     default void update(List<String> vacancies) {
    }
}
