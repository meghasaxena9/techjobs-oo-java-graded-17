package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     //   Employer Emp1 = new Employer("ACME");
      //  Employer Emp2 = new Employer("ACME");
     //   Location Loc1 = new Location("Desert");
     //   PositionType PP1 = new PositionType("Quality control");
     //   CoreCompetency CC1 = new CoreCompetency("Persistence");

      //  Job job4 = new Job("Product tester", Emp1, Loc1, PP1, CC1);


        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        System.out.println(job1.getEmployer().toString());

        for (Job job : jobs){
            System.out.println(job);
        }


    }

}
