import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Placement Eligibility Decision Engine");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear);

        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026);

        boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();

        boolean backlogPass = candidate.getBacklogs() <= job.getMaximumBacklogs();

        boolean yearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();

        boolean eligible = percentagePass && backlogPass && yearPass;

        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println(
                "Company   : [Infosys](https://app.kodnest.com/my-learning/class/4f10e9e8-4e25-4726-a240-8e3b97213076/module/f79105b6-0a13-48e9-bc83-d23471ccf378/topic/93dbd7a6-9937-4204-98ef-f1c88590fe42/sub-topic/13256ac8-e16a-48fa-9c33-a3545db64582/layout/1/content)");
        System.out.println("Role      : " + job.getRole());
        System.out.println();

        if (percentagePass) {
            System.out.println("Percentage      : PASS");
        } else {
            System.out.println("Percentage      : FAIL");
        }

        if (backlogPass) {
            System.out.println("Backlogs        : PASS");
        } else {
            System.out.println("Backlogs        : FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        sc.close();

    }
}