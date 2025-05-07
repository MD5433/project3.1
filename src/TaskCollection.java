import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskCollection implements Iterable<Task> {
    //from Task class
    private ArrayList<Task> tasks;

    public TaskCollection() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public int size() {
        return tasks.size();
    }

    public void sortTasks() {
        Collections.sort(tasks);
    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
}