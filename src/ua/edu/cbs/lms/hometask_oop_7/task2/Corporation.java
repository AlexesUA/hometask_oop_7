package ua.edu.cbs.lms.hometask_oop_7.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Corporation{
    private List <Worker> workers = new ArrayList<>();

    public Corporation(){}

    public boolean addWorker(){
        Scanner scInput = new Scanner(System.in);
        try{
            System.out.println("Enter worker data:");
            System.out.print("Enter last name:");
            String lastName = scInput.next();

            System.out.print("Enter first name:");
            String firstName = scInput.next();

            System.out.print("Enter middle name:");
            String middleName = scInput.next();

            System.out.print("Enter position:");
            String position = scInput.next();

            System.out.print("Enter the year the worker started working:");
            int yearStartWork = scInput.nextInt();

            Worker tempWorker = Worker.addWorker(new Person(lastName, firstName, middleName), position, yearStartWork);

            if(tempWorker != null) {
                workers.add(tempWorker);
                sortWorkers();
                return true;
            }

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
        return false;
    }

    public void sortWorkers(){
        Collections.sort(workers);
    }

    public void printWorkerOfExperience(int yearsExperience){
        for(Worker worker:workers){
            if(LocalDate.now().getYear() - worker.getYearStartingWork() > yearsExperience)
                System.out.println(worker);
        }
    }

}
