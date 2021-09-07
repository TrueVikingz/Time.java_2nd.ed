public class Time {

    public static void main(String[] args) {

            //First variables.
            int hour = 18;
            int minute = 53;
            int second = 40;

            //Second variables.
            int hour1 = 20;
            int minute1 = 11;
            int second1 = 35;

            //Time calculations.
            double totaltime = 86400;
            double passedtime = (hour * 3600) + (minute * 60 + second);
            double remainingtime = totaltime - passedtime;
            double percentpassed = (passedtime / totaltime) * 100;
            double percentremaing = (remainingtime /totaltime) * 100;
            double worktime = ((hour1 - hour) * 3600) + ((minute1 - minute) * 60) + (second1 - second);

            //Intro
            System.out.println("Welcome back, and i hope you will like this!.");
            System.out.printf("\n");

            //Clock
            System.out.print("The current time is: ");
            System.out.print(hour);
            System.out.print(":");
            System.out.print(minute);
            System.out.println(".");

            //Number of seconds remaining of the day.
            System.out.print("Number of Seconds passed today: ");
            System.out.println(passedtime);
            System.out.print("Number of seconds remaining: ");
            System.out.println(remainingtime);

            //Percantage.
            System.out.print("The percentage of the day that has passed: ");
            System.out.print(percentpassed);
            System.out.println("%.");
            System.out.print("The percentage of the day that are remaining: ");
            System.out.print(percentremaing);
            System.out.println("%.");

            //Current time changes
            System.out.print("seconds that have passed working on this: ");
            System.out.print(worktime);
            System.out.println(" seconds.");
            System.out.println("I did however eat dinner in that timespectum.");

            //outro.
            System.out.println("\n");
            System.out.println("I hope you enjoyed this little app.");
            System.out.println("With best regards.");
            System.out.println("Tim.");
    }
}
