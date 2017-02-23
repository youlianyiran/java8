package com.atian.java8.collections;


import java.util.List;
import java.util.logging.Logger;

public class UseTasks {
    public static void main(String[] args) {
        List<Task> tasks = TaskSamples.getSampleTasks();

        double averageDuration = tasks.stream()
                .filter(Task::isActive)
                .mapToInt(Task::getDuration)
                .average()
                .getAsDouble();
        System.out.printf(
                "The average duration is %s%n",
                averageDuration);

//        Logger log = Logging.getLogger("mylogger");
//
//        for (Task t : tasks) {
//            log.finest(() -> {
//                return t.getName();
//            });
//        }
    }
}
