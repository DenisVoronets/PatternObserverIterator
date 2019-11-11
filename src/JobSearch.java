import java.util.ArrayList;
import java.util.List;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        List<Subscriber> subscriberList = new ArrayList<>();
        jobSite.addVacancy("First job Cook");
        jobSite.addVacancy("Second job PoliceMan");
        jobSite.addVacancy("Third job Driver");


        String[] skills1 = {"JapanKitchen","FranceKitchen","UkraineKitchen"};
        String[] skills2 = {"Shoot","Law","Power"};
        String[] skills3 = {"Car","Rules","Concentration"};


        subscriberList.add( new Subscriber("Denis",skills1));
        subscriberList.add( new Subscriber("Max",skills2));
        subscriberList.add( new Subscriber("Oleg",skills3));

        for (Subscriber subscriber : subscriberList) {
            jobSite.addObserver(subscriber);
            Iterator iterator = subscriber.getIterator();
            System.out.println("Worker: "+ subscriber.getName());
            while(iterator.hasNext()){
                System.out.println("Skills: "+ iterator.next().toString());
            }
        }






    }
}
