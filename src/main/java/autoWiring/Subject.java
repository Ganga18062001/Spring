package autoWiring;

import java.util.List;

public class Subject {
    private List<String> getSubject;

    public List<String> getGetSubject() {
        return getSubject;
    }

    public void setGetSubject(List<String> getSubject) {
        this.getSubject = getSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "getSubject=" + getSubject +
                '}';
    }
}
