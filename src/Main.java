import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Task task1 = new Task("PROJECT-A","ANNS-PROJECT", "ANNS", Priority.HIGH,Status.ASSIGNED );
       Task task2 = new Task("PROJECT-B","ANNS-PROJECT-2", "EMPTY", Priority.MED,Status.IN_PROGRESS);
       Task task3 = new Task("PROJECT-C","BOBS-PROJECT", "BOBS", Priority.LOW,Status.ASSIGNED );
       Task task4 = new Task("PROJECT-D","BOBS-PROJECT", "EMPTY", Priority.HIGH,Status.IN_QUEUE );
       Task task5 = new Task("PROJECT-E","CAROLS-PROJECT", "CAROLS", Priority.HIGH,Status.ASSIGNED );
       Task task6 = new Task("PROJECT-A","ANNS-PROJECT", "EMPTY", Priority.HIGH,Status.IN_QUEUE );

       Set<Task> annsTasks = new HashSet<>();
       annsTasks.add(task1);
       annsTasks.add(task2);
       annsTasks.add(task3);
       Set<Task> bobsTasks = new HashSet<>();
       bobsTasks.add(task3);
       bobsTasks.add(task4);
       bobsTasks.add(task5);
       Set<Task> carolsTasks = new HashSet<>();
       carolsTasks.add(task5);
       carolsTasks.add(task6);
       carolsTasks.add(task1);


       TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks);

        System.out.println("_________All_Employe_Data_________");
        System.out.println(taskData.getTasks("all"));

        System.out.println("_________Ann_Data_________");
        System.out.println(taskData.getTasks("ann"));

        System.out.println("_________Bob_Data_________");
        System.out.println(taskData.getTasks("bob"));

        System.out.println("_________Carol_Data_________");
        System.out.println(taskData.getTasks("carol"));

        System.out.println("_______Unassigned_Data?_______");
        System.out.println(taskData.getUnassignedTasks());

        System.out.println("_______Get_Union_______________");
        System.out.println(taskData.getUnion(annsTasks,bobsTasks,carolsTasks) + "List Size: " + taskData.getUnion(annsTasks,bobsTasks,carolsTasks).size());

        System.out.println("_______Get_Intersect_____________");
        System.out.println(taskData.getIntersect(annsTasks,bobsTasks,carolsTasks));
    }
}