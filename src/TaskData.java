import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;

    private Set<Task> carolsTasks;


    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }



    public Set<Task> getTasks(String string){
      switch (string){
          case "ann":
          return  getAnnsTasks();
          case "bob":
          return  getBobsTasks();
          case "carol":
          return getCarolsTasks();
          case "all":
           Set<Task> allTasks = new HashSet<>();
           allTasks.addAll(getAnnsTasks());
           allTasks.addAll(getBobsTasks());
           allTasks.addAll(getCarolsTasks());

          return allTasks;
          default:
              return new HashSet<>();

      }
    }


}
