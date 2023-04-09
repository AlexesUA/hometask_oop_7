package ua.edu.cbs.lms.hometask_oop_7.task2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Worker implements Comparable<Worker>{

    private Person worker;
    private String position;
    private int yearStartingWork;

    private Worker(Person worker, String position, int yearStartingWork){
        this.worker = worker;
        this.position = position;
        this.yearStartingWork = yearStartingWork;
    }

    public static Worker addWorker(Person worker, String position, int yearStartingWork) throws Exception {
        if(position.equals("")) throw new Exception("Position is not fill.");
        if(yearStartingWork < (LocalDate.now().getYear() - 50) || yearStartingWork > LocalDate.now().getYear())
            throw new Exception("Year start work not valid.");

        return new Worker(worker, position, yearStartingWork);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearStartingWork() {
        return yearStartingWork;
    }

    public void setYearStartingWork(int yearStartingWork) {
        this.yearStartingWork = yearStartingWork;
    }

    @Override
    public String toString() {
        return String.format("Worker %1$s works on %2$s position %3$s years.",
                worker, position, LocalDate.now().getYear() - yearStartingWork);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker1 = (Worker) o;
        return Objects.equals(worker, worker1.worker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, position, yearStartingWork);
    }

    @Override
    public int compareTo(Worker o) {
        return this.worker.compareTo(o.worker);
    }

}
