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
      switch (string.toLowerCase()){
          case "ann":
          return  getAnnsTasks();
          case "bob":
          return  getBobsTasks();
          case "carol":
          return getCarolsTasks();
          case "all":
           Set<Task> allTasks = new HashSet<>(getAnnsTasks());
           allTasks.addAll(getBobsTasks());
           allTasks.addAll(getCarolsTasks());
          return allTasks;
          default:
              System.out.println("There is no such as " + string + " employee");
              return new HashSet<>();
      }
    }
    public Set<Task> getAllEmployeeTasks(){
        Set<Task> alltasks = new HashSet<>(annsTasks);
        alltasks.addAll(bobsTasks);
        alltasks.addAll(carolsTasks);
        return alltasks;
    }
    public Set<Task> getUnassignedTasks(){
        Set<Task> allTasks = getAllEmployeeTasks();
        Set<Task> assignedTasks = getUnion(annsTasks,bobsTasks,carolsTasks);
        allTasks.removeAll(assignedTasks);
        return  allTasks;
    }
    public Set<Task> getUnion(Set<Task>... sets){
        Set<Task> result = new HashSet<>();
        for (Set<Task> set: sets){
            result.addAll(set);
        }
        return  result;
    }
    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2, Set<Task> set3){
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        result.retainAll(set3);
        return result;
    }
    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2){
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return  result;
    }
}
