package com.company;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner reader = new Scanner(System.in);
        //This is a change
        //This is Newsha's changes
        System.out.println("Team Name: Null Pointers\n");


        Resume("Jonathan Rodriguez", "B.S. Computer Science & Engineering, University of California Merced","C/C++/Java","SQL",
                "SolidWorks", "-Sutter Health: Desktop Support Tech\n\t\t\t-Undergradute Research:Parallel Data Partitioning\n\t\t\t-UC Merced Dining: Student Supervisor");
        Resume("Newsha Tavakoli", "B.S. Biomedical Engineering, Georgia Tech","Java","Matlab",
                "MySQL", "-Problem Solver at Epic Systems");
        Resume("Josslyn Oringi", "B.S. Computer Science, University of North Texas","critical thinking","customer service",
                "leadership", "-Jostens: Servicedesk\n\t\t\t-Home Depot: IT Support\n\t\t\t-UNT: IT support");
        Resume("Mariano Lino", "B.S. Mechanical Engineering, Catholic University of America","SolidWorks","MATLAB",
                "Staff Training", "-Video Monitoring Agent/Trainer at NVMC\n\t\t\t-CAD Drafter at Aladdin Metal Products\n\t\t\t-Dishwasher/Cleaner at Jamaica's Finest");
        Resume("Toby Blanchard", "B.S. Computer Science, Northeastern Illinois University","Java","PHP",
                "Management, Leadership, & Training", "-Banker at JD Bank\n\t\t\t-Procurement Specialist at Citgo Refinery\n\t\t\t-Technical Assistant at NewPage Corp.");
        Resume("Amos Gichero", "Associates degree Computer Science, Chattahoochee Technical College","React & Redux","Javascript",
                "Node JS", " -Mobile App developer\n\t\t\t -Elutriation operator\n\t\t\t -Long Haul Truck Driver");
    }


    public static void Resume(String name, String Education, String skill1, String skill2, String skill3, String work){


        System.out.println("Name:\t\t" + name);
        System.out.println("Education:\t" + Education);
        //System.out.println("__________________________________________");
        System.out.println("Skills:\t\t" + skill1 + ", " + skill2 + ", " + skill3);
        System.out.println("Work Experience:\n\t\t\t" + work);
        System.out.println("--------------------------------------------------------");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    }
}
