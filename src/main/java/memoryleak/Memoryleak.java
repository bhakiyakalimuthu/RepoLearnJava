package memoryleak;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-06-08
 */
public class Memoryleak {

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
//        final TaskCreator taskCreator = new TaskCreator(taskList);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100000; i++) {
//                    taskCreator.createTask();
//                }
//            }
//        }).start();
    }
    static class TaskList {
//        private static Deque<Task> tasks = new ArrayDeque<Task>();
//        public void addTask(Task task){
//            tasks.add(task);
//            tasks.peek().execute();//Memory leak!
//        }
    }
}
