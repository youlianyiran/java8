package com.atian.java8.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xutiantian on 2017/2/22.
 */
public class TaskSamples {
    public static List<Task> getSampleTasks() {

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1,true,3,"Defeat the Black Knight"));
        tasks.add(new Task(2,true,5,"Answer the bridgekeeper"));
        tasks.add(new Task(3,false,6,"Run away from killer rabbit"));
        tasks.add(new Task(4,true,4,"Lobbeth thou thy Holy Hand Grenade"));
        tasks.add(new Task(5,false,5,"Give a shrubbery to the Knights Who Say Ni!"));
        return tasks;
    }
}
